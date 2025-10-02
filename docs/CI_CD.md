# CI/CD Pipeline Documentation

## Overview

This document describes the Continuous Integration and Continuous Deployment (CI/CD) pipeline for the msakoWallet Android application.

## GitHub Actions Workflows

### 1. Android Build Workflow (`android-build.yml`)

**Location:** `.github/workflows/android-build.yml`

**Purpose:** Automatically builds the Android APK files for the msakoWallet application.

#### Triggers

- **Push Events:** Triggers on pushes to `main` or `develop` branches
- **Pull Request Events:** Triggers on PRs targeting `main` or `develop` branches
- **Manual Dispatch:** Can be triggered manually from the Actions tab

#### Build Environment

- **Runner:** Ubuntu Latest
- **JDK Version:** 17 (Temurin distribution)
- **Gradle:** Version 8.2 (via wrapper)
- **Android SDK:** Automatically configured via `android-actions/setup-android@v3`

#### Build Steps

1. **Checkout Code**: Checks out the repository code
2. **Setup JDK**: Installs JDK 17 with Gradle caching enabled
3. **Setup Android SDK**: Configures Android SDK and build tools
4. **Grant Permissions**: Makes gradlew executable
5. **Build Debug APK**: Compiles debug version (`assembleDebug`)
6. **Upload Debug APK**: Uploads debug APK as artifact
7. **Build Release APK**: Compiles release version (`assembleRelease`)
8. **Upload Release APK**: Uploads release APK as artifact

#### Build Artifacts

The workflow produces two APK files:

| Artifact Name | Description | Path | Retention |
|--------------|-------------|------|-----------|
| `msakoWallet-debug` | Debug build with debugging symbols | `mkpharez/app/build/outputs/apk/debug/*.apk` | 30 days |
| `msakoWallet-release` | Release build (unsigned) | `mkpharez/app/build/outputs/apk/release/*.apk` | 30 days |

#### Accessing Build Artifacts

1. Navigate to the [Actions tab](https://github.com/mkpharez/msako/actions)
2. Click on the workflow run you're interested in
3. Scroll down to the "Artifacts" section
4. Click on the artifact name to download

### 2. Progress Metrics Workflow (`progress.yml`)

**Location:** `.GitHub/workflows/progress.yml`

**Purpose:** Updates project progress metrics automatically.

## Project Configuration

### Gradle Configuration

The project uses Gradle 8.2 with the following key configurations:

- **Android Gradle Plugin:** 8.2.0
- **Kotlin Version:** 1.9.20
- **Compile SDK:** 34 (Android 14)
- **Min SDK:** 24 (Android 7.0)
- **Target SDK:** 34 (Android 14)

### Dependencies

Key dependencies included in the build:

- AndroidX Core KTX
- AppCompat
- Material Components
- ConstraintLayout
- Lifecycle Components (ViewModel, LiveData)
- Kotlin Coroutines
- Room Database
- Retrofit
- DataStore

## Local Development

### Building Locally

To build the project locally, ensure you have:

- JDK 17 or higher
- Android SDK with API 34
- Gradle (via wrapper)

Build commands:

```bash
cd mkpharez

# Build debug APK
./gradlew assembleDebug

# Build release APK
./gradlew assembleRelease

# Run tests
./gradlew test

# Install on connected device
./gradlew installDebug
```

## Troubleshooting

### Common Build Issues

**Issue:** Gradle wrapper not found
```
Solution: Ensure gradle/wrapper/gradle-wrapper.jar exists
```

**Issue:** Android SDK not found
```
Solution: Set ANDROID_HOME environment variable or use Android Studio
```

**Issue:** Build fails with "Plugin not found"
```
Solution: Check settings.gradle.kts has correct repository configuration
```

## Future Enhancements

Planned improvements to the CI/CD pipeline:

- [ ] Add unit test execution to workflow
- [ ] Add instrumented test execution (with emulator)
- [ ] Add code quality checks (lint, detekt)
- [ ] Add test coverage reporting
- [ ] Implement automatic version bumping
- [ ] Add signed release builds (with keystore)
- [ ] Deploy to Google Play Store (internal track)
- [ ] Add security scanning
- [ ] Implement PR status checks

## Resources

- [GitHub Actions Documentation](https://docs.github.com/en/actions)
- [Android Gradle Plugin Documentation](https://developer.android.com/studio/build)
- [Gradle Build Tool](https://gradle.org/)

---

**Last Updated:** 2025
**Maintainer:** mkpharez
