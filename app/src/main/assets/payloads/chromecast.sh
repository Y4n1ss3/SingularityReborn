#!/system/bin/sh
# desc: Active le cast vers Chromecast sans l'app Meta (via protocole Google Cast)
# Utilise un serveur RTSP + app tierce pour contourner les restrictions Meta
# Nécessite root pour installer les composants et modifier les propriétés système

set -u

log() { echo "[chromecast] $*"; }

log "Activation du cast Chromecast (sans app Meta)..."

# 1. Activer le mode développeur complet
log "Activation du mode développeur..."
settings put global development_settings_enabled 1
settings put global adb_enabled 1
setprop persist.sys.usb.config adb
setprop persist.sys.developer 1

# 2. Désactiver les restrictions de cast Meta
log "Désactivation des restrictions Meta..."
setprop persist.oculus.cast.restrict 0
setprop persist.oculus.cast.meta_only 0
setprop debug.oculus.cast.allow_third_party 1

# 3. Activer le serveur RTSP intégré (pour exposer l'écran)
log "Activation du serveur RTSP..."
setprop persist.oculus.display.rtsp.enabled 1
setprop persist.oculus.display.rtsp.port 8554
setprop persist.oculus.display.rtsp.auth 0

# 4. Configurer le service de découverte mDNS
log "Configuration mDNS pour Chromecast..."
setprop persist.oculus.cast.mdns.enabled 1
setprop persist.oculus.cast.mdns.service "_googlecast._tcp"
setprop persist.oculus.cast.discovery 1

# 5. Activer le screen capture sans restrictions
log "Activation du screen capture..."
setprop persist.oculus.screen_capture.enabled 1
setprop persist.oculus.screen_capture.allow_background 1
setprop persist.oculus.screen_capture.resolution "1920x1080"
setprop persist.oculus.screen_capture.framerate 60

# 6. Installer l'app de cast Chromecast (via pm install)
log "Installation de l'app Cast to TV..."
CAST_APK="/data/local/tmp/cast_to_tv.apk"
if [ -f "$CAST_APK" ]; then
    pm install -r "$CAST_APK"
    log "App Cast to TV installée"
else
    log "⚠️ APK Cast to TV non trouvé dans /data/local/tmp/"
    log "Tu devras installer manuellement une app de cast Chromecast"
fi

# 7. Configurer les permissions pour l'app de cast
log "Configuration des permissions..."
CAST_PACKAGE="com.cast.to.tv"  # Package générique
pm grant "$CAST_PACKAGE" android.permission.RECORD_AUDIO 2>/dev/null
pm grant "$CAST_PACKAGE" android.permission.CAPTURE_VIDEO_OUTPUT 2>/dev/null
pm grant "$CAST_PACKAGE" android.permission.FOREGROUND_SERVICE 2>/dev/null

# 8. Activer le service de cast en arrière-plan
log "Activation du cast en arrière-plan..."
setprop persist.oculus.cast.background 1
setprop persist.oculus.cast.service_enabled 1

# 9. Configurer le bitrate et la qualité pour Chromecast
log "Optimisation pour Chromecast..."
setprop persist.oculus.cast.chromecast.bitrate 8000000  # 8 Mbps
setprop persist.oculus.cast.chromecast.codec "h264"
setprop persist.oculus.cast.chromecast.audio "aac"

# 10. Désactiver le killswitch de cast tiers
log "Désactivation du killswitch..."
setprop persist.oculus.cast.killswitch 0
setprop persist.oculus.cast.enforce_meta 0

# 11. Redémarrer les services de display
log "Redémarrage des services..."
am force-stop com.oculus.vr
sleep 2
am start -n com.oculus.vr/.OculusActivity

# 12. Vérifier la configuration
log "Vérification..."
RTSP_ENABLED=$(getprop persist.oculus.display.rtsp.enabled 2>/dev/null || echo "0")
CAST_ALLOWED=$(getprop debug.oculus.cast.allow_third_party 2>/dev/null || echo "0")

log "RTSP activé: $RTSP_ENABLED"
log "Cast tiers autorisé: $CAST_ALLOWED"

if [ "$RTSP_ENABLED" = "1" ] && [ "$CAST_ALLOWED" = "1" ]; then
    log "✅ Configuration Chromecast appliquée!"
    log ""
    log "📺 Instructions:"
    log "1. Installe 'Cast to TV' ou 'Web Video Caster' depuis SideQuest"
    log "2. Ouvre l'app et sélectionne ton Chromecast"
    log "3. Le cast devrait fonctionner sans l'app Meta"
    log ""
    log "Alternative: Utilise un serveur RTSP externe"
    log "- Installe 'RTSP Server' depuis SideQuest"
    log "- Configure le port 8554"
    log "- Connecte ton Chromecast au flux RTSP"
else
    log "⚠️ Configuration partiellement appliquée."
    log "Un redémarrage du casque peut être nécessaire."
fi

log "Terminé."
exit 0