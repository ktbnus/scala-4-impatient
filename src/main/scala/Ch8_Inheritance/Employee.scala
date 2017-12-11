package Ch8_Inheritance

/*
protected modifier - > as well as protected[This] modifier
 */

// Only Prim C'tor can call a super-class C'tor
class Employee(name: String, age: Int, _salary: Double) extends Person(name, age) {
  val salary = _salary

  override def toString: String = s"${super.toString}[salary=$salary]"
}


object EmMain extends App {
  val p = new Person("Name", 20)
  val e = new Employee("Sta", 33, 33)

  println(p.toString)
  println(e.toString)

  if (e.isInstanceOf[Person]) {
    println(s"$e is a person")
    println("now print e as a person " + e.asInstanceOf[Person].toString)
  }

  println("*********")

  println(p.getClass)
  println(e.getClass)

  if (e.getClass == classOf[Person]) println("Same class")
  else println("Not same class")

  // easier to do with pattern matching

  p match {
    case s: Employee => println("P match Employee")
    case _ => println("P match no Employee")
  }


}