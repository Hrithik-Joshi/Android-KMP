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


