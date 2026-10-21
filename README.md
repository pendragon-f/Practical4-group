# GitConflictDemo-group — Practical 4

A small Java / Android XML application for a two-person Git merge-conflict exercise.
The initial version contains two purple buttons (`#6750A4`). Each button displays
a Toast when tapped.

## Build and run

Open this repository in Android Studio. Use the bundled Gradle Wrapper,
Android Gradle Plugin 9.4.1, a compatible Gradle JDK (JDK 21 or the compatible Android Studio bundled JDK),
Android SDK Platform 37, and Build Tools 36.0.0. The minimum device API is 23.
Configure your local Android SDK through Android Studio; `local.properties` is
machine-specific and deliberately excluded from Git.

On Windows:

```powershell
.\gradlew.bat assembleDebug
```

On macOS/Linux:

```sh
./gradlew assembleDebug
```

Run the `app` configuration on an Android emulator. Check both button colors and
tap each button to verify its Toast.

## Collaboration sequence

1. Both students obtain the initial application commit before changing colors.
2. Student 1 creates `feature-red-button` from that commit and changes both
   `android:backgroundTint` values in
   `app/src/main/res/layout/activity_main.xml` to `#F44336`.
3. Student 2 independently creates `feature-green-button` from the same initial
   commit and changes the same two values to `#4CAF50`.
4. Compare the two branches, then merge the red pull request into `main` first.
5. Open the green pull request. Inspect the expected same-line conflict.
6. Agree on a final color, remove all conflict markers, build and run the app,
   then commit with `Resolve button color merge conflict`.
7. Complete the green pull request and verify the final `main` on both computers.

Preserve both feature branches and their commits. The assignment uses GitLab
Merge Requests; this repository uses GitHub Pull Requests at the owner's request.
Do not claim emulator tests have passed unless they were actually performed.
