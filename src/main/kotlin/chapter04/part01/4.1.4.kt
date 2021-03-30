package chapter04.part01

import java.io.Serializable

interface State : Serializable

interface View {
  fun getCurrentState(): State
  fun restoreState(state: State) {}
}

class Button1 : View {
  override fun getCurrentState(): State = ButtonState()

  class ButtonState : State
}

class Outer {
  inner class Inner {
    fun getOuterReference() = this@Outer
  }
}