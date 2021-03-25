package chapter02.part03

import chapter02.part03.Color.*

fun mix(color1: Color, color2: Color) =
  when (setOf(color1, color2)) {
    setOf(RED, BLUE) -> PURPLE
    setOf(RED, GREEN) -> YELLOW
    setOf(BLUE, GREEN) -> CYAN
    else -> throw Exception("dirty color")
  }

fun main() {
  println(
    mix(
      GREEN, BLUE
    )
  )
}