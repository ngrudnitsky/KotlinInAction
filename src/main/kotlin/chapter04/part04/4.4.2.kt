package chapter04.part04

fun main() {
  val newSubscribingUser = User.newSubscribingUser("123")
}

class User private constructor(val nickname: String) {
  companion object {
    fun newSubscribingUser(email: String) = User(email.substringBefore('@'))

    fun newFacebookUser(facebookAccountId: Int) = User(facebookAccountId.toString())
  }
}