package chapter04.part02

class Account(val name: String) {
  var address: String = "unspecified"
    set(value: String) {
      println(
        """
      Address was changed for $name:
      "$field" -> "$value".
    """.trimIndent()
      )
      field = value
    }
    get() {
      println("Get address ")
      return field
    }
}

fun main() {
  val account = Account("Nick")
  account.address = "Address"
  print(account.address)
}
