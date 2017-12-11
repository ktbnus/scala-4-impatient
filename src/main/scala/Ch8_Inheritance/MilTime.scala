package Ch8_Inheritance

class MilTime(val time: Int) extends AnyVal {
  def minutes = time % 100

  def hours = time / 100

  override def toString: String = f"$time%04d"
}

object MilTime {
  def apply(t: Int): MilTime = {
    if (0 <= t && t < 2400 && t % 100 < 60) new MilTime(t)
    else throw new IllegalArgumentException
  }
}


object Mt extends App {
  val lunch = MilTime(1230)
  println(lunch)
  println(lunch.time)
  println(lunch.hours)
  println(lunch.minutes)
}