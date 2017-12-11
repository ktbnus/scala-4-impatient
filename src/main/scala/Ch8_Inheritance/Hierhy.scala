package Ch8_Inheritance

object Hierhy extends App {
  def printAny(x: Any): Unit = println(x)

  def printUnit(x: Unit): Unit = println(x)


  printAny("Hello")
  printUnit("Hello")

  printUnit(())


  def show(o: Any) = println(s"${o.getClass}: $o")

  show(3)
  show(1, 2, 3)
}
