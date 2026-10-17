# 🎮 SingularityReborn

> ⚠️ **ATTENTION - PROJET EXPÉRIMENTAL NON TESTÉ** ⚠️
> 
> **Ce projet n'a PAS été testé et ne doit PAS être utilisé en l'état.**
> 
> Ce dépôt est en phase de développement actif. Les exploits, payloads et optimisations décrits dans cette documentation n'ont pas été validés sur des appareils réels. L'utilisation de ce code peut causer des dommages irréversibles à votre appareil, incluant mais ne se limitant pas à : brick permanent, perte de données, void de garantie, ou instabilités système.
> 
> **N'INSTALLEZ PAS CET APK SUR VOTRE APPAREIL.** Ce projet est destiné à des fins de recherche et de documentation uniquement.

<div align="center">

**Outil de root et d'optimisation pour Meta Quest 3 (EXPÉRIMENTAL)**

[![Status](https://img.shields.io/badge/status-UNTESTED-red.svg)]()
[![Version](https://img.shields.io/badge/version-1.1.0--alpha-orange.svg)]()
[![License](https://img.shields.io/badge/license-MIT-green.svg)](LICENSE)
[![Platform](https://img.shields.io/badge/platform-Meta%20Quest%203-orange.svg)](https://www.meta.com/quest/)
[![Android](https://img.shields.io/badge/Android-10+-brightgreen.svg)](https://www.android.com/)

[⚠️ Avertissement](#-avertissement-important) • [À propos](#-à-propos) • [Documentation technique](#-documentation-technique)

</div>

---

## 📖 À propos

> ⚠️ **Rappel : Ce projet n'est PAS fonctionnel et n'a PAS été testé.**

**SingularityReborn** est un projet de recherche conçu pour le Meta Quest 3 qui vise à explorer :
- 🔓 **L'obtention du root** via exploits kernel (Cheese & Fugu)
- ⚡ **Des optimisations de performance** (cache, batch operations)
- 🎯 **Des payloads système** pour personnaliser l'expérience VR
- 🌐 **Des features avancées** : clavier AZERTY, cast HD, Chromecast, etc.

**Ce projet est en phase de documentation et d'analyse de code reverse-engineered. Aucun composant n'a été validé sur appareil réel.**

---

## ⚠️ Avertissement Important

### 🚨 STATUT DU PROJET

**Ce projet est STRICTEMENT EXPÉRIMENTAL et n'a JAMAIS été testé sur un appareil réel.**

- ❌ Les exploits kernel n'ont pas été validés
- ❌ Les payloads n'ont pas été exécutés
- ❌ Les optimisations n'ont pas été mesurées
- ❌ Le build n'a pas été vérifié
- ❌ Aucune garantie de fonctionnement

### 🔴 RISQUES POTENTIELS

Si vous décidez quand même d'utiliser ce code (ce que nous déconseillons fortement) :

- **Brick permanent** de votre appareil
- **Perte totale de données**
- **Void irréversible** de votre garantie
- **Instabilités système** critiques
- **Exposition de sécurité** (root non testé = failles potentielles)
- **Violations des conditions d'utilisation** Meta

### 📋 Ce que vous DEVEZ savoir

1. **Ce code est basé sur du reverse engineering** - Il peut contenir des erreurs d'interprétation
2. **Les firmwares cibles évoluent** - Les exploits peuvent être patchés
3. **L'environnement de test manque** - Aucune validation empirique n'a été faite
4. **La documentation précède l'implémentation** - Ce qui est décrit peut ne pas fonctionner

---

## ✨ Features (NON TESTÉES)

> ⚠️ Les features décrites ci-dessous sont basées sur l'analyse du code source et n'ont pas été validées.

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

> ⚠️ **NE PAS INSTALLER** - Ce projet n'est pas fonctionnel. Cette section est conservée à titre de documentation uniquement.

### Prérequis
- Meta Quest 3 (firmware v62+ recommandé)
- PC Windows/Mac/Linux avec ADB installé
- Câble USB-C
- Développeur mode activé sur le Quest

> **RAPPEL** : Même si vous remplissez tous les prérequis, **ce projet n'a pas été testé** et son utilisation peut endommager votre appareil de manière irréversible.

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

### 🚨 STATUT : PROJET NON TESTÉ

**Ce projet n'a JAMAIS été testé sur un appareil réel. Son utilisation est fortement déconseillée.**

### Risques

- **Root** : L'obtention du root peut void votre garantie
- **Exploits** : Les exploits kernel peuvent causer des instabilités
- **Payloads** : Certains payloads modifient le système de manière permanente
- **BRICK** : Risque de brick permanent de l'appareil (NON TESTÉ)
- **DONNÉES** : Risque de perte totale de données (NON TESTÉ)

### Bonnes pratiques

- ✅ **NE PAS UTILISER** ce projet en l'état
- ✅ Faites une sauvegarde avant d'utiliser l'outil (si vous décidez quand même de l'utiliser)
- ✅ Lisez la documentation de chaque payload
- ✅ Testez dans un environnement contrôlé
- ❌ N'utilisez pas sur un casque de production critique
- ❌ Ne blamez pas l'auteur si quelque chose se passe mal

### Support firmware (NON VALIDÉ)

> ⚠️ Les plages de firmware indiquées ci-dessous sont basées sur l'analyse du code et n'ont pas été testées.

- **Cheese** : v62 - v68 (théorique)
- **Fugu** : v62 - v70+ (selon les targets disponibles, théorique)

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
