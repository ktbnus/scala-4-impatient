package ch10_traits

trait TimeStampLogger extends ConsoleLogger {
  override def log(msg: String): Unit = {
    super.log(s"${java.time.Instant.now()} $msg")
  }
}

trait ShortLogger extends ConsoleLogger {
  val maxLength = 15

  override def log(msg: String): Unit = {
    super.log(if (msg.length <= maxLength) msg else s"${msg.substring(0, maxLength - 3)}...")
  }
}

trait DynamicShortLogger extends ConsoleLogger {
  val maxLength: Int

  override def log(msg: String): Unit = {
    super.log(if (msg.length <= maxLength) msg else s"${msg.substring(0, maxLength - 3)}...")
  }
}

class SomeClassWithALogger extends DynamicShortLogger {
  val maxLength: Int = 10
}

class B(val maxLength: Int = 20) extends DynamicShortLogger {

}

trait SmartLogger {
  def log(msg: String)

  def info(msg: String) {
    log(s"INFO: $msg")
  }

  def warn(msg: String) {
    log(s"WARN: $msg")
  }

  def sever(msg: String) {
    log(s"SEVERE: $msg")
  }
}

object Layeredm extends App {
  val acc1 = new SavingsAccount with TimeStampLogger with ShortLogger
  val acc2 = new SavingsAccount with ShortLogger with TimeStampLogger

  acc1.withdraw(1000000)
  acc2.withdraw(1000000)
}