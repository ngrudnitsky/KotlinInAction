package chapter02.part03

import chapter02.part03.Color.*

fun mix2(color1: Color, color2: Color) =
  when {
    (color1 == RED && color2 == BLUE ||
        color1 == BLUE && color2 == RED) -> PURPLE
    else -> throw Exception("dirty color")
  }

fun main() {
  println(
    mix2(
      RED, BLUE
    )
  )
}