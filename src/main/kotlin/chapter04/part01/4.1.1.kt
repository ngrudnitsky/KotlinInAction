package chapter04.part01

fun main() {
  val button = Button()
  button.showOff()
  button.click()
  button.setFocus(true)
}

interface Clickable {
  fun click()
  fun showOff() = println("I'm clickable")
}

interface Focusable {
  fun setFocus(b: Boolean) = println("I ${if (b) "got" else "lost"} focus")
  fun showOff() = println("I'm focusable")
}

class Button : Clickable, Focusable {
  override fun click() = println("Button was clicked")
  override fun showOff() {
    super<Clickable>.showOff()
    super<Focusable>.showOff()
  }
}
