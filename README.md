# MyFirstMessagingAPP

This repository contains an Android messaging app project that has been modernized for AndroidX, Firebase Realtime Database, and a proper chat UI.

## What is included

- Android app source in `MyFirstMessagingAPP-master/`
- `MainActivity` with a real chat list and Firebase message storage
- `RecyclerView` + `MessageAdapter` for chat display
- AndroidX dependencies and modern Firebase BOM usage
- Multidex support enabled for build compatibility
- MIT License at the repository root

## Build and test

Use the provided Gradle wrapper from the project root:

```bash
cd MyFirstMessagingAPP-master
export JAVA_HOME=/usr/lib/jvm/java-17-openjdk-amd64
export ANDROID_SDK_ROOT=/home/codespace/Android/Sdk
export ANDROID_HOME=/home/codespace/Android/Sdk
./gradlew --no-daemon clean assembleDebug
./gradlew --no-daemon test
```

## Notes for reviewers

- The app compiles successfully and the unit tests pass.
- The project is open source under the MIT License.
- The root `LICENSE` file already contains the MIT license text.

## License

This project is licensed under the MIT License. See `LICENSE` for details.
