# msakoWallet - Android Application

This directory contains the Android application source code for **msakoWallet**, an M-Sacco & E-Wallet Fintech application.

## Project Structure

```
mkpharez/                          # Root directory for Android project
├── app/                           # Main application module
│   ├── src/
│   │   └── main/
│   │       ├── java/com/mkpharez/msakowallet/
│   │       │   └── MainActivity.kt     # Starter activity
│   │       ├── res/
│   │       │   ├── layout/
│   │       │   │   └── activity_main.xml   # Main activity layout
│   │       │   ├── values/
│   │       │   │   ├── strings.xml
│   │       │   │   ├── colors.xml
│   │       │   │   └── themes.xml
│   │       │   ├── drawable/
│   │       │   ├── mipmap-*/             # App icons
│   │       │   └── xml/                  # Backup rules
│   │       └── AndroidManifest.xml
│   ├── build.gradle.kts           # App module build configuration
│   └── proguard-rules.pro         # ProGuard rules
├── gradle/wrapper/                # Gradle wrapper files
├── build.gradle.kts              # Root project build configuration
├── settings.gradle.kts           # Gradle settings
└── gradle.properties             # Project properties
```

## Application Details

- **Application Name**: msakoWallet
- **Package Name**: com.mkpharez.msakowallet
- **Language**: Kotlin
- **Minimum SDK**: 24 (Android 7.0)
- **Target SDK**: 34 (Android 14)

## Architecture

This application follows the **MVVM (Model-View-ViewModel)** architecture pattern as outlined in `/docs/ARCHITECTURE.md`.

### Key Technologies

- **Kotlin**: Primary development language
- **AndroidX**: Modern Android components
- **Lifecycle Components**: ViewModel, LiveData, StateFlow
- **Room**: Local database persistence
- **Retrofit**: REST API networking
- **DataStore**: Key-value storage for preferences
- **Coroutines**: Asynchronous programming
- **Material Design**: UI components

## Building the Project

To build the project, use Gradle:

```bash
# Build debug APK
./gradlew assembleDebug

# Build release APK
./gradlew assembleRelease

# Run tests
./gradlew test

# Install on connected device
./gradlew installDebug
```

## Development Roadmap

See `/docs/ROADMAP.md` for the complete development roadmap and feature planning.

## Getting Started

1. Open the `mkpharez` directory in Android Studio
2. Sync Gradle files
3. Run the app on an emulator or physical device

## Next Steps

- Implement User Authentication (see ROADMAP.md)
- Set up MVVM ViewModels
- Create Repository pattern for data access
- Integrate Room database
- Set up Retrofit for API calls
