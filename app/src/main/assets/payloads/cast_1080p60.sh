#!/system/bin/sh
# desc: Débloque le cast en 1080p/60fps vers mobile (iPhone/Android)
# Meta bride le cast à 720p/30fps par défaut, ce payload force la haute qualité
# Nécessite root pour modifier les propriétés système

set -u

log() { echo "[cast_unlock] $*"; }

log "Activation du cast 1080p/60fps vers mobile..."

# 1. Débloquer la résolution du cast (720p → 1080p)
log "Configuration de la résolution 1080p..."
setprop persist.oculus.cast.resolution "1920x1080"
setprop persist.oculus.cast.width 1920
setprop persist.oculus.cast.height 1080
setprop debug.oculus.cast.resolution "1920x1080"

# 2. Activer le 60fps (bridé à 30fps par défaut)
log "Activation du 60fps..."
setprop persist.oculus.cast.framerate 60
setprop persist.oculus.cast.fps 60
setprop debug.oculus.cast.framerate 60
setprop debug.oculus.cast.fps 60

# 3. Augmenter le bitrate pour une meilleure qualité
log "Configuration du bitrate élevé..."
setprop persist.oculus.cast.bitrate 10000000  # 10 Mbps (défaut ~2-4 Mbps)
setprop persist.oculus.cast.quality "high"
setprop debug.oculus.cast.bitrate 10000000

# 4. Configuration spécifique pour le cast mobile
log "Optimisation pour mobile..."
setprop persist.oculus.cast.mobile.resolution "1920x1080"
setprop persist.oculus.cast.mobile.framerate 60
setprop persist.oculus.cast.mobile.bitrate 10000000
setprop persist.oculus.cast.mobile.codec "h264"

# 5. Désactiver les limitations automatiques
log "Désactivation des limitations..."
setprop persist.oculus.cast.auto_quality 0
setprop persist.oculus.cast.bandwidth_limit 0
setprop debug.oculus.cast.auto_quality 0

# 6. Configuration du codec vidéo
log "Configuration du codec H.264..."
setprop persist.oculus.cast.codec "h264"
setprop persist.oculus.cast.encoder "hardware"
setprop persist.oculus.cast.profile "high"
setprop persist.oculus.cast.level "4.1"

# 7. Optimisation réseau pour le cast
log "Optimisation réseau..."
setprop persist.oculus.cast.network_priority 1
setprop persist.oculus.cast.tcp_nodelay 1
setprop persist.oculus.cast.buffer_size 2097152  # 2MB buffer

# 8. Activer l'audio haute qualité
log "Configuration audio haute qualité..."
setprop persist.oculus.cast.audio.bitrate 320000  # 320 kbps
setprop persist.oculus.cast.audio.codec "aac"
setprop persist.oculus.cast.audio.sample_rate 48000

# 9. Désactiver la réduction automatique de qualité
log "Désactivation de la réduction automatique..."
setprop persist.oculus.cast.adaptive_bitrate 0
setprop persist.oculus.cast.thermal_throttle 0

# 10. Redémarrer le service de cast
log "Redémarrage du service de cast..."
am force-stop com.oculus.vr
sleep 2
am start -n com.oculus.vr/.OculusActivity

# 11. Vérifier la configuration
log "Vérification..."
RESOLUTION=$(getprop persist.oculus.cast.resolution)
FRAMERATE=$(getprop persist.oculus.cast.framerate)
BITRATE=$(getprop persist.oculus.cast.bitrate)

log "Résolution: $RESOLUTION"
log "Framerate: ${FRAMERATE}fps"
log "Bitrate: $((BITRATE / 1000000)) Mbps"

if [ "$RESOLUTION" = "1920x1080" ] && [ "$FRAMERATE" = "60" ]; then
    log "✅ Cast 1080p/60fps activé avec succès!"
    log "Ouvre l'app Meta Quest sur ton mobile et lance le cast."
    log "La qualité sera maintenant en Full HD 60fps."
else
    log "⚠️ Configuration partiellement appliquée."
    log "Un redémarrage du casque peut être nécessaire."
fi

log "Terminé."
exit 0