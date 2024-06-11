package com.avg206.gameScoringApp.welcome

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.arkivanov.decompose.extensions.compose.subscribeAsState
import com.avg206.gameScoringApp.shared.welcome.WelcomeComponent
import io.github.alexzhirkevich.cupertino.adaptive.AdaptiveButton
import io.github.alexzhirkevich.cupertino.adaptive.AdaptiveIconButton
import io.github.alexzhirkevich.cupertino.adaptive.AdaptiveScaffold
import io.github.alexzhirkevich.cupertino.adaptive.AdaptiveTopAppBar
import io.github.alexzhirkevich.cupertino.adaptive.ExperimentalAdaptiveApi

@OptIn(ExperimentalAdaptiveApi::class)
@Composable
internal fun WelcomeContent(
  component: WelcomeComponent,
  modifier: Modifier = Modifier,
) {
  val model by component.model.subscribeAsState()

  AdaptiveScaffold(
    modifier = modifier,
    topBar = {
      AdaptiveTopAppBar(
        title = { Text(text = "Welcome Screen") },
        navigationIcon = {
          AdaptiveIconButton(onClick = component::onBackClicked) {
            Icon(
              imageVector = Icons.AutoMirrored.Default.ArrowBack,
              contentDescription = "Back button",
            )
          }
        },
      )
    },
  ) {
    Column(
      modifier = Modifier.fillMaxSize(),
      horizontalAlignment = Alignment.CenterHorizontally,
      verticalArrangement = Arrangement.Center,
    ) {
      AdaptiveButton(
        onClick = { component.onUpdateGreetingText() },
      ) {
        Text(model.greetingText)
      }
    }
  }
}
