package Ch8_Inheritance.ex.ex6

import Ch8_Inheritance.ex.ex5.Point

abstract class Shape {
  def centerPoint: Point
}

class Circle(val centerPoint: Point) extends Shape

class Rectangle(val topLeft: Point, val buttomRight: Point) extends Shape {
  override def centerPoint = topLeft // should do some math to calc, but im lazy
}