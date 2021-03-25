package chapter02.part0

fun main(args: Array<String>) {
  println("Hello ${if (args.isNotEmpty()) args[0] else "Nick"}!")
}