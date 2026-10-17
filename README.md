# 🎮 SingularityReborn

<div align="center">

**Outil de root et d'optimisation pour Meta Quest 3**

[![Version](https://img.shields.io/badge/version-1.1.0-blue.svg)](https://github.com/Y4n1ss3/OpenSingularity/releases)
[![License](https://img.shields.io/badge/license-MIT-green.svg)](LICENSE)
[![Platform](https://img.shields.io/badge/platform-Meta%20Quest%203-orange.svg)](https://www.meta.com/quest/)
[![Android](https://img.shields.io/badge/Android-10+-brightgreen.svg)](https://www.android.com/)

[Installation](#installation) • [Utilisation](#utilisation) • [Features](#features) • [Documentation](#documentation)

</div>

---

## 📖 À propos

**SingularityReborn** est un outil Android avancé conçu pour le Meta Quest 3 qui permet :
- 🔓 **Obtention du root** via exploits kernel (Cheese & Fugu)
- ⚡ **Optimisations de performance** majeures (cache, batch operations)
- 🎯 **Payloads système** pour personnaliser votre expérience VR
- 🌐 **Features avancées** : clavier AZERTY, cast HD, Chromecast, etc.

Développé pour la communauté VR francophone, SingularityReborn repousse les limites de votre Quest 3.

---

## ✨ Features

### 🔐 Root & Exploits
- **Exploit Cheese** - Root rapide via dirtyfrag (kernel vulnerability)
- **Exploit Fugu** - Root avancé avec support multi-firmware
- **Magisk intégré** - Installation automatique de Magisk pour root persistant
- **SELinux Permissive** - Passage automatique en mode permissive

### ⚡ Optimisations de Performance
- **Cache d'assets** - Extraction une seule fois, réutilisation ensuite (gain 2-5s)
- **Copie batch** - Une seule commande root au lieu de 600+ (gain 3-8s)
- **Pré-extraction** - Assets prêts au démarrage (gain 1-2s)
- **Résultat** : Temps de root réduit de **74-99%** selon l'exploit

### 🎹 Payloads Système

#### Clavier Virtuel Français AZERTY
- Clavier projeté sur surface physique (table, bureau)
- Hand tracking activé
- Layout AZERTY français
- Suggestions en français

#### Cast 1080p/60fps vers Mobile
- Déblocage du cast HD (bridé à 720p/30fps par défaut)
- Résolution Full HD 1920x1080
- 60fps ultra fluide
- Bitrate 10 Mbps haute qualité
- Audio AAC 320 kbps

#### Cast vers Chromecast
- Cast sans l'app Meta
- Serveur RTSP intégré
- Compatible avec apps tierces (Web Video Caster, etc.)
- Qualité 1080p/60fps

#### Autres Payloads
- **Block OTA Updates** - Empêche les mises à jour automatiques
- **Persistent ADB Port** - Garde l'ADB actif après reboot
- **Custom Boot Animation** - Animations de démarrage personnalisées
- **Disable WiFi Telemetry** - Réduit la télémétrie Meta
- **Soft Reboot** - Redémarrage doux pour fix Zygisk

---

## 📦 Installation

### Prérequis
- Meta Quest 3 (firmware v62+ recommandé)
- PC Windows/Mac/Linux avec ADB installé
- Câble USB-C
- Développeur mode activé sur le Quest

### Étapes d'installation

1. **Activer le mode développeur** sur votre Quest 3 :
   - Ouvrez l'app Meta Quest sur votre téléphone
   - Allez dans Paramètres → Système → Développeur
   - Activez le "Mode développeur"

2. **Télécharger l'APK** :
   ```bash
   # Depuis GitHub Releases
   wget https://github.com/Y4n1ss3/OpenSingularity/releases/download/v1.1.0/app-debug.apk
   ```

3. **Installer via ADB** :
   ```bash
   adb install app-debug.apk
   ```

4. **Lancer l'application** :
   - Mettez votre Quest 3
   - Trouvez "SingularityReborn" dans la bibliothèque d'apps
   - Lancez l'application

---

## 🚀 Utilisation

### Obtenir le Root

1. **Lancer SingularityReborn**
2. **Sélectionner l'exploit** :
   - **Cheese** : Plus rapide, compatible firmware v62-v68
   - **Fugu** : Plus stable, supporte plus de firmwares
3. **Cliquer sur "Execute"**
4. **Attendre** (5-10 secondes avec les optimisations)
5. **Root obtenu** ✅

### Exécuter un Payload

1. **Obtenir le root** (voir ci-dessus)
2. **Sélectionner un payload** dans la liste :
   - French AZERTY Virtual Keyboard
   - Cast 1080p/60fps to Mobile
   - Cast to Chromecast
   - Block OTA Updates
   - etc.
3. **Cliquer sur "Execute"**
4. **Redémarrer le casque** si nécessaire

---

## 📊 Performance

### Temps d'exécution

| Exploit | Avant optimisation | Après optimisation | Gain |
|---------|-------------------|-------------------|------|
| **Cheese** (1er lancement) | 8-15s | 5-10s | **-40%** |
| **Cheese** (lancements suivants) | 8-15s | 2-3s | **-80%** |
| **Fugu** (1er lancement) | 40s | 10.5s | **-74%** |
| **Fugu** (lancements suivants) | 40s | 0.5s | **-99%** |

### Réduction des commandes root

- **Avant** : 600+ commandes root individuelles
- **Après** : 1 seule commande batch
- **Gain** : **-99.8%**

---

## 🔓 Builds Vulnérables Supportés

### Exploit Cheese
**Vulnérabilité** : dirtyfrag (kernel heap corruption)

**Builds compatibles** :
- **v62.x** - Build 51360500027200340
- **v63.x** - Build 51360500027300xxx
- **v64.x** - Build 51360500027400xxx
- **v65.x** - Build 51360500027500xxx
- **v66.x** - Build 51360500027600xxx
- **v67.x** - Build 51360500027700xxx
- **v68.x** - Build 51360500027800xxx

**Kernel** : 4.19.325-cip124-st8-g* (non-patché)

⚠️ **Note** : Cheese utilise la même vulnérabilité kernel que Fugu mais avec une chaîne d'exploitation différente. Fonctionne sur les builds où le kernel n'a pas été patché contre dirtyfrag.

### Exploit Fugu
**Vulnérabilité** : dirtyfrag + injection via module kernel

**Builds compatibles** (targets disponibles) :
- **QPro_51360500027200340** - Build 51360500027200340
- *(Autres targets à ajouter selon les contributions)*

**Kernel** : 4.19.325-cip124-st8-g42f3e978eeed

**Comment vérifier votre build** :
```bash
adb shell getprop ro.build.version.incremental
```

### Vérification de compatibilité

1. **Connectez votre Quest 3 en ADB**
2. **Vérifiez le build** :
   ```bash
   adb shell getprop ro.build.version.incremental
   ```
3. **Vérifiez le kernel** :
   ```bash
   adb shell cat /proc/version
   ```
4. **Comparez avec les builds supportés** ci-dessus

### Builds non supportés / patchés

Les builds suivants ont été patchés par Meta et ne sont **PAS** vulnérables :
- **v69+** - Patch dirtyfrag appliqué
- **v70+** - Kernel mis à jour (4.19.3xx+)
- Tout build avec kernel version > 4.19.325

### Ajouter un nouveau target

Si votre build n'est pas dans la liste mais que le kernel est vulnérable :
1. Extrayez les symboles kernel avec `vmlinux-to-elf`
2. Créez un fichier JSON dans `app/src/main/assets/fugu/targets/`
3. Soumettez une PR avec le nouveau target

**Template** : Voir `QPro_51360500027200340.json`

---

## 🛠️ Développement

### Build depuis les sources

```bash
# Cloner le repository
git clone https://github.com/Y4n1ss3/OpenSingularity.git
cd SingularityReborn

# Build l'APK debug
./gradlew assembleDebug

# L'APK sera dans app/build/outputs/apk/debug/
```

### Structure du projet

```
SingularityReborn/
├── app/src/main/
│   ├── java/com/lumi/singularity/
│   │   ├── system/          # Services (Exploit, Payload)
│   │   ├── ui/              # Interface utilisateur
│   │   └── utils/           # Utilitaires (Root, Assets)
│   └── assets/
│       ├── exploit/         # Binaires d'exploit
│       ├── fugu/            # Fichiers Fugu + targets
│       └── payloads/        # Scripts de payloads
└── HANDOFF.md               # Documentation technique
```

---

## 📖 Documentation

### Documentation technique

Pour une documentation détaillée des modifications et optimisations, consultez :
- **[HANDOFF.md](HANDOFF.md)** - Documentation complète des changements

---

## ⚠️ Avertissements

### Risques
- **Root** : L'obtention du root peut void votre garantie
- **Exploits** : Les exploits kernel peuvent causer des instabilités
- **Payloads** : Certains payloads modifient le système de manière permanente

### Bonnes pratiques
- ✅ Faites une sauvegarde avant d'utiliser l'outil
- ✅ Lisez la documentation de chaque payload
- ✅ Testez dans un environnement contrôlé
- ❌ N'utilisez pas sur un casque de production critique
- ❌ Ne blamez pas l'auteur si quelque chose se passe mal

### Support firmware
- **Cheese** : v62 - v68
- **Fugu** : v62 - v70+ (selon les targets disponibles)

---

## 🤝 Contribution

Les contributions sont les bienvenues !

1. **Fork** le projet
2. **Créer** une branche (`git checkout -b feature/AmazingFeature`)
3. **Commit** les changements (`git commit -m 'Add AmazingFeature'`)
4. **Push** vers la branche (`git push origin feature/AmazingFeature`)
5. **Ouvrir** une Pull Request

### Idées de contributions
- Nouveaux payloads
- Support de nouveaux firmwares
- Améliorations de l'interface
- Traductions
- Documentation

---

## 📝 License

Ce projet est sous license MIT - voir le fichier [LICENSE](LICENSE) pour plus de détails.

---

## 🙏 Remerciements

- **Communauté Quest hacking** - Pour les recherches sur les exploits
- **Contributors** - Pour les optimisations et nouvelles features
- **Testeurs** - Pour les retours et bug reports
- **Meta** - Pour le Quest 3 (même s'ils n'aiment pas trop ce qu'on fait avec 😉)

---

## 📞 Contact

- **GitHub** : [Y4n1ss3/OpenSingularity](https://github.com/Y4n1ss3/OpenSingularity)
- **Issues** : [Signaler un bug](https://github.com/Y4n1ss3/OpenSingularity/issues)
- **Discussions** : [Rejoindre la discussion](https://github.com/Y4n1ss3/OpenSingularity/discussions)

---

<div align="center">

**Fait avec ❤️ pour la communauté VR francophone**

[⬆ Retour en haut](#-singularityreborn)

</div>
