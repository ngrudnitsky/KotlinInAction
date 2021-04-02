package chapter04.part04

import java.util.Comparator

object Payroll {
  val allEmployees = arrayListOf<Person>()

  fun calculateSalary() {
    for (person in allEmployees) {
      // TODO: 4/2/2021
    }
  }
}

data class Person(val name: String) {
  object NameComparator : Comparator<Person> {
    override fun compare(o1: Person, o2: Person): Int =
      o1.name.compareTo(o2.name)
  }
}