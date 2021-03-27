package chapter03.part04

fun main(args: Array<String>) {
  val listOf = listOf("args: ", *args)

  val map = mapOf(1.to("one"), 2 to "two")
}

infix fun Any.to2(other: Any) = Pair(this, other)
