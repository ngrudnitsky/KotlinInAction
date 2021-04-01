package chapter04.part02

fun main() {
  val nikita = User("Nikita")
  val bob = User("Bob", isSubscribed = false)
}

open class User(val nickname: String, val isSubscribed: Boolean = true)

class TwitterUser(nickname: String) : User(nickname)

class Secretive private constructor()

class User1 constructor(nickname: String) {
  val nickname: String

  init {
    this.nickname = nickname
  }
}

class User2 constructor(nickname: String) {
  val nickname = nickname
}