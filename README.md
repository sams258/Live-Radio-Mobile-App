# Mobile Radio Streaming App

**:radio: Live Online Radio Streaming App**  

---

## :sparkles: Overview

This is a mobile application designed for playing live online radio streams. The app provides real-time information about the currently playing track, including the **singer's name** and **track title**. 

The app is lightweight, responsive, and optimized for smooth performance, ensuring a delightful user experience. 

---

## :hammer_and_wrench: Technology Stack

- **Programming Language**: [Kotlin](https://kotlinlang.org/) :coffee:
- **Framework**: Android SDK
- **Build System**: [Gradle (Kotlin DSL)](https://docs.gradle.org/current/userguide/kotlin_dsl.html) :gear:
- **Streaming Protocol**: Shoutcast/Icecast for real-time streaming
- **Data Parsing**: JSON/XML for metadata retrieval
- **UI/UX**: Material Design principles

---

## :rocket: Features

### :musical_note: Radio Streaming
- Stream live radio channels seamlessly.
- Supports multiple formats like MP3, AAC, and OGG.

### :microphone: Now Playing Info
- Displays the **artist's name** and **track title** in real-time.
- Automatic metadata updates from the stream server.

### :sparkles: Eye-Candy UI
- Designed using **Material Design** for a modern look and feel.
- Intuitive navigation and controls.

### :gear: Customization
- Dark mode support :new_moon_with_face:.
- Easy server configuration via `local.properties`.

---

## :package: Folder Structure

```
├── .gradle                # Gradle cache and configuration files
├── .idea                  # IDE configuration files (IntelliJ/Android Studio)
├── app                    # Main source code folder
├── build                  # Compiled and build artifacts
├── gradle                 # Gradle wrapper files
├── .gitignore             # Git ignore rules
├── build.gradle.kts       # Module-level Gradle build file
├── gradle.properties      # Global project properties
├── gradlew                # Gradle wrapper script (Unix)
├── gradlew.bat            # Gradle wrapper script (Windows)
├── local.properties       # Local environment configuration
└── settings.gradle.kts    # Project-level Gradle settings
```

---

## :clipboard: Installation

### Prerequisites

1. Install [Android Studio](https://developer.android.com/studio).
2. Install JDK 11 or higher.
3. Configure the `local.properties` file to point to your Android SDK location:

   ```properties
   sdk.dir=/path/to/your/sdk
   ```

### Steps

1. Clone the repository:

   ```bash
   git clone https://github.com/sams258/mobile-radio-streaming-app.git
   ```

2. Open the project in Android Studio.
3. Sync Gradle and resolve dependencies.
4. Run the app on an emulator or a physical device.

---

## :memo: License

This project is licensed under the [MIT License](LICENSE).

---

## :bust_in_silhouette: Author

- **Name**: Sam  
- **GitHub**: [sams258](https://github.com/sams258)  
- **Email**: sam4studies@gmail.com  

---

**Enjoy Streaming! :radio:**

