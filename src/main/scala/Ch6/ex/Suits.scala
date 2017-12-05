package Ch6.ex

object Suits extends Enumeration {
  //type Suits = Value
  val Spade = Value("♠")
  val Club = Value("♣")
  val Heart = Value("♥")
  val Diamond = Value("♦")

  def isRed(suit : Suits.Value) : Boolean = suit == Suits.Heart || suit == Suits.Diamond
}

object Sm extends App {
  println( for ( s <- Suits.values) yield (s, Suits.isRed(s)))
}