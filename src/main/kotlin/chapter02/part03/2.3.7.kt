package chapter02.part03

import java.lang.IllegalArgumentException

fun eval3(expr: Expr): Int =
  when (expr) {
    is Num -> {
      println("num ${expr.value}")
      expr.value
    }
    is Sum -> {
      val first = eval3(expr.left)
      val right = eval3(expr.right)
      println("sum: $first + $right")
      first + right
    }
    else -> throw IllegalArgumentException("Unknown expression")

  }

fun main() {
  val expression = Sum(Sum(Num(1), Num(2)), Num(4))
  print(eval3(expression))
}
