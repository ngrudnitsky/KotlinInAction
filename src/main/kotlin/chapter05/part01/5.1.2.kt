package chapter05.part01

data class Person(val name: String, val age: Int)

fun main() {
  val people = listOf<Person>(Person("Nick", 23), Person("Alice", 19), Person("Bob", 31))
  people.maxBy(Person::age)
  people.maxBy { it.age }
}