package ch9_traits

// gerente that any subclass will extend exception
//, but does not extend Exception by itself

trait LoggerException2 extends ConsoleLogger {
  this: Exception =>
  def log() {
    log(getMessage)
  }
}

// only classes that have a matching gerMEssage can mix this trait
trait LoggedExceptoin3 extends ConsoleLogger {
  this: {def getMessage(): String} =>
  def log() {
    log(getMessage())
  }
}