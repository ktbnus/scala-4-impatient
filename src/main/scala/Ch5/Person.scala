package Ch5

/**
  * Created by Stas on 04/12/2017.
  */
class Person {
  var age  = 0  // wiil create getters and setters

  private var privateAge = 0

  // custom getters and setters
  def pAge = privateAge
  def pAge_= (newValue: Int) {
    if(newValue > privateAge) privateAge = newValue
  }
}

object Main1 {
  def main(args: Array[String]): Unit = {
    val p = new Person

    p.age = 10

    println(p.age)

    p.pAge = 22

    println(p.pAge)
  }
}
