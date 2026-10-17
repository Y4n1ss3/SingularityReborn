#!/system/bin/sh
# desc: Active le clavier virtuel projeté (Virtual Keyboard) en français AZERTY
# Le clavier se projette sur une surface physique (table, bureau) avec hand tracking
# Nécessite root pour modifier les paramètres système Meta Horizon OS

set -u

log() { echo "[virtual_keyboard] $*"; }

log "Activation du clavier virtuel projeté français AZERTY..."

# 1. Activer le clavier virtuel projeté (Virtual Keyboard)
log "Activation du Virtual Keyboard..."
settings put global virtual_keyboard_enabled 1
settings put system virtual_keyboard_enabled 1

# 2. Configurer la langue du clavier virtuel en français
log "Configuration de la langue française..."
settings put secure virtual_keyboard_language "fr-FR"
setprop persist.oculus.virtual_keyboard.language "fr-FR"
setprop persist.oculus.virtual_keyboard.locale "fr_FR"

# 3. Appliquer le layout AZERTY
log "Configuration du layout AZERTY..."
settings put secure virtual_keyboard_layout "azerty"
settings put secure virtual_keyboard_layout_type "french"
setprop persist.oculus.virtual_keyboard.layout "azerty"
setprop persist.oculus.virtual_keyboard.layout_type "french"

# 4. Activer la détection de surface pour le clavier projeté
log "Activation de la détection de surface..."
settings put global virtual_keyboard_surface_detection 1
setprop persist.oculus.virtual_keyboard.surface_detection 1

# 5. Configurer le hand tracking pour le clavier virtuel
log "Configuration du hand tracking..."
settings put secure virtual_keyboard_hand_tracking 1
setprop persist.oculus.virtual_keyboard.hand_tracking 1

# 6. Désactiver le clavier IME 2D par défaut (optionnel)
log "Désactivation du clavier IME 2D..."
settings put secure show_ime_with_hard_keyboard 0

# 7. Redémarrer les services pour appliquer les changements
log "Redémarrage des services..."
am force-stop com.oculus.vr
sleep 2
am start -n com.oculus.vr/.OculusActivity

# 8. Vérifier la configuration
log "Vérification..."
VK_ENABLED=$(settings get global virtual_keyboard_enabled 2>/dev/null || echo "0")
VK_LANG=$(settings get secure virtual_keyboard_language 2>/dev/null || echo "unknown")
VK_LAYOUT=$(settings get secure virtual_keyboard_layout 2>/dev/null || echo "unknown")

log "Virtual Keyboard activé: $VK_ENABLED"
log "Langue: $VK_LANG"
log "Layout: $VK_LAYOUT"

if [ "$VK_ENABLED" = "1" ] && [ "$VK_LANG" = "fr-FR" ] && [ "$VK_LAYOUT" = "azerty" ]; then
    log "✅ Clavier virtuel projeté français AZERTY activé avec succès!"
    log "Tu peux maintenant projeter le clavier sur une surface avec le hand tracking."
    log "Fais le geste de pincement + rotation des poignets pour faire apparaître le clavier."
else
    log "⚠️ Configuration partiellement appliquée."
    log "Un redémarrage du casque peut être nécessaire."
fi

log "Terminé."
exit 0