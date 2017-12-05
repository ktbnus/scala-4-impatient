package Ch5.ex

/**
  * Created by Stas on 04/12/2017.
  */
class Time(val hours: Int, val minutes : Int) {
  def before ( other : Time) : Boolean = {
    if ( hours < other.hours ) true
    if ( hours == other.hours) minutes < other.minutes

    false
  }
}

object MainTime {
  def main(args: Array[String]): Unit = {
    val t = new TimeV2(19,22)


    val v = t.before(new TimeV2(11,22))

    println(s"$v")

    //println(t.hours)
  }
}
