# GitHub Actions Workflows

This directory contains the GitHub Actions workflows for the msakoWallet project.

## Available Workflows

### 1. Android CI - Build APK (`android-build.yml`)

Automatically builds the Android application and produces APK files.

**Trigger Events:**
- Push to `main` or `develop` branches
- Pull requests to `main` or `develop` branches
- Manual trigger (workflow_dispatch)

**Outputs:**
- Debug APK (`msakoWallet-debug.apk`)
- Release APK (`msakoWallet-release.apk`)

**How to trigger manually:**
1. Go to [Actions tab](https://github.com/mkpharez/msako/actions)
2. Select "Android CI - Build APK" workflow
3. Click "Run workflow" button
4. Select branch and click "Run workflow"

### 2. Update Progress Metrics (`progress.yml`)

Automatically updates project progress metrics.

**Trigger Events:**
- Push events
- Pull request events

## Workflow Artifacts

After a successful build, you can download the APK files:

1. Navigate to the [Actions tab](https://github.com/mkpharez/msako/actions)
2. Click on the completed workflow run
3. Scroll to the "Artifacts" section
4. Download the desired APK file

Artifacts are retained for 30 days.

## Development

To modify or add new workflows:

1. Create a new `.yml` file in this directory
2. Follow GitHub Actions syntax and best practices
3. Test the workflow on a feature branch before merging
4. Update this README with the new workflow information

## Resources

- [GitHub Actions Documentation](https://docs.github.com/en/actions)
- [Android CI/CD Best Practices](https://developer.android.com/studio/build/building-cmdline)
- [Workflow Syntax](https://docs.github.com/en/actions/using-workflows/workflow-syntax-for-github-actions)
