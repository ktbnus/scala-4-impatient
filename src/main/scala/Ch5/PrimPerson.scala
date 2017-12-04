package Ch5

/**
    Primary Constructor
  */

// name/age can also be private aond/or private[this]
// can also be used without var/val - it will be a regular paramter inside the code of the constructor
class PrimPerson(val name: String ="", var age: Int = 0){  // with default arguments
//class PrimPerson ( val name: String, var age : Int) {
  println("Just constructed another PrimPerson")
  def description = s"$name is $age years old"
}


object MainP {
  def main(args: Array[String]): Unit = {
    val prime = new PrimPerson("stas", 20)

    println(prime.age, prime.name)

    prime.age = 80

    println(prime.age, prime.name)

    println(prime.description)

    val p2 = new PrimPerson()
    println(p2.description)
  }
}


// class with  private Prim constructor
// must use Aux constructors to init this class
class PrivatePerson private(val id : Int){}