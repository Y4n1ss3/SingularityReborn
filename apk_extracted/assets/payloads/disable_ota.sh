#!/system/bin/sh
# desc: Block OTA updates system-wide (package-restrictions + URL redirect)
# Disables com.oculus.updater via package-restrictions.xml, disables the
# NuxOta intent service, disables com.oculus.accountscenter, and redirects
# OTA URLs to localhost so firmware downloads cannot happen even if
# update_engine is running.
#
# Persistent across reboots (XML edit + settings global).
# A reboot is required for the package state change to fully take effect.

set -u

R=${IONSTACK_PAYLOAD_RESULT:-/dev/null}
res() { echo "$*" >> "$R"; }
die() { res "disable_ota=fail stage=$1 reason=$2"; echo "[disable-ota] FAIL ($1): $2"; exit 1; }
log() { echo "[disable-ota] $*"; }

[ "$(id -u 2>/dev/null)" = 0 ] || die prereq not_root

PKG_RESTRICT=/data/system/users/0/package-restrictions.xml
PKG_RESTRICT_COPY=${PKG_RESTRICT}.reservecopy

# --- 1. Disable com.oculus.updater via package-restrictions.xml --------------
for f in "$PKG_RESTRICT" "$PKG_RESTRICT_COPY"; do
    [ -f "$f" ] || { log "skip $f (not found)"; continue; }
    sed -i '/name="com\.oculus\.updater"/{s/enabled="1"/enabled="2"/;s/enabled="3"/enabled="2"/;/enabled="[23]"/!s/first-install-time/enabled="2" first-install-time/}' "$f" \
        && log "patched $f" \
        || log "WARNING: sed on $f returned non-zero"
done
res "disable_ota_pkg_restrict=ok"

# --- 2. Disable the NuxOta intent service ------------------------------------
pm disable --user 0 com.oculus.nux.ota/.NuxOtaIntentService 2>/dev/null \
    && log "disabled NuxOtaIntentService" \
    || log "WARNING: pm disable NuxOtaIntentService returned non-zero (may already be disabled)"
res "disable_ota_nux_ota=ok"

# --- 3. Disable Accounts Center ----------------------------------------------
su 1000 -c "pm disable com.oculus.accountscenter" 2>/dev/null \
    && log "disabled com.oculus.accountscenter" \
    || log "WARNING: pm disable com.oculus.accountscenter returned non-zero (may already be disabled)"
res "disable_ota_accountscenter=ok"

# --- 4. Redirect OTA URLs to localhost ---------------------------------------
settings put global ota_update_server_url "http://127.0.0.1/" 2>/dev/null \
    && log "ota_update_server_url -> 127.0.0.1" \
    || log "WARNING: settings put ota_update_server_url failed"
settings put global ota_download_url "http://127.0.0.1/" 2>/dev/null \
    && log "ota_download_url -> 127.0.0.1" \
    || log "WARNING: settings put ota_download_url failed"
res "disable_ota_urls=ok"
# --- 5. Set OculusPreferences to defer/suppress auto-updates ----------------
oculuspreferences --setc auto_up_defer_time_ms 999999999999 2>/dev/null \
    && log "auto_up_defer_time_ms -> 999999999999" \
    || log "WARNING: oculuspreferences auto_up_defer_time_ms failed"
oculuspreferences --setc app_auto_updates_enabled 0 2>/dev/null \
    && log "app_auto_updates_enabled -> 0" \
    || log "WARNING: oculuspreferences app_auto_updates_enabled failed"
oculuspreferences --setc update_before_shutdown_enabled 0 2>/dev/null \
    && log "update_before_shutdown_enabled -> 0" \
    || log "WARNING: oculuspreferences update_before_shutdown_enabled failed"
res "disable_ota_oculusprefs=ok"


log "done. A reboot is required for the package state change to fully take effect."
res "disable_ota=ok"
exit 0
