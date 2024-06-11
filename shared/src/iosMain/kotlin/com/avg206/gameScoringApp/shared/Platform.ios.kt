package com.avg206.gameScoringApp.shared

import platform.UIKit.UIDevice

actual fun getPlatformName(): String =
  "${UIDevice.currentDevice.systemName()} ${UIDevice.currentDevice.systemVersion}"
