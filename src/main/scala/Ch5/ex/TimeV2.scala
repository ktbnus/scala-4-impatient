package Ch5.ex

/**
  * Created by Stas on 04/12/2017.
  */
class TimeV2( val hours : Int, val minutes : Int) {
  private val value = hours * 60 + minutes

  def before ( other : TimeV2 ) : Boolean = {
    println("in before")
    value < other.value
  }
}
