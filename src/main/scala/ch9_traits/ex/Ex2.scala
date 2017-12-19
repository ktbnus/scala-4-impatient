package ch9_traits.ex

/**
  * Created by Stas on 19/12/2017.
  */

class OrderedPoint extends java.awt.Point with scala.math.Ordered[OrderedPoint] {
  override def compare(that: OrderedPoint): Int =
    if (x == that.x) y compare that.y
    else x compare that.x
}

object Ex2MPP {
  def main(args: Array[String]): Unit = {
    val p1 = new OrderedPoint()
    p1.x = 1
    p1.y = 1

    val p2 = new OrderedPoint
    p2.x = 1
    p2.y = 2

    val p3 = new OrderedPoint
    p3.x = 3
    p3.y = 3

    println(p1 < p1)
    println(p1 < p2)
    println(p1 < p3)
    println(p2 < p3)
  }
}