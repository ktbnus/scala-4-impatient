package Ch8_Inheritance

// def .eq method checks reference equality
// def .equals calls .eq

// can just use ==
class Item(val description: String, val price: Int) {
  final override def equals(other: scala.Any): Boolean = {
    other.isInstanceOf[Item] && {
      val that = other.asInstanceOf[Item]
      description == that.description && price == that.price
    }
  }

  // ## null safe hashcode
  final override def hashCode(): Int = (description, price).##

  // or with pattern matching

  def mEquals(other: Any): Boolean = {
    other match {
      case that: Item => description == that.description && price == that.price
      case _ => false
    }
  }
}

class BetterItem(val color: String) extends Item("fd", 6) {

}