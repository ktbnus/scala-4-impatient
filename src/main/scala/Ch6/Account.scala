package Ch6


// private C'tor
class Account private ( val id : Int, initialeBalance : Double) {
//  val id = Account.newUniqueNumber()
  private var balance = initialeBalance

  def deposit (amount : Double ): Unit = balance += amount

}

object Account {
  private var lastNumber = 0

  println("Const`")

  def apply ( initialBalance : Double) : Account = new Account(Account.newUniqueNumber(), initialBalance)

  def newUniqueNumber() = { lastNumber += 1; lastNumber }
}

object AccountM extends App {

  if ( args.length  > 0) println(f"hello ${args(0)}")

  println(Account.newUniqueNumber())
  println(Account.newUniqueNumber())
  println(Account.newUniqueNumber())
}

/*
scalac Hello.scala
scala -Dscala.time Hello Fred
O
will give out the execution time of the app
 */