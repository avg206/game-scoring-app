package com.example.myapplication.main

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.myapplication.shared.main.MainComponent
import io.github.alexzhirkevich.cupertino.adaptive.AdaptiveButton
import io.github.alexzhirkevich.cupertino.adaptive.AdaptiveScaffold
import io.github.alexzhirkevich.cupertino.adaptive.AdaptiveTopAppBar
import io.github.alexzhirkevich.cupertino.adaptive.ExperimentalAdaptiveApi

@OptIn(ExperimentalAdaptiveApi::class)
@Composable
internal fun MainContent(
  component: MainComponent,
  modifier: Modifier = Modifier,
) {
  AdaptiveScaffold(
    modifier = modifier,
    topBar = {
      AdaptiveTopAppBar(
        title = { Text(text = "Decompose Template") },
      )
    },
  ) {
    Box(
      modifier = Modifier.fillMaxSize(),
      contentAlignment = Alignment.Center,
    ) {
      AdaptiveButton(onClick = component::onShowWelcomeClicked) {
        Text(text = "Show Welcome screen")
      }
    }
  }
}
