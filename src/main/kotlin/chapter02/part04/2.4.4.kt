package chapter02.part04

fun recognize(c: Char) = when (c) {
  in '0' .. '9' -> "It's a digit"
  in 'A' .. 'Z', in 'a'..'z' -> "It's a letter"
  else -> "HZ"
}

fun main() {
  recognize('8')
}
