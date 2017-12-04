package Ch5

/*
  5.1

  Call mutator ( changing  state ) with ()
  Call Accessors ( no state change ) without  ()
 */
class Counter {
  private var value = 0;  // must init the field

  // public by default
  def increment () { value += 1}
  def current () = value

  def forceCurrent = value;
}


object Main {
  def main(args: Array[String]): Unit = {
    val myCounter = new Counter
    myCounter.increment()
    println(myCounter.current())
    println(myCounter.current)

    myCounter.increment()
    println(myCounter.forceCurrent)


    var cur = myCounter.forceCurrent
    cur = 100
     println(myCounter.forceCurrent)
  }
}
