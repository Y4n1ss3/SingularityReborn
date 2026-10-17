# Analyse et Décompilation de Singularity.apk

## Résumé Exécutif

**Application:** Singularity
**Package:** com.lumi.singularity
**Version:** 1.0.7.9 (versionCode: 49)
**Taille:** 38.6 MB
**Date d'analyse:** 15 octobre 2026

**Nature de l'application:** Outil de root et de modification système pour casques Meta Quest (Reality Labs), exploitant des vulnérabilités kernel pour obtenir des privilèges root et installer Magisk.

---

## 1. Structure de l'APK

### Fichiers Principaux
- **AndroidManifest.xml** (12.6 KB) - Manifeste de l'application
- **classes.dex** (17.8 MB) - Code Dalvik principal
- **classes2.dex** (3.1 MB) - Code Dalvik secondaire
- **resources.arsc** (586 KB) - Ressources compilées

### Bibliothèques Natives (lib/)
Support multi-architecture :
- `arm64-v8a/`
  - `libadb.so` (3.3 MB) - Bibliothèque ADB
  - `libexploit.so` (25 KB) - Exploit kernel
  - `libsingularity_root_helper.so` (532 KB) - Helper root
  - `libtoolChecker.so` (5.5 KB) - Vérification d'outils
  - `libandroidx.graphics.path.so` (10 KB)
- `armeabi-v7a/`, `x86/`, `x86_64/` - Versions pour autres architectures

### Assets Critiques
```
assets/
├── adb/                    # Binaires ADB
├── bootanimation/          # Animations de boot personnalisées
├── dexopt/                 # Optimisation DEX
├── exploit/
│   ├── busybox            (1.7 MB) - Boîte à outils Unix
│   ├── cheese_launch.sh   (211 B)  - Lanceur d'exploit
│   ├── cheese_root.sh     (1.4 KB) - Script d'exploitation root
│   ├── magisk.apk         (6.1 MB) - Magisk modifié
│   └── Zygisk.ko          (132 KB) - Module noyau Zygisk
├── fugu/                   # Outil Fugu (exploit?)
├── module/                 # Modules Magisk
├── payloads/
│   ├── bootanimation.sh
│   ├── disable_ota.sh     - Blocage des mises à jour OTA
│   ├── disable_wifi.sh
│   ├── persistent_port.sh
│   ├── singularity_magisk.sh (15.5 KB) - Installation Magisk
│   ├── soft_reboot.sh
│   └── wake.sh

---

## 2. Permissions et Capacités

### Permissions Android
```xml
<uses-permission android:name="android.permission.ACCESS_WIFI_STATE"/>
<uses-permission android:name="android.permission.FOREGROUND_SERVICE"/>
<uses-permission android:name="android.permission.FOREGROUND_SERVICE_DATA_SYNC"/>
<uses-permission android:name="android.permission.INTERNET"/>
<uses-permission android:name="android.permission.RECEIVE_BOOT_COMPLETED"/>
<uses-permission android:name="android.permission.REQUEST_INSTALL_PACKAGES"/>
<uses-permission android:name="android.permission.WRITE_SECURE_SETTINGS"/>
<uses-permission android:name="android.permission.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS"/>
<uses-permission android:name="android.permission.QUERY_ALL_PACKAGES"/>
```

### Packages Ciblés
```xml
<queries>
    <package android:name="com.oculus.guidebook"/>
    <package android:name="com.meta.shell.env.footprint.haven2025"/>
    <package android:name="com.meta.shell.env.vista.calming"/>
