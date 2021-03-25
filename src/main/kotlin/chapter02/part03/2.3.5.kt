package chapter02.part03

import java.lang.IllegalArgumentException

interface Expr
class Num(val value: Int): Expr
class Sum(val left: Expr, val right: Expr): Expr

fun eval(expr: Expr): Int {
   if (expr is Num) {
     return expr.value
   }
  if (expr is Sum) {
    return eval(expr.left) + eval(expr.right)
  }
  throw IllegalArgumentException ("Unknown expression")
}

fun main() {
  val expression = Sum(Sum(Num(1), Num(2)), Num(4))
  print(eval(expression))
}
