# Plan de Test — Singularity Reborn sur Quest 3
## Version : 2026-01-17 | Risque brick : ❌ ZÉRO

---

## ⚠️ Avant de commencer

### Prérequis
- [ ] Quest 3 avec root (Magisk)
- [ ] ADB connecté (`adb devices` doit lister le Quest)
- [ ] APK installé (`adb install -r app-debug.apk`)
- [ ] Batterie > 30%
- [ ] Aucune autre app de tweaking active

### Snapshot initial — À FAIRE EN PREMIER
```bash
adb shell "echo '=== TEMPS ==='; cat /sys/class/thermal/thermal_zone95/temp; cat /sys/class/thermal/thermal_zone97/temp; cat /sys/class/thermal/thermal_zone3/temp"
adb shell "echo '=== FAN ==='; cat /sys/class/thermal/cooling_device0/cur_state"
adb shell "dumpsys battery | head -20"
adb shell "echo '=== CPU ==='; cat /sys/devices/system/cpu/cpu0/cpufreq/scaling_cur_freq; cat /sys/devices/system/cpu/cpu0/cpufreq/scaling_governor"
adb shell "settings get global ota_update_server_url"
```

### Commandes d'urgence
```bash
# TOUT ARRÊTER
adb shell "am broadcast -a com.lumi.singularity.STOP_ALL -n com.lumi.singularity/.system.TweakService"
# Kill + reboot si bloqué
adb shell "am force-stop com.lumi.singularity"
adb reboot
```

### Monitoring continu (fenêtre séparée)
```bash
adb shell "while true; do echo '---'; date +%H:%M:%S; cat /sys/class/thermal/thermal_zone95/temp; cat /sys/class/thermal/cooling_device0/cur_state; sleep 10; done"
```
**🚨 SEUILS** : 🟢 < 45°C | 🟡 45-55°C | 🟠 55-65°C | 🔴 > 65°C → STOP_ALL

---


## PHASE 0 : Installation (5 min)

### Test 0.1 : Service démarre
```bash
adb shell "am start -n com.lumi.singularity/.MainActivity"
adb shell "dumpsys activity services | grep -A 5 TweakService"
```
✅ Expected : TweakService listé, START_STICKY

### Test 0.2 : Notification foreground
- Regarder la barre de notification → ✅ "Singularity" visible

---

## PHASE 1 : Features sans risque (30 min)

### Test 1.1 : RGB LED
```bash
adb shell "am broadcast -a com.lumi.singularity.START_RGB -n com.lumi.singularity/.system.TweakService --es COLOR '#FF0000' --ei BRIGHTNESS 127 --ei SPEED 3 --ei PATTERN 0"
adb shell "pgrep -f rgb_led.sh && echo RUNNING || echo STOPPED"
adb shell "am broadcast -a com.lumi.singularity.STOP_RGB -n com.lumi.singularity/.system.TweakService"
```

### Test 1.2 : Custom LED
```bash
adb shell "am broadcast -a com.lumi.singularity.START_CUSTOM_LED -n com.lumi.singularity/.system.TweakService --es COLORS '#FF0000,#00FF00,#0000FF' --ei SPEED 2"
adb shell "pgrep -f custom_led.sh && echo RUNNING || echo STOPPED"
adb shell "am broadcast -a com.lumi.singularity.STOP_CUSTOM_LED -n com.lumi.singularity/.system.TweakService"
```

### Test 1.3 : Power LED
```bash
adb shell "am broadcast -a com.lumi.singularity.START_POWER_LED -n com.lumi.singularity/.system.TweakService --es COLOR '#00FF00'"
adb shell "am broadcast -a com.lumi.singularity.STOP_POWER_LED -n com.lumi.singularity/.system.TweakService"
```

### Test 1.4 : OTA Blocker
```bash
adb shell "am broadcast -a com.lumi.singularity.BLOCK_OTA -n com.lumi.singularity/.system.TweakService"
adb shell "settings get global ota_update_server_url"
# Expected: http://127.0.0.1/
adb shell "am broadcast -a com.lumi.singularity.UNBLOCK_OTA -n com.lumi.singularity/.system.TweakService"
```

### Test 1.5 : USB Interceptor
```bash
adb shell "am broadcast -a com.lumi.singularity.START_USB_INTERCEPT -n com.lumi.singularity/.system.TweakService"
# Plug/unplug USB 10s
adb shell "am broadcast -a com.lumi.singularity.STOP_USB_INTERCEPT -n com.lumi.singularity/.system.TweakService"
```

