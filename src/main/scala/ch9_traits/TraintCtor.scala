package ch9_traits

import java.io.PrintWriter

trait FileLogger extends Logger {
  // Constructor
  val out = new PrintWriter("app.log")
  out.println(s"# ${java.time.Instant.now()}")

  def log(msg: String): Unit = {
    out.println(msg)
    out.flush()
  }
}

class CtorSavingsAccount extends Account with FileLogger with ShortLogger {}

// the order
/*
Account - super class
Logger - parent traint
File logger - first trait
short logger
Savings Account
 */


// Trait with constractor param - can't be done ,but can be hacked

trait FileLogger2 extends Logger {
  // Constructor
  val fileName = "myapp.log"
  // or this can be made lazy
  // lazy  val out = new PrintWriter(fileName)
  val out = new PrintWriter(fileName)
  out.println(s"# ${java.time.Instant.now()}")

  def log(msg: String): Unit = {
    out.println(msg)
    out.flush()
  }
}

// with early defenition
class HackySavingsAccount extends {
  override val fileName = "savingsAccount"
}
  with Account with FileLogger2 {

}