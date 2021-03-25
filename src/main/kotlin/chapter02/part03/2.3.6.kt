package chapter02.part03

import java.lang.IllegalArgumentException

fun eval2(expr: Expr): Int =
  if (expr is Num) {
    expr.value
  } else if (expr is Sum) {
    eval(expr.left) + eval(expr.right)
  } else throw IllegalArgumentException("Unknown expression")

fun main() {
  val expression = Sum(Sum(Num(1), Num(2)), Num(4))
  print(eval2(expression))
}
