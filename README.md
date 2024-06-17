<a name="_int_dkgxm26x"></a>App development with KMP, Ktor, Koin
# Why KMP?
- Truly native UI (User Interface)
- Shared business logic
- Shared infrastructure & boilerplate code
# What is KMP?
Kotlin Multiplatform is a Kotlin based framework that allows infrastructure code sharing between several front-end platforms.

Supported Platforms 

- Android
- iOS
- Web
- Desktop
# How KMP works?
![How KMM works?](Aspose.Words.296d0f5b-bb4b-44a0-947f-1693c58b2acb.001.png)

We have three main layers, i.e., Shared code, iOS native code and Android native code. Shared code will have common implementation of the business logic around network calls and other core utility type of functions. Once the shared module is built, the outcome of the shared module <a name="_int_flp21fxf"></a>is .framework file for iOS and .jar file for Android.
# Environment setup
1. Install the KMM plugin from your Android Studio’s Preference ->Plugins-> Marketplace section search for Kotlin Multiplatform. KMM plugin requires Kotlin 1.3 and above.

1. Click on the new project and select KMM Application.

   ![](Aspose.Words.296d0f5b-bb4b-44a0-947f-1693c58b2acb.002.png)
# Project Structure
![](Aspose.Words.296d0f5b-bb4b-44a0-947f-1693c58b2acb.003.png)

- **androidApp:** This directory holds the Android application module.
- **iOSApp:** This directory holds the iOS application module.
- **Shared:** This directory holds the shared code and platform-specific code organized into different source sets.
  - **commonMain**: Holds the main shared Kotlin code that will be used across all platforms.
  - **android Main**: Holds Android-specific Kotlin code.
  - **iosMain**: Holds iOS-specific Kotlin code.
- **build.gradle.kts**: The Gradle build script for configuring the project. It includes dependencies, Kotlin Multiplatform plugin configurations, and other project-level settings.
- **settings.gradle.kts**: The Gradle settings file for including modules and configuring project settings.
# Actual/Expect Mechanism
The expect/actual mechanism in Kotlin Multiplatform allows you to write common code that can call platform-specific APIs (Application Programming Interfaces).

- **expect Declarations**: These are defined in the common code and specify what a certain function, class, or property should look like.
- **actual Implementations**: These provide the concrete implementation for the expect declarations on each specific platform (e.g., Android, iOS).

Example:

shared/src/commonMain/Kotlin/Platform.kt

![A screen shot of a computer program

Description automatically generated](Aspose.Words.296d0f5b-bb4b-44a0-947f-1693c58b2acb.004.png)

shared/src/androidMain/kotlin/Platform.kt

![A screen shot of a computer program

Description automatically generated](Aspose.Words.296d0f5b-bb4b-44a0-947f-1693c58b2acb.005.png)

**In Common Code**: When you use getPlatform()in your common code, Kotlin will call the <a name="_int_f87fjfmw"></a>appropriate platform-specific implementation based on where the code is running.

**In Android-Specific Code**: The actual keyword is used to provide the concrete implementation that matches the expect declaration.




