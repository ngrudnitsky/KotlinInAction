package chapter03.part03

//fun String.lastChar() = this.get(this.length - 1)
fun String.lastChar() = get(length - 1)

fun main() {
  print("Kotlin".lastChar())
}