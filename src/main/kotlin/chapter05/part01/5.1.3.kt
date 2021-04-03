package chapter05.part01

fun main() {
  val sum = { x: Int, y: Int -> x + y }
  print(sum(1, 2))

  val people = listOf<Person>(Person("Nick", 23), Person("Alice", 19), Person("Bob", 31))
  people
    //.joinToString(separator = " ", transform = { p: Person -> p.name })
    .joinToString(" ") { p: Person -> p.name }
}
