package Ch5

import scala.beans.BeanProperty

/**
  * Created by Stas on 04/12/2017.
  */
class BeanPerson {
  @BeanProperty
  var name : String = _
}


object MainBean {
  def main(args: Array[String]): Unit = {
    val p = new BeanPerson
    p.name = "stas"

    println(p.name)
  }
}