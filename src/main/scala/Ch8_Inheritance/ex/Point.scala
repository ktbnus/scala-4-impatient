package Ch8_Inheritance.ex

class Point private(private val coordinate: Long) extends AnyVal {
  def x = 1

  def y = 3
}

object Point {
  def apply(x: Int, y: Int): Point = {
    new Point(x + y)
  }
}

object Pm extends App {
  val p = Point(10, 4)

  println(p.x)
}


// https://stackoverflow.com/questions/12772939/java-storing-two-ints-in-a-long