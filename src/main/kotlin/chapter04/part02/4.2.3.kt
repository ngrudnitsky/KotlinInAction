package chapter04.part02

interface UserAccount {
  val nickname: String
}

class PrivateUser(override val nickname: String) : UserAccount

class SubscribingUser(val email: String) : UserAccount {
  override val nickname: String
    get() = email.substringBefore('@')
}

class FacebookUser(val accountId: Int) : UserAccount {
  override val nickname = init(accountId)
}

private fun init(accountId: Int): String {
  return accountId.toString()
}
