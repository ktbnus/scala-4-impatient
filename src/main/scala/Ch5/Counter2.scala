package Ch5

/**
  * Created by Stas on 04/12/2017.
  */
class Counter2 {
  private var value = 0  // value is object private => private[this] . can only access this object's field
  def inc()  { value += 1}
  def isLess ( other : Counter2 ) = value < other.value // can access
}

object MainC2 {
  def main(args: Array[String]): Unit = {
    val c1 = new Counter2
    val c2 = new Counter2

    c2.inc()

    println(c1.isLess(c2))
  }
}
