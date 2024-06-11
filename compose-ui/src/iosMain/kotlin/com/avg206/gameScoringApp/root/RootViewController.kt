package com.avg206.gameScoringApp.root

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import androidx.compose.ui.window.ComposeUIViewController
import com.avg206.gameScoringApp.shared.root.RootComponent
import platform.UIKit.UIViewController

fun rootViewController(root: RootComponent): UIViewController =
  ComposeUIViewController {
    RootContent(component = root, modifier = Modifier.fillMaxSize())
  }
