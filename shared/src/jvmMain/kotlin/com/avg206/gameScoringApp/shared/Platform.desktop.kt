package com.avg206.gameScoringApp.shared

actual fun getPlatformName(): String = "Desktop ${System.getProperty("os.name")}"
