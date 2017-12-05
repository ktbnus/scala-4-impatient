package Ch6.ex

abstract class UnitConversions( private val rate : Double) {
  def convert( value : Double) : Double = value * rate
}

object MilesToKillometers extends  UnitConversions(1.6)


object CovertMain extends App {
  println( MilesToKillometers.convert(2))
}