package ch10_traits.ex

/**
  * Created by Stas on 19/12/2017.
  */

trait Logger {
  def log(msg: String): Unit
}

trait ConsoleLogger extends Logger {
  def log(msg: String): Unit = {
    println(s"$msg")
  }
}

trait CryptoLogger extends ConsoleLogger {
  val shift = 3

  override def log(msg: String): Unit = super.log(encrypt(msg))

  def encrypt(msg: String): String = {
    msg.map(x => (x + shift).toChar).mkString
  }
}

abstract class Worker extends Logger {
  def doSomeWork(x: String): Unit = {
    log(s"Done some work on $x")
  }
}

object Ex4M extends App {
  val acc = new Worker with CryptoLogger
  acc.doSomeWork("Hello")

  val acc1 = new {
    override val shift = -3
  } with Worker with CryptoLogger

  acc1.doSomeWork("Hello")
}