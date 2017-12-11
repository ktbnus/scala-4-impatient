package Ch8_Inheritance.ex.ex7

class Squre(x: Int = 0, y: Int = 0, width: Int = 0) extends java.awt.Rectangle(x, y, width, width) {
  def this(width: Int) = this(0, 0, width)

  def this() = this(0, 0, 0)
}
