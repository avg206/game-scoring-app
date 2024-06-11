package com.avg206.gameScoringApp.shared.root

import com.arkivanov.decompose.router.stack.ChildStack
import com.arkivanov.decompose.value.Value
import com.avg206.gameScoringApp.shared.main.MainComponent
import com.avg206.gameScoringApp.shared.welcome.WelcomeComponent

interface RootComponent {

  val stack: Value<ChildStack<*, Child>>

  fun onBackClicked(toIndex: Int)

  sealed class Child {
    class Main(val component: MainComponent) : Child()
    class Welcome(val component: WelcomeComponent) : Child()
  }
}
