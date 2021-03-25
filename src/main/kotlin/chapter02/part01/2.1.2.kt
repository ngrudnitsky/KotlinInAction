package chapter02.part01

fun main() {
    println(max1(1, 2))
    println(max2(1, 2))
    println(max3(1, 2))
}

fun max1(a: Int, b: Int): Int {
    return if (a > b) a else b
}

fun max2(a: Int, b: Int): Int = if (a > b) a else b

fun max3(a: Int, b: Int) = if (a > b) a else b