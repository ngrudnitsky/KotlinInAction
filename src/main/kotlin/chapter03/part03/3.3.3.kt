package chapter03.part03

import java.lang.StringBuilder

fun Collection<String>.joinToString(
  separator: String = ", ",
  prefix: String = "",
  postfix: String = ""
): String {
  val result = StringBuilder(prefix)

  for ((index, element) in withIndex()) {
    if (index > 0) result.append(separator)
    result.append(element)
  }
  result.append(postfix)
  return result.toString()
}

fun main() {
  print(listOf("1", "2", "3").joinToString())
}