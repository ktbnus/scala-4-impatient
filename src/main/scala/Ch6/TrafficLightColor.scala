package Ch6

/**
  * Enums - the scala way
  */

object TrafficLightColor extends Enumeration {
  /*
  type TrafficLightColor = Value
   Alias. can now use TrafficLightColor.TrafficLightColor
   */
//  one way
//  val Red, Yellow, Green = Value

  // another way
  val Red = Value(0,"Stop")
  val Yellow = Value(10) // name = Yellow
  val Green = Value("Go") // id = 11
}



object EmumM extends App {
  // import TrafficLightColor._ for easier access to the colors
  println(TrafficLightColor.Green)

  doWhat(TrafficLightColor.Green)

  for ( c <- TrafficLightColor.values) println(s"${c.id}: $c")

  println(TrafficLightColor(0))
  println(TrafficLightColor.withName("Stop"))

  def doWhat( color : TrafficLightColor.Value) = {
    if ( color == TrafficLightColor.Red) "Stop"
    else if ( color == TrafficLightColor.Yellow) "hurry Up"
    else "Go!"
  }
}
