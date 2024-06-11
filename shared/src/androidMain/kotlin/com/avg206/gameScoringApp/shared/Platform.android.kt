package com.avg206.gameScoringApp.shared

actual fun getPlatformName(): String = "Android ${android.os.Build.VERSION.SDK_INT}"
