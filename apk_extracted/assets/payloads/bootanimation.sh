#!/system/bin/sh
# desc: bind-mounts a custom boot animation (and sound overlay, if present) over the system defaults
# Extracts meta-horizonos.glb from staged assets and bind-mounts it over
# /system_ext/etc/bootanim/meta-horizonos.glb. If a StartupSoundOverlay.apk was
# also staged (custom zip pack has sound, or the built-in Oculus Logo choice),
# also sets up /data/adb/sound_overlay and bind-mounts it over /product/overlay,
# mirroring what the in-app "Boot Animation" Apply button does post-root.

ANIM_ASSET_SRC=/data/local/tmp/meta-horizonos.glb
ANIM_TARGET=/system_ext/etc/bootanim/meta-horizonos.glb
SOUND_APK_SRC=/data/local/tmp/StartupSoundOverlay.apk
SOUND_OVERLAY_DIR=/data/adb/sound_overlay
PRODUCT_OVERLAY=/product/overlay

log() { echo "[bootanimation] $*"; }

# ──  source file  ─────────────────────────────────────────────────────────────
if [ ! -f "$ANIM_ASSET_SRC" ]; then
    log "meta-horizonos.glb not found at $ANIM_ASSET_SRC — skipping mount"
elif [ ! -f "$ANIM_TARGET" ]; then
    log "Target $ANIM_TARGET does not exist — skipping mount"
else
    umount "$ANIM_TARGET" 2>/dev/null
    log "Mounting $ANIM_ASSET_SRC over $ANIM_TARGET"
    if mount -o bind "$ANIM_ASSET_SRC" "$ANIM_TARGET" 2>/data/local/tmp/ba_mnt_err; then
        log "Boot animation mount successful"
    else
        log "Mount failed: $(cat /data/local/tmp/ba_mnt_err 2>/dev/null)"
    fi
fi

MAGISK=/debug_ramdisk/magisk64

# ── sound overlay ─────────────────────────────────────────────────────────────
if [ -f "$SOUND_APK_SRC" ]; then
    if [ ! -d "$PRODUCT_OVERLAY" ]; then
        log "$PRODUCT_OVERLAY not present — skipping sound overlay"
    else
        log "Setting up sound overlay from $SOUND_APK_SRC"
        mkdir -p "$SOUND_OVERLAY_DIR"
        if grep -qE "^[^ ]+ $PRODUCT_OVERLAY " /proc/mounts; then
            umount -l "$PRODUCT_OVERLAY"
        fi
        if [ -z "$(ls -A "$SOUND_OVERLAY_DIR" 2>/dev/null)" ]; then
            cp -a "$PRODUCT_OVERLAY/." "$SOUND_OVERLAY_DIR/"
        fi
        "$MAGISK" --clone-attr "$PRODUCT_OVERLAY" "$SOUND_OVERLAY_DIR"
        cp "$SOUND_APK_SRC" "$SOUND_OVERLAY_DIR/StartupSoundOverlay.apk"
        "$MAGISK" --clone-attr "$PRODUCT_OVERLAY/PermissionControllerRRO.apk" "$SOUND_OVERLAY_DIR/StartupSoundOverlay.apk"
        if mount -o bind "$SOUND_OVERLAY_DIR" "$PRODUCT_OVERLAY" 2>/data/local/tmp/ba_sound_mnt_err; then
            log "Sound overlay mount successful"
        else
            log "Sound overlay mount failed: $(cat /data/local/tmp/ba_sound_mnt_err 2>/dev/null)"
        fi
    fi
else
    if grep -qE "^[^ ]+ $PRODUCT_OVERLAY " /proc/mounts; then
        log "No sound overlay for this selection — restoring real $PRODUCT_OVERLAY"
        umount -l "$PRODUCT_OVERLAY"
    fi
fi

rm -f /data/local/tmp/ba_mnt_err /data/local/tmp/ba_sound_mnt_err "$SOUND_APK_SRC"
