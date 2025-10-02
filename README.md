# msako - M-Sacco & E-Wallet Fintech Application

[![Android CI - Build APK](https://github.com/mkpharez/msako/actions/workflows/android-build.yml/badge.svg)](https://github.com/mkpharez/msako/actions/workflows/android-build.yml)

This repository contains the Android application for **msakoWallet**, an M-Sacco & E-Wallet Fintech application built with Kotlin.

## Project Structure

```
msako/
├── mkpharez/              # Android application root directory
│   ├── app/              # Main application module
│   │   └── src/main/
│   │       ├── java/com/mkpharez/msakowallet/
│   │       │   └── MainActivity.kt
│   │       ├── res/      # Resources (layouts, values, drawables)
│   │       └── AndroidManifest.xml
│   ├── build.gradle.kts  # Build configuration
│   ├── settings.gradle.kts
│   └── README.md         # Android project documentation
├── docs/                 # Project documentation
│   ├── ARCHITECTURE.md   # Architecture overview (MVVM)
│   ├── ROADMAP.md        # Development roadmap
│   ├── LEARNING_LOG.md   # Learning progress
│   └── WEEKLY_RETROS.md  # Weekly retrospectives
└── scripts/              # Utility scripts
```

## Application Details

- **Application Name**: msakoWallet
- **Package Name**: com.mkpharez.msakowallet
- **Development Language**: Kotlin
- **Architecture**: MVVM (Model-View-ViewModel)
- **Minimum SDK**: 24 (Android 7.0)
- **Target SDK**: 34 (Android 14)

## Key Technologies

- **Kotlin**: Primary development language with Coroutines for async operations
- **AndroidX**: Modern Android components and libraries
- **Lifecycle Components**: ViewModel, LiveData, StateFlow for reactive programming
- **Room**: Local database for data persistence
- **Retrofit**: REST API client for networking
- **DataStore**: Preferences and key-value storage
- **Material Design**: Modern UI components

## Architecture

This application follows the **MVVM (Model-View-ViewModel)** architecture pattern:

- **View (Activity/Fragment)**: UI layer using Jetpack Compose
- **ViewModel**: Manages UI state using StateFlow
- **Repository**: Abstracts data sources (API, Database)
- **Data Layer**: Room (local) + Retrofit (remote)

See [ARCHITECTURE.md](docs/ARCHITECTURE.md) for detailed architecture documentation.

## Getting Started

### Prerequisites

- Android Studio Arctic Fox or later
- JDK 8 or higher
- Android SDK with API 34

### Building the Project

1. Clone the repository:
   ```bash
   git clone https://github.com/mkpharez/msako.git
   cd msako
   ```

2. Open the `mkpharez` directory in Android Studio

3. Sync Gradle files

4. Build and run the application:
   ```bash
   cd mkpharez
   ./gradlew assembleDebug
   ./gradlew installDebug
   ```

## Development Roadmap

See [docs/ROADMAP.md](docs/ROADMAP.md) for the complete development roadmap including:

- **MSE10 2025**: MVP Launch (User Authentication, Wallet Dashboard, Send/Receive Money)
- **MSE11 2025**: Expansion (Transaction Paging, Notifications, 2FA)
- **MSE12 2025**: Hardening & Advanced Features (Analytics, Rewards, Bill Payments)

## Continuous Integration

This project uses GitHub Actions for automated builds:

### Android Build Workflow

The CI pipeline automatically builds the Android application on:
- Push to `main` or `develop` branches
- Pull requests to `main` or `develop` branches
- Manual workflow dispatch

**Workflow Features:**
- ✅ Automated Debug APK build
- ✅ Automated Release APK build
- ✅ APK artifacts uploaded with 30-day retention
- ✅ JDK 17 with Gradle caching
- ✅ Android SDK setup

**Artifacts:**
- `msakoWallet-debug.apk` - Debug build for testing
- `msakoWallet-release.apk` - Release build (unsigned)

Download build artifacts from the [Actions tab](https://github.com/mkpharez/msako/actions).

## Documentation

- [Architecture Overview](docs/ARCHITECTURE.md)
- [Development Roadmap](docs/ROADMAP.md)
- [CI/CD Pipeline](docs/CI_CD.md)
- [Learning Log](docs/LEARNING_LOG.md)
- [Weekly Retrospectives](docs/WEEKLY_RETROS.md)
- [Android Project README](mkpharez/README.md)

## Contributing

Please read our contribution guidelines and code of conduct before contributing to this project.

## License

This project is currently private. All rights reserved.
