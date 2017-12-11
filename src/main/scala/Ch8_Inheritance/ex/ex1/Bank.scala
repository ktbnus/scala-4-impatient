package Ch8_Inheritance.ex.ex1

object Bank extends App {
  val account = new CheckingAccount(100)

  account.deposite(100)

  println(account)
}
