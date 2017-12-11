package Ch8_Inheritance

abstract class AbstructPerson(val name: String) {
  // abstruct field
  val color: String
  var weight: Double

  def id: Int
}

class AEmployee(name: String) extends AbstructPerson(name) {
  val color = "black"
  var weight = 5.5

  def id = name.hashCode // no need for over ride
}


object MAB extends App {
  val em = new AEmployee("stas")

  println(s"name: ${em.name} id ${em.id}")

  // can create a custom one as a anon sub class
  val fred = new AbstructPerson("Fred") {
    val id: Int = 9
    val color: String = "Yello"
    var weight: Double = 4.4
  }
}