package Ch6.ex

class Point(  x: Int = 0,  y: Int = 0) extends java.awt.Point(x,y){}

object Point {
  def apply(x: Int, y: Int ) : Point =  new Point(x, y)
}

object Pm extends App {
  println(Point(1,2))
}