### Test 1.6 : Proximity Sensor
```bash
adb shell "am broadcast -a com.lumi.singularity.DISABLE_PROX -n com.lumi.singularity/.system.TweakService"
adb shell "cmd sensorservice get-uid-state com.oculus.vrshell"
adb shell "am broadcast -a com.lumi.singularity.ENABLE_PROX -n com.lumi.singularity/.system.TweakService"
```

### Test 1.7 : Frida Server
```bash
adb shell "am broadcast -a com.lumi.singularity.START_FRIDA -n com.lumi.singularity/.system.TweakService"
adb shell "pgrep -f frida-server && echo RUNNING || echo STOPPED"
adb shell "am broadcast -a com.lumi.singularity.STOP_FRIDA -n com.lumi.singularity/.system.TweakService"
```

### 🛑 Checkpoint Phase 1
```bash
adb shell "am broadcast -a com.lumi.singularity.STOP_ALL -n com.lumi.singularity/.system.TweakService"
adb shell "ps -A | grep -E 'rgb_led|custom_led|power_led|usb_interceptor|frida-server' | wc -l"
# Expected: 0
```

---

## PHASE 2 : Features avec écriture sysfs (30 min)

### Test 2.1 : CPU Min Freq Lock
```bash
adb shell "am broadcast -a com.lumi.singularity.START_MIN_FREQ -n com.lumi.singularity/.system.TweakService --es FREQ 1200"
adb shell cat /sys/devices/system/cpu/cpu0/cpufreq/scaling_min_freq
adb shell "am broadcast -a com.lumi.singularity.STOP_MIN_FREQ -n com.lumi.singularity/.system.TweakService"
adb shell cat /sys/devices/system/cpu/cpu0/cpufreq/scaling_min_freq
# Expected: retour à ~300000
```

### Test 2.2 : CPU Max Freq Lock
```bash
adb shell "am broadcast -a com.lumi.singularity.START_MAX_FREQ -n com.lumi.singularity/.system.TweakService --es FREQ 1800"
adb shell cat /sys/devices/system/cpu/cpu0/cpufreq/scaling_max_freq
adb shell "am broadcast -a com.lumi.singularity.STOP_MAX_FREQ -n com.lumi.singularity/.system.TweakService"
```

### Test 2.3 : GPU Min Freq Lock
```bash
adb shell "am broadcast -a com.lumi.singularity.START_GPU_MIN_FREQ -n com.lumi.singularity/.system.TweakService --es FREQ 400"
adb shell cat /sys/class/kgsl/kgsl-3d0/devfreq/min_freq 2>/dev/null
adb shell "am broadcast -a com.lumi.singularity.STOP_GPU_MIN_FREQ -n com.lumi.singularity/.system.TweakService"
```

### Test 2.4 : GPU Max Freq Lock
```bash
adb shell "am broadcast -a com.lumi.singularity.START_GPU_MAX_FREQ -n com.lumi.singularity/.system.TweakService --es FREQ 600"
adb shell cat /sys/class/kgsl/kgsl-3d0/devfreq/max_freq 2>/dev/null
adb shell "am broadcast -a com.lumi.singularity.STOP_GPU_MAX_FREQ -n com.lumi.singularity/.system.TweakService"
```

### Test 2.5 : Charge Limit (80%)
```bash
# Quest branché, batterie > 80%
adb shell "am broadcast -a com.lumi.singularity.SET_CHARGE_LIMIT -n com.lumi.singularity/.system.TweakService --ei PERCENT 80"
adb shell "pgrep -f charge_limit.sh && echo RUNNING || echo STOPPED"
# Attendre 5 min → input_suspend doit passer à 1
adb shell cat /sys/class/power_supply/battery/input_suspend
# Stop (remet à 100%)
adb shell "am broadcast -a com.lumi.singularity.SET_CHARGE_LIMIT -n com.lumi.singularity/.system.TweakService --ei PERCENT 100"
adb shell cat /sys/class/power_supply/battery/input_suspend
# Expected: 0
```

