package com.hrithik.dailynews


actual class Platform() {
    actual val osName: String
        get() = TODO("Not yet implemented")
    actual val osVersion: String
        get() = TODO("Not yet implemented")
    actual val deviceModel: String
        get() = TODO("Not yet implemented")
    actual val density: Int
        get() = TODO("Not yet implemented")

    actual fun logSystemInfo() {
    }

    actual val appVersion: String
        get() = TODO("Not yet implemented")
    actual val manufacturer: String
        get() = TODO("Not yet implemented")
}