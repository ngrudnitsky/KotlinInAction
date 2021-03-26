@file:JvmName("StringFunctions")
package chapter03.part02

import java.lang.StringBuilder

fun main() {
  val list = listOf(1, 2, 3)
  joinToString2(list)
  joinToString2(list, "; ")
  joinToString2(list, prefix =  "(",  postfix = ")")
}

@JvmOverloads
fun <T> joinToString2(
  collection: Collection<T>,
  separator: String = ", ",
  prefix: String = "",
  postfix: String = ""
): String {
  val result = StringBuilder(prefix)
  for ((index, element) in collection.withIndex()) {
    if (index > 0) result.append(separator)
    result.append(element)
  }
  result.append(postfix)
  return result.toString()
}