### Test 2.6 : Fan Override ⚠️ (feature fixée aujourd'hui)
```bash
# État initial
adb shell "echo '=== BEFORE ==='; cat /sys/class/thermal/cooling_device0/cur_state"

# Niveau 1 (4000 RPM)
adb shell "am broadcast -a com.lumi.singularity.START_FAN_OVERRIDE -n com.lumi.singularity/.system.TweakService --ei TARGET_RPM 4000"
sleep 6
adb shell "echo '=== 4000 RPM (expected 1) ==='; cat /sys/class/thermal/cooling_device0/cur_state"

# Niveau 0 (3000 RPM = off/min)
adb shell "am broadcast -a com.lumi.singularity.START_FAN_OVERRIDE -n com.lumi.singularity/.system.TweakService --ei TARGET_RPM 3000"
sleep 6
adb shell "echo '=== 3000 RPM (expected 0) ==='; cat /sys/class/thermal/cooling_device0/cur_state"

# Niveau 4 (7500 RPM = max) — NE PAS LAISSER + 30s
adb shell "am broadcast -a com.lumi.singularity.START_FAN_OVERRIDE -n com.lumi.singularity/.system.TweakService --ei TARGET_RPM 7500"
sleep 6
adb shell "echo '=== 7500 RPM (expected 4) ==='; cat /sys/class/thermal/cooling_device0/cur_state"
# Écouter le bruit du ventilo

# Stop
adb shell "am broadcast -a com.lumi.singularity.STOP_FAN_OVERRIDE -n com.lumi.singularity/.system.TweakService"
```

### Test 2.7 : Fan Hot-Update RPM
```bash
# Démarrer à 4000 (level 1)
adb shell "am broadcast -a com.lumi.singularity.START_FAN_OVERRIDE -n com.lumi.singularity/.system.TweakService --ei TARGET_RPM 4000"
sleep 6
adb shell cat /sys/class/thermal/cooling_device0/cur_state
# Expected: 1

# Changer à 6500 SANS restart (level 3)
adb shell "am broadcast -a com.lumi.singularity.SET_FAN_RPM -n com.lumi.singularity/.system.TweakService --ei TARGET_RPM 6500"
sleep 6
adb shell cat /sys/class/thermal/cooling_device0/cur_state
# Expected: 3

adb shell "am broadcast -a com.lumi.singularity.STOP_FAN_OVERRIDE -n com.lumi.singularity/.system.TweakService"
```

### 🛑 Checkpoint Phase 2
```bash
adb shell "am broadcast -a com.lumi.singularity.STOP_ALL -n com.lumi.singularity/.system.TweakService"
sleep 5
adb shell "echo 'CPU min:'; cat /sys/devices/system/cpu/cpu0/cpufreq/scaling_min_freq"
adb shell "echo 'CPU max:'; cat /sys/devices/system/cpu/cpu0/cpufreq/scaling_max_freq"
adb shell "echo 'Fan:'; cat /sys/class/thermal/cooling_device0/cur_state"
adb shell "echo 'Charge:'; cat /sys/class/power_supply/battery/input_suspend"
```

---


## PHASE 3 : Features système (15 min)

### Test 3.1 : Persist Protect
```bash
adb shell "am broadcast -a com.lumi.singularity.START_PERSIST -n com.lumi.singularity/.system.TweakService"
adb shell "pgrep -f ovr_loader_override.sh && echo RUNNING || echo STOPPED"
adb shell "am broadcast -a com.lumi.singularity.STOP_PERSIST -n com.lumi.singularity/.system.TweakService"
```

### Test 3.2 : Hide MC2 (Link Fix)
```bash
adb shell "am broadcast -a com.lumi.singularity.START_HIDE_MC2 -n com.lumi.singularity/.system.TweakService"
adb shell "pgrep -f hide_mc2.sh && echo RUNNING || echo STOPPED"
adb shell "am broadcast -a com.lumi.singularity.STOP_HIDE_MC2 -n com.lumi.singularity/.system.TweakService"
```

### Test 3.3 : Charge Watch ⚠️ (feature fixée aujourd'hui)
```bash
# Nécessite de brancher/débrancher physiquement
adb shell "am broadcast -a com.lumi.singularity.START_PROX_CHARGE -n com.lumi.singularity/.system.TweakService"
# Brancher le câble USB → après 1.5s :
adb shell "logcat -d | grep -i 'automation_disable\|prox_close' | tail -5"
# Débrancher → après 1.5s :
adb shell "logcat -d | grep -i 'automation_disable\|prox_close' | tail -5"
# Test debounce : brancher/débrancher rapidement 3x → un seul prox_close final
adb shell "am broadcast -a com.lumi.singularity.STOP_PROX_CHARGE -n com.lumi.singularity/.system.TweakService"
```

### Test 3.4 : Meta Backdoors Block
```bash
adb shell "am broadcast -a com.lumi.singularity.BLOCK_BACKDOORS -n com.lumi.singularity/.system.TweakService"
adb shell "dumpsys package com.oculus.companion.server | grep -A 2 disabledComponents"
# Expected: DisabledDeviceJobService, RemoteWipeJobService, WipeReceiver disabled
```

