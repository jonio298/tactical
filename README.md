# Sakura Tactics — Painterly Android Demo v2

**Playable source project, not a precompiled APK.** Open `web/index.html` in a browser to preview, or upload this project to GitHub and use the included `Build Sakura Tactics Painterly APK` GitHub Actions workflow to compile an installable debug APK.

## What is inside
- Exact painterly battle-screen artwork (`painterly_battle.jpg`) supplied as the stage background.
- Touch targets aligned to the illustrated Slash and 10-Hit Slash Combo buttons.
- One animated attack sequence: pink arc slashes, ten timed impact hits, particles, critical text, screen shake, hit stop-like flashes, enemy HP reduction and enemy retaliation.
- Select enemy, select an octagon, guard, restart, victory/defeat.

## Limitations
- The samurai and oni are part of the original painting. They are not independently moving sprites in this visual version. Octagon selection highlights a tile rather than moving the character. Proper movable character sprites require separate painted character assets and a clean background.
- The procedural slash effect plays over the illustration; it is not the previously generated GIF as an extracted frame-by-frame character animation.
- No APK was compiled or device-tested in this environment.

## Android build
Gradle 8.10.2, Android Gradle Plugin as in project, JDK 17 and Android SDK platform 35. After CI passes, download `sakura-tactics-painterly-apk` from the workflow artifacts.
