package ch9_traits

trait Logger {
  def log(msg: String)
}

class ConsoleLoggerClass extends Logger with Cloneable with Serializable {
  def log(msg: String): Unit = println(msg) // override not required
}

trait ConsoleLogger {
  def log(msg: String) {
    println(msg)
  }
}

class Account {}

class SavingsAccount extends Account with ConsoleLogger {
  def withdraw(amount: Double): Unit = {
    if (amount < 0) log("No money")
    else log("Good Money")
  }
}

abstract class AbSavingAccount extends Account with Logger {
  def withdraw(amount: Double): Unit = {
    if (amount < 0) log("No money")
    else log("Good Money")
  }
}

object Manp extends App {
  // Object with a trait
  val acct = new AbSavingAccount with ConsoleLogger
  acct.log("Something")
}