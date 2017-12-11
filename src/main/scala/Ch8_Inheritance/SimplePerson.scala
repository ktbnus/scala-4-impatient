package Ch8_Inheritance

abstract class BasePerson {
  def id: Int
}

class SimplePerson(val name: String) extends BasePerson {
  val id = 9

  override def toString: String = s"${getClass.getName}[name=$name]"
}

class SecretAgent(override val id: Int, codeName: String) extends SimplePerson(codeName) {
  // we are overiding the getter, not the actual field
  override val name = "secret" // dont want to revel name
  override val toString = "secret" //   or the class name
}


object SomeMain extends App {
  val sp = new SimplePerson("Simple name")
  val agent = new SecretAgent(777, "777")

  println(s"Simple -> ${sp.name}")
  println(s"Agent -> ${agent.name}")

  println(sp.toString)
  println(agent.toString)
  println("agent id: " + agent.id)
  println("simple person id: " + sp.id)
}