</queries>
```

---

## 3. Composants Principaux

### Activités (10)
1. **MainActivity** - Activité principale, détection de root, gestion des appareils
2. **TweaksActivity** - Interface pour les tweaks système
3. **AdbActivity** - Gestion ADB sans fil
4. **AdbRootActivity** - ADB avec privilèges root
5. **AppsActivity** - Gestion des applications
6. **ControllerInfoActivity** - Informations sur les contrôleurs VR
7. **DomainBlockerActivity** - Blocage de domaines (Kill Switch)
8. **LedColorActivity** - Personnalisation des LED
9. **TerminalActivity** - Terminal shell
10. **TweaksActivity** - Tweaks système avancés

### Services (2)
1. **TweakService** - Service en arrière-plan pour les tweaks
   - Contrôle LED RGB
   - Verrouillage de fréquence CPU/GPU
   - Intercepteur USB
   - Blocage OTA
   - Limitation de charge
   - Contrôle du ventilateur

2. **DnsBlockerService** - Service VPN pour le "Kill Switch"
   - Bloque tout accès Internet
   - Utilise l'API VpnService

### Receivers (1)

---

## 4. Fonctionnalités Principales

### A. Exploitation et Root

#### Exploit "Cheese"
```bash
# cheese_root.sh
- Force SELinux en mode permissif
- Désactive les mises à jour OTA
- Supprime le "killswitch" Meta (/persist/srt_push/token)
- Protège les partitions boot contre le flashing accidentel
- Exécute la chaîne de payloads
```

#### Installation Magisk
```bash
# singularity_magisk.sh
- Extrait les binaires Magisk depuis l'APK
- Installe dans /data/adb/magisk
- Configure Zygisk
- Installe le manager Magisk
- Démarre le daemon magiskd
```

**Version Magisk:** v30.7 (fork Singularity avec fix Zygisk pour Meta Quest)

### B. Modèles d'Appareils Supportés

L'application contient des listes de numéros de série pour :
- **Quest 2** ("eureka", "panther")
- **Quest 3** ("hollywood", "xse_panther", "seacliff")
- **Quest Pro** et autres modèles

### C. Tweaks Système

#### TweakService - Scripts Shell
```
- rgb_led.sh          # Contrôle LED RGB
- custom_led.sh       # LED personnalisées
- power_led.sh        # LED d'alimentation
- min_freq_lock.sh    # Verrouillage fréquence min CPU
- max_freq_lock.sh    # Verrouillage fréquence max CPU
- usb_interceptor.sh  # Intercepteur USB (MTP/Steam Link)
- ota_blocker.sh      # Blocage OTA
- persist_protect.sh  # Protection /persist
- gpu_min_freq_lock.sh # Fréquence min GPU
- gpu_max_freq_lock.sh # Fréquence max GPU
- fan_override.sh     # Contrôle ventilateur
- charge_limit.sh     # Limitation de charge
- hide_mc2.sh         # Masquage MC2
```

### D. Blocage OTA (Mises à Jour)

```bash
# disable_ota.sh
1. Désactive com.oculus.updater via package-restrictions.xml
2. Désactive NuxOtaIntentService
3. Désactive com.oculus.accountscenter
4. Redirige les URLs OTA vers 127.0.0.1

---

## 5. Bibliothèques Utilisées

### AndroidX / Jetpack
- Activity, Fragment, Lifecycle
- Compose (UI moderne)
- Navigation
- Material3
- DataBinding

