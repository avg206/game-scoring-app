package com.avg206.gameScoringApp.shared.welcome

import com.arkivanov.decompose.ComponentContext
import com.arkivanov.decompose.value.MutableValue
import com.arkivanov.decompose.value.Value
import com.arkivanov.decompose.value.update
import com.avg206.gameScoringApp.shared.getPlatformName
import com.avg206.gameScoringApp.shared.welcome.WelcomeComponent.Model

class DefaultWelcomeComponent(
  private val componentContext: ComponentContext,
  private val onFinished: () -> Unit,
) : WelcomeComponent, ComponentContext by componentContext {

  // Consider preserving and managing the state via a store
  private val state = MutableValue(Model())
  override val model: Value<Model> = state

  override fun onUpdateGreetingText() {
    state.update { it.copy(greetingText = "Welcome from ${getPlatformName()}") }
  }

  override fun onBackClicked() {
    onFinished()
  }
}
