package chapter02.part03

import chapter02.part03.Color.*

fun getTemperature(color: Color) =
  when (color) {
    GREEN -> "Natural"
    BLUE -> "Cold"
    RED -> "Worm"
    else  -> "Unknown Temperature"
  }

fun main() {
  println(
    getTemperature(
      GREEN
    )
  )
}