### Bibliothèques Tierces
- **RootBeer** (com.scottyab.rootbeer) - Détection de root
- **libsuperuser** (com.topjohnwu.superuser) - Gestion root (par l'auteur de Magisk)
- **Kotlin Coroutines** - Programmation asynchrone

---

## 6. Flux d'Exécution Typique

### Scénario de Root
```
1. Lancement de MainActivity
2. Détection du modèle de casque
3. Vérification si déjà rooté
4. Si non rooté:
   a. Extraction des assets (exploit, magisk, payloads)
   b. Exécution de cheese_launch.sh
   c. Exploit kernel via libexploit.so
   d. cheese_root.sh:
      - SELinux permissif
      - Suppression killswitch
      - Protection boot partitions
   e. payload_chain.sh:
      - Installation Magisk
      - Configuration Zygisk
      - Application des tweaks
   f. Redémarrage optionnel
5. Si rooté:
   - Affichage des options de tweaks
   - Contrôle des services en arrière-plan
```

### Démarrage au Boot
```
BootReceiver → BOOT_COMPLETED

---

## 8. Décompilation

### Outils Utilisés
- **jadx v1.5.1** - Décompilation DEX → Java
- **Extract-Archive** - Extraction de l'APK

### Résultats
- **18 597 fichiers Java** décompilés
- Dossier de sortie: `apk_decompiled/`
  - `sources/` - Code Java décompilé
  - `resources/` - Ressources décodées

### Structure du Code Décompilé
```
sources/
├── android/              # Classes Android (framework)
├── androidx/             # Bibliothèques AndroidX
├── com/
│   ├── google/           # Material Design
│   ├── lumi/singularity/ # Code principal de l'application
│   │   ├── system/       # Services système
│   │   └── ui/activities/# Activités UI
│   ├── scottyab/rootbeer/# Détection de root
│   └── topjohnwu/superuser/# libsuperuser
├── defpackage/           # Classes obfusquées (R8/ProGuard)
└── kotlin/               # Bibliothèque Kotlin
```

### Obfuscation
- R8/ProGuard activé
- Noms de classes/méthodes obfusqués (a, b, c, defpackage.*)
- Certaines parties du code difficilement lisibles
- Commentaires de débogage partiellement préservés

---

## 9. Fichiers Générés

### Dossier de Travail
```
c:\Users\Shadow\Documents\Singularity\
├── Singularity.apk              # APK original (38.6 MB)
├── Singularity.zip              # Copie pour extraction
├── apk_extracted/               # Contenu brut extrait
│   ├── AndroidManifest.xml
│   ├── classes.dex
│   ├── classes2.dex
│   ├── assets/
│   ├── lib/
│   ├── res/
│   └── META-INF/
├── apk_decompiled/              # Décompilation complète
│   ├── sources/                 # 18 597 fichiers Java
│   └── resources/               # Ressources décodées
├── tools/
│   └── jadx/                    # Outil de décompilation
└── ANALYSIS_REPORT.md           # Ce rapport
```

---

## 10. Conclusion

**Singularity** est un outil sophistiqué de root et de modification système pour casques Meta Quest (Quest 2, Quest 3, Quest Pro). Il combine :

1. **Un exploit kernel** ("cheese") pour obtenir les privilèges root
2. **Magisk fork** (v30.7) pour une gestion root persistante avec Zygisk
3. **Des tweaks système** pour personnaliser le comportement du casque
4. **Des contournements de sécurité** pour empêcher les mises à jour et le killswitch

L'application est bien structurée avec une interface moderne (Jetpack Compose) et utilise des bibliothèques reconnues (libsuperuser de l'auteur de Magisk, RootBeer pour la détection de root).

**Usage prévu:** Permettre aux utilisateurs de Quest de :
- Obtenir un accès root complet
- Installer des modules Magisk/Zygisk
- Personnaliser les LED, fréquences CPU/GPU, ventilateur
- Bloquer les mises à jour OTA
- Contrôler finement le système

**Avertissement:** Cet outil présente des risques significatifs (brick, perte de garantie, vulnérabilités de sécurité) et ne devrait être utilisé que par des utilisateurs avancés conscients des implications.

---

## 11. Commandes Utiles

### Re-décompiler l'APK
```powershell
# Avec jadx (déjà installé)
& 'c:\Users\Shadow\Documents\Singularity\tools\jadx\bin\jadx.bat' `
  --show-bad-code `
  -d 'c:\Users\Shadow\Documents\Singularity\apk_decompiled' `
  'c:\Users\Shadow\Documents\Singularity\Singularity.apk'
```

### Explorer le code
```powershell
# Lister toutes les classes de l'application
Get-ChildItem 'c:\Users\Shadow\Documents\Singularity\apk_decompiled\sources\com\lumi\singularity' -Recurse -Filter '*.java'

# Rechercher un pattern dans le code
Select-String -Path 'c:\Users\Shadow\Documents\Singularity\apk_decompiled\sources\**\*.java' -Pattern 'exploit' -Recurse
```

### Ouvrir avec JADX-GUI
```powershell
& 'c:\Users\Shadow\Documents\Singularity\tools\jadx\bin\jadx-gui.bat' 'c:\Users\Shadow\Documents\Singularity\Singularity.apk'
```

---

**Rapport généré le:** 15 octobre 2026
**Analyste:** Cline AI Assistant

  ↓
Lecture des préférences "singularity_prefs"
  ↓
Pour chaque tweak activé:
  - root_on_boot → Exécution de l'exploit
  - rgb_on_boot → START_RGB_LED
  - min_freq_on_boot → START_MIN_FREQ_LOCK
  - wireless_adb_on_boot → Activation ADB sans fil
  - ota_blocker_on_boot → START_OTA_BLOCKER
  - etc.
```

---

## 7. Analyse de Sécurité

### Points Critiques

1. **Exploit Kernel**
   - `libexploit.so` contient un exploit de local privilege escalation (LPE)
   - Nécessite des vulnérabilités non patchées dans le kernel
   - Risque de brick si l'exploit échoue

2. **Modification Système**
   - Accès root complet au système
   - Modification de partitions système
   - Installation de binaires dans /data/adb

3. **Persistance**
   - BootReceiver pour restauration automatique
   - Magisk installé de façon persistante
   - Tweaks appliqués à chaque démarrage

4. **Contournement de Sécurité**
   - Désactivation des mises à jour OTA
   - Suppression du killswitch Meta
   - SELinux désactivé (permissif)

5. **Protection des Partitions**
   - Renommage de boot_a/boot_b pour empêcher le flashing
   - Protection contre les restaurations accidentelles

### Risques
- **Brick potentiel** si l'exploit échoue ou corrompt le système
- **Perte de garantie** Meta Quest
- **Vulnérabilités de sécurité** avec SELinux désactivé
- **Impossibilité de recevoir les mises à jour** officielles
- **Stabilité système** compromise par les modifications

5. Configure oculuspreferences pour différer les mises à jour
```

### E. Kill Switch (Blocage Internet)

```java
// DnsBlockerService
- Crée une interface VPN
- Route tout le trafic vers 10.8.0.2/24 (null routing)
- Bloque complètement l'accès Internet
- Notification: "Internet access is temporarily blocked"
```

1. **BootReceiver** - Exécution au démarrage
   - Restaure tous les tweaks activés
   - Root au boot
   - Services en arrière-plan

├── telemetry/              # Collecte de télémétrie
└── update_engine/          # Moteur de mise à jour
```
