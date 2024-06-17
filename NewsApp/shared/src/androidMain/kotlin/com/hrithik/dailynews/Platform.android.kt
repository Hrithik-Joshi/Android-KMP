package com.hrithik.dailynews

import android.content.res.Resources
import android.os.Build
import android.util.Log
import kotlin.math.round

actual class Platform() {
    actual val osName: String
        get() = "Android"
    actual val osVersion: String
        get() = (Build.VERSION.SDK_INT).toString()
    actual val deviceModel: String
        get() = Build.MODEL
    actual val density: Int
        get() = round(Resources.getSystem().displayMetrics.density).toInt()
    actual val appVersion: String
        get() = "3.200.0"
    actual val manufacturer: String
        get() = Build.MANUFACTURER

    actual fun logSystemInfo() {
        Log.d("System INFO", "$osName $osVersion $deviceModel $density, $manufacturer, $appVersion")
    }

}