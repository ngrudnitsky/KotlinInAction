package chapter04.part01

open class RichButton : Clickable {

  fun disable() {
    TODO("Not yet implemented")
  }

  open fun animate() {
    TODO("Not yet implemented")
  }

  override fun click() {
    TODO("Not yet implemented")
  }
}

abstract class Animated {
  abstract fun animate()

  open fun stopAnimating() {
    TODO("Not yet implemented")
  }

  fun animateTwice() {
    TODO("Not yet implemented")
  }
}