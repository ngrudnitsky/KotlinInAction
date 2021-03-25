package chapter02.part02

class Rectangle(
  val height: Int,
  val width: Int
) {
  val isSquare: Boolean
    get() = height == width
}

fun main() {
  println(Rectangle(1, 1).isSquare)
}