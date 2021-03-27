package chapter03.part03

import java.lang.StringBuilder

fun main() {
  println("Kotlin".lastChar)
  println(StringBuilder("Kotlin").lastChar)
}

val String.lastChar: Char get() = get(length - 1)

var StringBuilder.lastChar: Char
  get() = get(length - 1)
  set(value: Char) {
    setCharAt(length - 1, value)
  }