package chapter03.part02

import java.lang.StringBuilder

fun <T> joinToString(
  collection: Collection<T>,
  separator: String,
  prefix: String,
  posfix: String
): String {
  val result = StringBuilder(prefix)
  for ((index, element) in collection.withIndex()) {
    if (index > 0) result.append(separator)
    result.append(element)
  }
  result.append(posfix)
  return result.toString()
}

fun main() {
  val list = listOf(1, 2, 3)
  println(list)
  println(joinToString(list, "; ", "(", ")"))
}