package chapter03.part02

fun main() {
  print(
    joinToString(
      listOf(1, 2, 3), separator = " ", prefix = " ", posfix = " "
    )
  )
}