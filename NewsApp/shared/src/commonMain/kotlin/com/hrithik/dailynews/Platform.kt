package com.hrithik.dailynews

expect class Platform {
    val osName: String
    val osVersion: String
    val deviceModel: String
    val density: Int
    val appVersion: String
    val manufacturer: String

    fun logSystemInfo()
}