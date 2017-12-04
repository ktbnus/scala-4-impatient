package Ch5

/**
  * Created by Stas on 04/12/2017.
  */
class ConstPerson {
  private var name = ""
  private var age = 0

  def this(name: String) {
    this()
    this.name = name
  }

  def this(name: String, age: Int) {
    this(name)
    this.age = age
  }
}
