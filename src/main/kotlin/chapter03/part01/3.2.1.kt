package chapter03.part01

val set = hashSetOf(1, 2, 3)
val list = arrayListOf(1, 2, 3)
val map = mapOf(1 to "One", 2 to "Two", 3 to "Three")

fun main() {
  println(set.javaClass)
  println(list.javaClass)
  println(map.javaClass)
}