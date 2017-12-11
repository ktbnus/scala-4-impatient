package Ch8_Inheritance

object AnonSubclass extends App {
  val alien = new Person("Pred", 11) {
    def greeting = "Greetings, my mame is Fred."
  }

  def meet(p: Person {def greeting: String}): Unit = {
    println(s"Says ${p.greeting}")
  }

  meet(alien)
}
