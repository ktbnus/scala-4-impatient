package Ch5

/**
  * Created by Stas on 04/12/2017.
  */
class Message {
  val timeStamp = java.time.Instant.now // will generate only public getter
}

object MainM{
  def main(args: Array[String]): Unit = {
    val message = new Message

    println(message.timeStamp)
  }
}
