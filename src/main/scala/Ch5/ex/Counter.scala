package Ch5.ex

/**
  * Created by Stas on 04/12/2017.
  */
class Counter {
  private var value = 0

  def inc () : Unit =  if ( value < Int.MaxValue) value += 1

  def current = value
}