### Test 3.5 : Desktop Passthrough
```bash
adb shell "am broadcast -a com.lumi.singularity.ENABLE_DT_PASSTHROUGH -n com.lumi.singularity/.system.TweakService"
adb shell "cmd sensorservice get-uid-state com.oculus.vrshell"
# Expected: FOREGROUND
adb shell "am broadcast -a com.lumi.singularity.DISABLE_DT_PASSTHROUGH -n com.lumi.singularity/.system.TweakService"
```

---

## PHASE 4 : On-Boot Restore (10 min)

### Test 4.1 : Persistence après reboot
```bash
# Via UI, activer "Fan Override on Boot" + "Charge Limit on Boot"
adb reboot
# Attendre 2 min après boot
adb shell "pgrep -f fan_override.sh && echo 'Fan: OK' || echo 'Fan: FAIL'"
adb shell "pgrep -f charge_limit.sh && echo 'Charge: OK' || echo 'Charge: FAIL'"
# Désactiver les on-boot après test
```

---

## PHASE 5 : Stress Test (15 min)
*Uniquement si Phases 1-4 OK*

### Test 5.1 : Combo features
Activer **simultanément** :
- Fan Override à 6500 RPM
- Charge Limit à 80%
- GPU Max Freq Lock à 600 MHz
- RGB LED

Lancer un jeu intensif 10 min (Beat Saber, VRChat, etc.)

```bash
# Monitoring pendant le test
adb shell "while true; do echo '---'; date +%H:%M:%S; cat /sys/class/thermal/thermal_zone95/temp; cat /sys/class/thermal/cooling_device0/cur_state; sleep 5; done"
```

✅ Succès : Temp < 55°C après 10 min  
❌ Échec : Temp > 60°C → STOP_ALL immédiat

### Test 5.2 : STOP_ALL sous charge
Pendant le stress test :
```bash
adb shell "am broadcast -a com.lumi.singularity.STOP_ALL -n com.lumi.singularity/.system.TweakService"
```
✅ Expected : Tout s'arrête en < 5s

---

## 🚨 Procédure d'urgence

### Si le Quest devient instable
```bash
# 1. STOP_ALL
adb shell "am broadcast -a com.lumi.singularity.STOP_ALL -n com.lumi.singularity/.system.TweakService"

# 2. Force stop
adb shell "am force-stop com.lumi.singularity"

# 3. Reboot
adb reboot

# 4. Boot loop → maintenir Power 30s pour hard reset
```

### Si température > 65°C
1. **Retirer le casque immédiatement**
2. STOP_ALL via adb
3. Laisser refroidir 5 min
4. Vérifier thermal governor actif :
```bash
adb shell "ls /sys/class/thermal/tz-by-name/ | wc -l"
# Expected: > 100
```

---

## ✅ Critères de succès globaux

| Critère | Requis |
|---------|--------|
| Aucune feature ne fait reboot le Quest | ✅ |
| STOP_ALL arrête tout proprement | ✅ |
| Températures < 60°C en idle avec features | ✅ |
| Chaque feature se désactive correctement | ✅ |
| On-boot restore fonctionne | ✅ |
| Stress test 10 min : temp < 55°C | ✅ |

---

## 📋 Checklist rapide

### Phase 1 (sans risque)
- [ ] 1.1 RGB LED
- [ ] 1.2 Custom LED
- [ ] 1.3 Power LED
- [ ] 1.4 OTA Blocker
- [ ] 1.5 USB Interceptor
- [ ] 1.6 Proximity Sensor
- [ ] 1.7 Frida
- [ ] STOP_ALL Phase 1 ✅

### Phase 2 (sysfs)
- [ ] 2.1 CPU Min Freq
- [ ] 2.2 CPU Max Freq
- [ ] 2.3 GPU Min Freq
- [ ] 2.4 GPU Max Freq
- [ ] 2.5 Charge Limit
- [ ] 2.6 Fan Override (niveaux 0,1,4)
- [ ] 2.7 Fan Hot-Update
- [ ] STOP_ALL Phase 2 ✅

### Phase 3 (système)
- [ ] 3.1 Persist Protect
- [ ] 3.2 Hide MC2
- [ ] 3.3 Charge Watch (debounce)
- [ ] 3.4 Backdoors Block
- [ ] 3.5 Desktop Passthrough

### Phase 4 (on-boot)
- [ ] 4.1 On-Boot Restore

### Phase 5 (stress)
- [ ] 5.1 Stress test 10 min
- [ ] 5.2 STOP_ALL sous charge

---

## 📝 Notes post-test

- Températures max observées : ___
- Features qui ont échoué : ___
- Comportements inattendus : ___
- Durée stress test avant throttle : ___

