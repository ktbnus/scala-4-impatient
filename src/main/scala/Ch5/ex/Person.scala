package Ch5.ex

/**
  * Created by Stas on 05/12/2017.
  */
class Person( fullName : String) {
  val firstName = fullName.head
  val lastName = fullName.tail
}

object MainPer {
  def main(args: Array[String]): Unit = {
    val p = new Person("ssfsfsf")
    println(p.lastName)
  }

}
