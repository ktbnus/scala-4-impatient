package ch9_traits

import java.io.IOException

trait LoggedException extends Exception with ConsoleLogger {
  def log() {
    log(getMessage)
  }
}

class UnhappyException extends LoggedException {
  override def getMessage: String = "arrgh!"
}

class HappyException extends IOException with LoggedException {
  override def getMessage: String = "YAY!!"
}