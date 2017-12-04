package Ch5

import scala.collection.mutable.ArrayBuffer


class Network( val name: String) { outer => // reference to Network.this
  class Member( val name: String) {
    val contacts = new ArrayBuffer[Member]

    def description = s"$name inside ${outer.name}"
  }

  private val members = new ArrayBuffer[Member]

  def join(name : String) = {
    val m = new Member(name)
    members += m
    m
  }
}

class MainNet {
  def main(args: Array[String]): Unit = {
    val chatter = new Network("chatter")
    val myFace = new Network("myFace")

    // chatter and myFace have a different class Member
  }
}
