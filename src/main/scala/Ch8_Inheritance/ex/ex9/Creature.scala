package Ch8_Inheritance.ex.ex9

class Creature {
  val env: Array[Int] = new Array[Int](range)

  def range: Int = 10
}


class Ant extends Creature {
  override def range: Int = 2
}

object MA extends App {
  val ant = new Ant

  println(ant.range)
  println(ant.env.length)
}