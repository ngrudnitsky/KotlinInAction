package chapter04.part04

interface JSONFactory<T> {
  fun fromJson(jsonText: String): T
}

data class Person1(val name: String) {
  companion object : JSONFactory<Person1> {
    override fun fromJson(jsonText: String): Person1 = Person1(jsonText)
  }
}

fun <T> load(factory: JSONFactory<T>): T {
  return factory.fromJson("123")
}

fun main() {
  print(load(Person1))
}