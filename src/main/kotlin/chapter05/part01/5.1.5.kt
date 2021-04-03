package chapter05.part01

val createPerson = ::Person
val person = createPerson("Nick", 23)

fun Person.isAdult() = age >= 21
val predicate = Person::isAdult
val predicate2 = person::isAdult

fun main() {
  println(person)
  println(predicate(person))
  println(predicate2())
}