# Sakura Tactics

A landscape Android tactical samurai combat prototype. This repository is being prepared for automatic APK builds.

## Original playable prototype
The original Sakura Tactics prototype ZIP was created in ChatGPT and includes `web/` (HTML5 game and watercolor art) and `android-app/` (Android WebView wrapper). The binary art assets and complete game source still need to be transferred into this repository; they are **not** included by this README.

## Build
The Android GitHub Actions workflow at `.github/workflows/android-apk.yml` builds `android-app` using Java 17 / Android SDK / Gradle and uploads `sakura-tactics-debug-apk` in Actions artifacts. The workflow will only pass once the Android project has been uploaded.

## Game design
Tap octagonal spaces to move; tap the horned oni to select; use basic STRIKE or the cinematic ten-hit `Sakura Storm` critical combo. Original art is Japanese watercolor and painterly fantasy with sakura blossoms.
