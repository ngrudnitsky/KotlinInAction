package chapter02.part03

enum class Color(
  val r: Int,
  val g: Int,
  val b: Int
) {
  RED(255, 0, 0), GREEN(0, 255, 0), BLUE(0, 0, 255), PURPLE(128, 0, 128),
  YELLOW(1128, 128, 0), CYAN(0, 128, 128);

  fun rgb() = (r * 256 + g) * 256 + b
}

fun main() {
  println(Color.GREEN.rgb())
}