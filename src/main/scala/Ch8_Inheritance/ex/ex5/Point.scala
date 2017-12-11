package Ch8_Inheritance.ex.ex5

class Point(val x: Double = 0, val y: Double = 0)

class LabeledPoint(val label: String, x: Double, y: Double) extends Point(x, y)
