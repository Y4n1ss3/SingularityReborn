# 🔬 Reverse Engineering — Singularity APK

> **Document de référence technique** — Analyse approfondie du code source décompilé de `com.lumi.singularity` (v1.0.7.9, build 49).
>
> ⚠️ Ce document est destiné à la **compréhension interne** du fonctionnement de l'APK original. Il ne constitue ni un guide d'utilisation, ni une approbation de son déploiement.

---

## Table des matières

1. [Vue d'ensemble de l'APK](#1-vue-densemble-de-lapk)
2. [Architecture & Flux d'exécution](#2-architecture--flux-dexécution)
3. [Chaîne d'Exploit — Cheese (LPE Kernel)](#3-chaîne-dexploit--cheese-lpe-kernel)
4. [Chaîne d'Exploit — Fugu (DirtyFrag)](#4-chaîne-dexploit--fugu-dirtyfrag)
5. [Payloads Système](#5-payloads-système)
6. [Intégration Magisk](#6-intégration-magisk)
7. [Mapping Code → Scripts](#7-mapping-code--scripts)
8. [Persistance & Boot Flow](#8-persistance--boot-flow)
9. [Kill Switch & Blocage Internet](#9-kill-switch--blocage-internet)
10. [Télémétrie & Mises à jour](#10-télémétrie--mises-à-jour)
11. [Analyse de Sécurité](#11-analyse-de-sécurité)
12. [Glossaire](#12-glossaire)

---

## 1. Vue d'ensemble de l'APK

| Propriété | Valeur |
|-----------|--------|
| **Package** | `com.lumi.singularity` |
| **Version** | 1.0.7.9 (versionCode: 49) |
| **Taille** | 38.6 MB |
| **Min SDK** | Android 10+ (Quest OS basé sur Android) |
| **UI Framework** | Jetpack Compose (obfusqué R8) |
| **Langage** | Kotlin (compilé en DEX, obfusqué) |
| **Librairies natives** | `libexploit.so`, `libadb.so`, `libsingularity_root_helper.so`, `libtoolChecker.so` |
| **Superuser** | `com.topjohnwu.superuser` (libsuperuser) |
| **Root detection** | `com.scottyab.rootbeer` (RootBeer) |

### Fichiers DEX

| Fichier | Taille | Rôle |
|---------|--------|------|
| `classes.dex` | 17.8 MB | Code principal (UI, services, logique exploit) |
| `classes2.dex` | 3.1 MB | Classes secondaires (BootReceiver, TweakService, DnsBlockerService) |

### Bibliothèques natives (arm64-v8a)

| Bibliothèque | Taille | Fonction |
|-------------|--------|----------|
| `libexploit.so` | 25 KB | **Exploit kernel LPE** — élévation de privilèges locale |
| `libadb.so` | 3.3 MB | Serveur ADB embarqué (ADB sans fil) |
| `libsingularity_root_helper.so` | 532 KB | Helper pour les commandes root |
| `libtoolChecker.so` | 5.5 KB | Vérification de la présence d'outils (busybox, su, etc.) |

---

## 2. Architecture & Flux d'exécution

### Diagramme de flux principal

```
┌─────────────────────────────────────────────────────────────────┐
│                        MainActivity                              │
│  1. Détection du device (codename: eureka/panther/hollywood)    │
│  2. Vérification root (RootBeer)                                │
│  3. Sélection de l'exploit (Cheese ou Fugu)                     │
│  4. Staging des payloads → /data/local/tmp/                     │
│  5. Lancement de l'exploit                                      │
└──────────────────────────┬──────────────────────────────────────┘
                           │
              ┌────────────┴────────────┐
              │                         │
    ┌─────────▼──────────┐   ┌─────────▼──────────┐
    │   CHEESE (LPE)     │   │   FUGU (DirtyFrag) │
    │  libexploit.so     │   │  fugu + dfpoison   │
    │  cheese_launch.sh  │   │  e2e.dex            │
    │  cheese_root.sh    │   │  run.sh             │
    └─────────┬──────────┘   └─────────┬──────────┘
              │                         │
              └────────────┬────────────┘
                           │ root obtenu (uid=0)
                           │
              ┌────────────▼────────────┐
              │   cheese_root.sh        │
              │  • setenforce 0         │
              │  • disable OTA updater  │
              │  • remove killswitch    │
              │  • protect boot parts   │
              │  • exec payload_chain   │
              └────────────┬────────────┘
                           │
              ┌────────────▼────────────┐
              │   payload_chain.sh      │
              │  • singularity_magisk   │
              │  • persistent_port      │
              │  • disable_ota          │
              │  • bootanimation        │
              │  • (custom payloads)    │
              └─────────────────────────┘
```

### Flux de staging (MainActivity)

Lorsqu'on appuie sur "Root", l'activité principale extrait les assets vers `/data/local/tmp/` :

```

---

## 3. Chaîne d'Exploit — Cheese (LPE Kernel)

### Vue d'ensemble

**Cheese** est un exploit d'élévation de privilèges locale (LPE) qui exploite une vulnérabilité du kernel Linux pour obtenir `root` (uid=0). C'est l'exploit **rapide** — il fonctionne en quelques secondes.

### Composants

| Fichier | Taille | Rôle |
|---------|--------|------|
| `libexploit.so` | 25 KB | Binaire natif contenant l'exploit kernel |
| `cheese_launch.sh` | 211 B | Script de lancement — passe le relais à `cheese_root.sh` |
| `cheese_root.sh` | 1.4 KB | Script post-exploit — configure le système et lance la chaîne de payloads |
| `busybox` | 1.7 MB | Boîte à outils Unix standalone (ash, mount, setsid, nsenter...) |

### cheese_launch.sh — Le déclencheur

```bash
#!/system/bin/sh
cd "$(dirname "$0")"
umask 000
export ASH_STANDALONE=1

echo "cheese: got root, handing off..."
exec ./busybox setsid ./busybox nsenter -m/proc/1/ns/mnt \
  "$PWD/busybox" sh "$PWD/cheese_root.sh"
```

**Analyse :**
1. `setsid` — Crée une nouvelle session (détache du processus parent)
2. `nsenter -m/proc/1/ns/mnt` — Entre dans le **namespace de montage du processus init** (PID 1)
3. Exécute `cheese_root.sh` dans le contexte du namespace mount global

Cela signifie que `libexploit.so` a déjà obtenu root **avant** que `cheese_launch.sh` ne soit exécuté. Le script ne fait que **changer de namespace** pour que les montages soient visibles globalement.

### cheese_root.sh — Post-exploitation

Une fois root obtenu dans le bon namespace :

```bash
# 1. Forcer SELinux en mode permissive
if [ -f /sys/fs/selinux/enforce ] && \
   [ "$(cat /sys/fs/selinux/enforce 2>/dev/null)" != "0" ]; then
  setenforce 0 2>/dev/null || echo 0 > /sys/fs/selinux/enforce 2>/dev/null
fi

# 2. Désactiver l'updater OTA (empêcher le patch de l'exploit)
pm disable-user --user 0 com.oculus.updater 2>/dev/null
pm enable com.oculus.nux.ota 2>/dev/null

# 3. Supprimer le killswitch Meta
if [ -f /persist/srt_push/token ]; then
  rm -f /persist/srt_push/token
fi

# 4. Protéger les partitions boot (anti-brick accidentel)
for slot in a b; do
  src="/dev/block/by-name/boot_$slot"
  dst="/dev/block/by-name/DO_NOT_FLASH_boot_$slot"
  if [ -e "$src" ] && [ ! -e "$dst" ]; then
    mv "$src" "$dst" 2>/dev/null
    ln -s "/dev/does/not/exist_$slot" "$src" 2>/dev/null
  fi
done

# 5. Exécuter la chaîne de payloads
if [ -f /data/local/tmp/payload_chain.sh ]; then
  sh /data/local/tmp/payload_chain.sh
fi
```

**Points clés :**
- **Killswitch** : `/persist/srt_push/token` est le mécanisme de Meta pour bricker/forcer une MAJ à distance. Sa suppression neutralise cette capacité.
- **Boot protection** : Les partitions `boot_a`/`boot_b` sont renommées et remplacées par des liens symboliques pointant vers un device inexistant. Empêche tout flashing accidentel.
- **OTA immediate** : `com.oculus.updater` est désactivé **immédiatement** pour empêcher une MAJ qui patcherait la vulnérabilité exploitée.

1. singularity_magisk.sh   → /data/local/tmp/singularity_magisk.sh
2. persistent_port.sh      → /data/local/tmp/persistent_port.sh
3. disable_ota.sh          → /data/local/tmp/disable_ota.sh
4. <exploit>.sh            → /data/local/tmp/<exploit>.sh
5. bootanimation.sh        → /data/local/tmp/bootanimation.sh
6. meta-horizonos.glb      → /data/local/tmp/meta-horizonos.glb
7. payload_chain.sh        → /data/local/tmp/payload_chain.sh (généré dynamiquement)
8. singularity-Magisk.apk  → /data/local/tmp/singularity-Magisk.apk
```

Le `payload_chain.sh` est **généré dynamiquement** par l'application. Il commence par :
```bash
#!/system/bin/sh
if [ -f /persist/srt_push/token ]; then rm -f /persist/srt_push/token; echo 'Killswitch token removed successfully.'; fi
```

---

## 4. Chaîne d'Exploit — Fugu (DirtyFrag)

### Vue d'ensemble

**Fugu** est un exploit plus sophistiqué basé sur **DirtyFrag**, une vulnérabilité du subsystem IPsec du kernel Linux. Il cible spécifiquement les kernels `5.10.237` des Meta Quest. Contrairement à Cheese, Fugu est exécuté **via ADB** depuis un hôte externe.

### Composants

| Fichier | Taille | Rôle |
|---------|--------|------|
| `fugu` | 57 KB | Binaire principal de l'exploit |
| `dfpoison` | 300 KB | Outil natif pour l'injection/restauration de code |
| `e2e.dex` | 9.5 KB | Code DEX Java pour le stager IPsec |
| `run.sh` | 17 KB | Script d'orchestration principal |
| `targets/` | ~174 dirs | Configurations par firmware (Q2: 43, Q3: 101, QPro: 30) |

### Architecture de l'exploit

```
┌─────────────────────────────────────────────────────┐
│                    FUGU EXPLOIT                       │
├─────────────────────────────────────────────────────┤
│  1. IPsec Transform Allocation                        │
│     → SPI fixe (0xdeadbe10) via e2e.dex (q3.Stager) │
│                                                       │
│  2. DirtyFrag — Kernel Memory Corruption              │
│     → sa_spi: 0xdeadbe10 (source)                    │
│     → writer_spi: 0xdeadbe11 (destination)           │
│     → keymat_base: 0x41 (pattern d'écriture)         │
│                                                       │
│  3. Carrier Module (llcc_perfmon.ko / usbip-vudc.ko) │
│     → Module kernel chargé via insmod_sh             │
│     → Ancré sur __platform_driver_register           │
│                                                       │
│  4. Inject Library (libeva.so)                        │
│     → .init_array hook → code au chargement          │
│     → Stub gap: 1816 bytes pour le payload           │
│                                                       │
│  5. Post-exploitation                                 │
│     → SELinux → permissive / cred override → uid=0   │
│     → handoff vers cheese_root.sh                    │
└─────────────────────────────────────────────────────┘
```

### Format des fichiers target (JSON)

Chaque firmware a un JSON décrivant les offsets kernel. Exemple pour Quest 3 :

```json
{
  "name": "q3_51943020036500520",
  "description": "build 51943020036500520, kernel 5.10.237-g52969c0cb440",
  "device": {
    "build_incremental": "51943020036500520",
    "vermagic": "5.10.237-g52969c0cb440"
  },
  "dirtyfrag": {
    "sa_spi": "0xdeadbe10",
    "writer_spi": "0xdeadbe11",
    "keymat_base": "0x41"
  },
  "kernel": {
    "anchor_symbol": "__platform_driver_register",
    "cred_off": "0x778",
    "cred_security_off": "0x78",
    "delta_selinux_from_anchor": "0x1ecf1d0",
    "delta_findvpid_from_anchor": "0xff788f88",
    "delta_pidtask_from_anchor": "0xff5b6640",
    "delta_ssuse_from_anchor": "0xffcc4fa8"
  },
  "carrier": {
    "device_path": "/vendor/lib/modules/llcc_perfmon.ko",
    "local_ko": "q3_51943020036500520/llcc_perfmon.ko",
    "anchor_reloc_off": "0x14"
  },
  "inject_lib": {
    "device_path": "/system/lib64/libeva.so",
    "init_array_off": "0xd3060",
    "orig_ctor_off": "0x4139c",
    "stub_gap_off": "0x478e8",
    "stub_gap_size": 1816
  },
  "cred_carrier": {
    "device_path": "/vendor/lib/modules/usbip-vudc.ko",
    "note": "not-loaded cred carrier"
  }
}
```

**Champs critiques :**
- `dirtyfrag` — Paramètres de l'exploit IPsec (SPI addresses, key material)
- `kernel` — Offsets pour `cred`, `selinux_enforce`, `task_struct` dans le kernel
- `carrier` — Module kernel à charger comme vecteur d'exécution
- `inject_lib` — Bibliothèque cible pour le hook `.init_array`
- `cred_carrier` — Module kernel "dormant" comme porteur de credentials

### Support firmware

| Device | Targets | Plage de builds |
|--------|---------|-----------------|
| **Quest 3** (`q3`) | 101 | `5194302...` à `5227074...` |
| **Quest 2** (`q2`) | 43 | `5083785...` à `5224299...` |
| **Quest Pro** (`QPro`) | 30 | `5148362...` à `5150387...` |

### run.sh — Mécanismes de robustesse

1. **`reap_stale_stagers()`** — Tue les processus orphelins `q3.Stager` qui maintiennent le SPI IPsec (0xdeadbe10) occupé, empêchant toute nouvelle tentative.

2. **Inject-restore** — Après l'exploitation, restaure `libeva.so` via `dfpoison` natif pour qu'un re-mapping ultérieur ne XOR-pas le carrier.


---

## 5. Payloads Système

### 5.1 — singularity_magisk.sh (Installation Magisk)

**Le payload le plus complexe** (~320 lignes). Installe un fork personnalisé de Magisk v30.7 **sans patcher le boot image**.

#### Flux d'installation

```
1. Prérequis
   ├── Vérifier root (uid=0)
   ├── Vérifier SELinux enforce=0
   ├── Vérifier que l'APK Magisk est présent
   └── Vérifier que /data est monté

2. Idempotence
   └── Si magiskd tourne déjà → exit 0

3. Extraction des binaires depuis l'APK
   ├── lib/arm64-v8a/libmagisk.so       → /data/adb/magisk/magisk64
   ├── lib/arm64-v8a/libmagiskboot.so   → /data/adb/magisk/magiskboot
   ├── lib/arm64-v8a/libmagiskinit.so   → /data/adb/magisk/magiskinit
   ├── lib/arm64-v8a/libmagiskpolicy.so → /data/adb/magisk/magiskpolicy
   └── assets/busybox                   → /data/adb/magisk/busybox (OBLIGATOIRE)

4. Setup de l'environnement Magisk
   ├── Créer /data/adb/magisk/merge_mnt
   ├── Créer /data/adb/modules
   ├── Setup preinit mirror
   └── Setup systemless hosts

5. Politique SELinux
   └── magiskpolicy --live --magisk

6. Boot stages
   ├── (opt) stop zygote → pour Zygisk global
   ├── magisk --post-fs-data  → monte tmpfs, démarre magiskd
   ├── (opt) start framework
   ├── magisk --service
   └── magisk --boot-complete

7. Post-install
   ├── Disable com.oculus.updater dans package-restrictions.xml
   ├── pm disable com.oculus.nux.ota/.NuxOtaIntentService
   └── Cleanup fichiers temporaires
```

#### Points critiques

- **`busybox` est obligatoire** : Le daemon Magisk abort en safe mode si `/data/adb/magisk/busybox` n'existe pas.
- **`SL_RESTART_ZYGOTE`** : Par défaut `0`. Si `1`, arrête le framework pour que Zygisk s'applique à tous les processus. Le casque est inutilisable pendant ~30s.
- **Fork personnalisé** : `com.singularity.magisk` (v30.7, versionCode 30700) avec fix Zygisk pour Quest.

### 5.2 — disable_ota.sh (Blocage OTA)

**5 niveaux de protection** contre les mises à jour :

```
Niveau 1: package-restrictions.xml
  → sed: enabled="1" → enabled="2" pour com.oculus.updater
  → Persistant: modifie le XML directement

Niveau 2: NuxOta Intent Service
  → pm disable com.oculus.nux.ota/.NuxOtaIntentService

Niveau 3: Accounts Center
  → pm disable com.oculus.accountscenter (user 1000)

Niveau 4: URL Redirect
  → settings put global ota_update_server_url "http://127.0.0.1/"
  → settings put global ota_download_url "http://127.0.0.1/"

Niveau 5: OculusPreferences
  → auto_up_defer_time_ms = 999999999999
  → app_auto_updates_enabled = 0
  → update_before_shutdown_enabled = 0
```

### 5.3 — bootanimation.sh (Animation de boot)

Remplace l'animation de boot Meta Horizon par bind-mount :

```
1. Bind-mount du .glb
   /data/local/tmp/meta-horizonos.glb → /system_ext/etc/bootanim/meta-horizonos.glb

2. (Optionnel) Sound overlay
   → Extrait StartupSoundOverlay.apk
   → Copie /product/overlay/ dans /data/adb/sound_overlay/
   → Bind-mount /data/adb/sound_overlay/ → /product/overlay/
```

### 5.4 — persistent_port.sh (ADB persistant)

```bash
runcon u:r:init:s0 setprop persist.adb.tcp.port 5555
```

Configure le device pour écouter en permanence sur le port TCP 5555 pour ADB. Utilise `runcon` pour exécuter dans le contexte `init` (contournement SELinux).

### 5.5 — wake.sh (Réveil)

```bash
input keyevent KEYCODE_WAKEUP
svc wifi enable
```

Réveille l'écran et réactive le Wi-Fi.

### 5.6 — soft_reboot.sh (Soft reboot)

```bash
sleep 2
killall zygote64
```

Tue zygote pour forcer un soft-reboot. "Band-aid" pour activer Zygisk dans Magisk.

### 5.7 — disable_wifi.sh

```bash
svc wifi disable
```


---

## 6. Intégration Magisk

### Module systemless hosts

```
id=singularity-hosts
name=Systemless Hosts - Singularity
version=1.0
author=Lumince
description=Customized Domain Blocker - Don't Manage Here
```

Le module fournit un fichier `hosts` systemless éditable via l'interface Domain Blocker, sans modifier la partition système.

### Zygisk

Le fichier `Zygisk.ko` (132 KB) est un module noyau pour l'injection de code dans les processus Android via le mécanisme Zygisk de Magisk.

### Structure post-installation

```
/data/adb/
├── magisk/
│   ├── magisk64          # Daemon principal
│   ├── magiskboot        # Outil boot image
│   ├── magiskinit        # Init patcher
│   ├── magiskpolicy      # Compilateur de politique SELinux
│   ├── busybox           # Busybox (obligatoire)
│   └── merge_mnt/        # Point de montage merge
├── modules/              # Modules Magisk installés
│   └── singularity-hosts/
│       ├── module.prop
│       └── system/etc/hosts
└── sound_overlay/        # Overlay son personnalisé

/debug_ramdisk/
├── magisk64              # Daemon en cours d'exécution
└── .magisk/              # État interne de Magisk
```

---

## 7. Mapping Code → Scripts

### Services Android

| Service | Classe | Actions | Scripts associés |
|---------|--------|---------|-----------------|
| **TweakService** | `com.lumi.singularity.system.TweakService` | `START_RGB_LED`, `START_CUSTOM_LED`, `START_POWER_LED`, `START_MIN_FREQ_LOCK`, `START_MAX_FREQ_LOCK`, `START_USB_INTERCEPTOR`, `START_OTA_BLOCKER`, `START_PROX_CHARGE_WATCH`, `START_PERSIST_PROTECT`, `START_LINK_FIX` | `rgb_led.sh`, `custom_led.sh`, `power_led.sh`, `min_freq_lock.sh`, `max_freq_lock.sh`, `usb_interceptor.sh`, `ota_blocker.sh`, `persist_protect.sh` |
| **DnsBlockerService** | `com.lumi.singularity.system.DnsBlockerService` | `START_KILL_SWITCH`, `STOP_KILL_SWITCH` | VPN null-routing (pas de script) |
| **BootReceiver** | `com.lumi.singularity.system.BootReceiver` | `BOOT_COMPLETED` | Orchestre tous les services au démarrage |

### Préférences partagées (`singularity_prefs`)

| Clé | Type | Effet au boot |
|-----|------|---------------|
| `root_on_boot` | boolean | Relance l'exploit pour obtenir root |
| `blocker_on_boot` | boolean | Active le DNS blocker (kill switch) |
| `rgb_on_boot` | boolean | Démarre le script RGB LED |
| `custom_led_on_boot` | boolean | Démarre le custom LED script |
| `power_led_on_boot` | boolean | Démarre le power LED script |
| `min_freq_on_boot` | boolean | Active le min frequency lock |
| `wireless_adb_on_boot` | boolean | Active l'ADB sans fil |
| `cycle_wifi_on_boot` | boolean | Cycle le Wi-Fi |
| `root_blocker_on_boot` | boolean | Active le root blocker |
| `root_blocker_setup` | boolean | Configure le root blocker |
| `usb_interceptor_on_boot` | boolean | Active l'USB interceptor |
| `ota_blocker_on_boot` | boolean | Active le bloqueur OTA |
| `prox_charge_watch_on_boot` | boolean | Active la surveillance proximity/charge |
| `persist_protect_on_boot` | boolean | Active la protection persist |
| `start_on_boot` | boolean | Lance l'app au démarrage |
| `start_app_on_boot` | string | Package name de l'app à lancer |

### Scripts générés par TweakService

TweakService crée dynamiquement des scripts shell dans `getFilesDir()` :

| Fichier | Action | Description |
|---------|--------|-------------|
| `rgb_led.sh` | `START_RGB_LED` | Animation LED RGB cyclique |
| `custom_led.sh` | `START_CUSTOM_LED` | Couleur LED personnalisée (R,G,B) |
| `power_led.sh` | `START_POWER_LED` | Contrôle LED d'alimentation |
| `min_freq_lock.sh` | `START_MIN_FREQ_LOCK` | Verrouille la fréquence CPU minimum |
| `max_freq_lock.sh` | `START_MAX_FREQ_LOCK` | Verrouille la fréquence CPU maximum |
| `usb_interceptor.sh` | `START_USB_INTERCEPTOR` | Intercepte les connexions USB |
| `ota_blocker.sh` | `START_OTA_BLOCKER` | Bloqueur OTA persistant |
| `persist_protect.sh` | `START_PERSIST_PROTECT` | Protège la partition /persist |
| `gpu_min_freq_lock.sh` | GPU min freq | Verrouille la fréquence GPU minimum |
| `gpu_max_freq_lock.sh` | GPU max freq | Verrouille la fréquence GPU maximum |
| `fan_override.sh` | Fan control | Contrôle du ventilateur |
| `charge_limit.sh` | Charge limit | Limite de charge batterie |
| `hide_mc2.sh` | Hide MC2 | Cache le service MC2 |


---

## 8. Persistance & Boot Flow

### BootReceiver — Le gardien

Le `BootReceiver` écoute `android.intent.action.BOOT_COMPLETED` et restaure **tous les tweaks activés** :

```
BOOT_COMPLETED reçu
    │
    ├── Lecture de "singularity_prefs"
    │
    ├── Pour chaque tweak activé:
    │   ├── root_on_boot     → Exécution de l'exploit (libexploit.so)
    │   ├── rgb_on_boot      → START_RGB_LED (TweakService)
    │   ├── custom_led_on_boot → START_CUSTOM_LED
    │   ├── power_led_on_boot → START_POWER_LED
    │   ├── min_freq_on_boot → START_MIN_FREQ_LOCK
    │   ├── wireless_adb_on_boot → Activation ADB sans fil
    │   ├── ota_blocker_on_boot → START_OTA_BLOCKER
    │   ├── blocker_on_boot  → START_KILL_SWITCH (DnsBlockerService)
    │   ├── root_blocker_on_boot → Root blocker
    │   ├── usb_interceptor_on_boot → START_USB_INTERCEPTOR
    │   ├── persist_protect_on_boot → START_PERSIST_PROTECT
    │   └── start_app_on_boot → Lancement de l'app configurée
    │
    └── Services en arrière-plan démarrés
```

### TweakService — Le moteur

Service Android en foreground (notification ID 2) qui :
1. Gère les scripts shell dynamiques
2. Maintient les watchers (OTA blocker, USB interceptor, etc.)
3. Surveille les changements d'état (connexion USB, apps visibles)
4. Utilise des coroutines Kotlin pour l'exécution asynchrone

### Cycle de vie

```
onCreate()
  ├── startForeground(2, notification)
  ├── Vérifie prox_sensor_disabled
  └── Démarre charge notification watcher

onStartCommand(intent)
  └── Dispatch vers l'action demandée:
      ├── START_RGB_LED → Exécute rgb_led.sh en boucle
      ├── START_OTA_BLOCKER → Bloque les OTA en continu
      ├── START_USB_INTERCEPTOR → Watcher USB
      └── ... (autres actions)

onDestroy()
  ├── Annule toutes les coroutines
  ├── Réinitialise tous les flags "is_running"
  └── Arrête les scripts en cours
```

---

## 9. Kill Switch & Blocage Internet

### DnsBlockerService — VPN null-routing

```java
VpnService.Builder builder = new VpnService.Builder(this)
    .setSession("Singularity Kill Switch")
    .addAddress("10.8.0.2", 24)
    .addRoute("0.0.0.0", 0);  // TOUT le trafic
```

**Fonctionnement :**
1. Crée une interface VPN via `VpnService`
2. Route **tout** le trafic (`0.0.0.0/0`) vers l'interface VPN
3. L'interface VPN n'a pas de sortie réseau → **null routing**
4. Aucun paquet ne peut sortir → Internet complètement bloqué
5. Notification : *"Internet access is temporarily blocked"*

**Contrôle :**
- `ACTION_START` (`com.lumi.singularity.START_KILL_SWITCH`) → Active
- `ACTION_STOP` (`com.lumi.singularity.STOP_KILL_SWITCH`) → Désactive
- `onRevoke()` → Gère la révocation par le système


---

## 10. Télémétrie & Mises à jour

### Télémétrie désactivée

```
assets/telemetry/
├── fflogger_event_store.sql   # Base de données de logs (vide)
├── telemetry                  # Binaire de télémétrie (remplacé)
└── telemetry.rc               # Service rc → intentionnellement vide
```

Le fichier `telemetry.rc` est un fichier init.rc **intentionnellement vide** qui, via bind-mount, remplace le vrai service de télémétrie de Meta, empêchant son enregistrement.

### Update engine neutralisé

```
assets/update_engine/
├── update              # Binaire update (remplacé)
├── update_engine.rc    # Service rc → intentionnellement vide
├── update_noop         # Binaire no-op
└── update_verifier.rc  # Service rc → intentionnellement vide
```

Même approche : les fichiers `.rc` vides, bind-mountés sur les vrais fichiers système, empêchent les services `update_engine` et `update_verifier` de démarrer.

---

## 11. Analyse de Sécurité

### Vecteurs d'attaque identifiés

| Vecteur | Sévérité | Description |
|---------|----------|-------------|
| **Kernel LPE** | 🔴 Critique | `libexploit.so` contient un exploit kernel non patché |
| **DirtyFrag IPsec** | 🔴 Critique | Corruption mémoire via le subsystem IPsec |
| **SELinux bypass** | 🔴 Critique | Passage forcé en mode permissive |
| **Boot partition rename** | 🟡 Moyen | Protection par obscurité (renommage + symlink cassé) |
| **Package restrictions XML** | 🟡 Moyen | Modification directe de XML système |
| **Killswitch removal** | 🟡 Moyen | Suppression du token de brick remote |

### Surface d'attaque réduite

L'application **réduit** activement la surface d'attaque :
- ✅ Désactive les OTA (empêche les patches de sécurité)
- ✅ Désactive la télémétrie (vie privée)
- ✅ Désactive l'update engine
- ✅ Bloque le killswitch Meta
- ⚠️ Mais : SELinux permissive = toutes les apps ont un accès root potentiel

### Dépendances tierces

| Librairie | Version | Rôle |
|-----------|---------|------|
| `com.topjohnwu.superuser` (libsuperuser) | Obfusqué | Gestion des shells root |
| `com.scottyab.rootbeer` (RootBeer) | Obfusqué | Détection de root |
| `androidx.compose` | Obfusqué | UI framework |
| `com.google.android.material` | Obfusqué | Material Design components |

### Obfuscation

Le code est obfusqué avec **R8** (map ID: `cdb4a92a...`). Les noms de classes/méthodes sont remplacés par des identifiants courts (`d4`, `ds0`, `hm`, `hq`, etc.), rendant l'analyse statique plus difficile.

---

## 12. Glossaire

| Terme | Définition |
|-------|-----------|
| **LPE** | Local Privilege Escalation — élévation de privilèges locale |
| **DirtyFrag** | Vulnérabilité du subsystem IPsec permettant une écriture arbitraire en mémoire kernel |
| **SPI** | Security Parameter Index — identifiant de transform IPsec |
| **Zygisk** | Mécanisme de Magisk pour injecter du code dans les processus Zygote |
| **Bind-mount** | Montage d'un fichier/répertoire par-dessus un autre (overlay temporaire) |
| **Systemless** | Modification du système sans altérer la partition système (via Magisk) |
| **nsenter** | Utilitaire Linux pour entrer dans un namespace existant |
| **cred** | Structure kernel `cred` contenant les credentials d'un processus (uid, gid, SELinux context) |
| **Killswitch** | Mécanisme Meta (`/persist/srt_push/token`) permettant de bricker/forcer une MAJ à distance |
| **Payload chain** | Séquence de scripts exécutés après l'obtention du root |
| **Carrier module** | Module kernel (`.ko`) utilisé comme vecteur pour l'escalade de privilèges |
| **OTA** | Over-The-Air — mise à jour logicielle distante |
| **tmpfs** | Système de fichiers en mémoire RAM (utilisé par Magisk dans `/debug_ramdisk`) |

---

**Document rédigé le :** 17 octobre 2026
**Source :** Décompilation JADX de `Singularity.apk` v1.0.7.9 (build 49)
**Analyste :** Cline AI Assistant

Puis appelle en séquence les payloads sélectionnés par l'utilisateur.
