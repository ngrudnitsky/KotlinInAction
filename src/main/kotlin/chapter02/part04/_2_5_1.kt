package chapter02.part04

fun fizzBuzz(i: Int) = when {
  i % 15 == 0 -> "FizzBuzz\n"
  i % 3 == 0 -> "Fizz\n"
  i % 5 == 0 -> "Buzz\n"
  else -> "$i\n"
}

fun main() {
  for (i in 1..100) {
    print(fizzBuzz(i))
  }
  for (i in 100 downTo 1 step 2) {
    print(fizzBuzz(i))
  }
  for (i in 1 until 100) {
    print(fizzBuzz(i))
  }
}