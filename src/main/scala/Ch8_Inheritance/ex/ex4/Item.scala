package Ch8_Inheritance.ex.ex4

import scala.collection.mutable

abstract class Item {
  def price: Double

  def description: String
}

class Simpleitem(val price: Double, val description: String) extends Item

class Bundle extends Item {

  val items: mutable.MutableList[Item] = mutable.MutableList[Item]()

  override def price = items.map(_.price).sum

  override def description: String = items.map(_.description).mkString("[", ",", "]")

  def add(item: Item) = items += item
}


object Shop extends App {
  val cart = new Bundle

  cart.add(new Simpleitem(10, "Somethign"))
  cart.add(new Simpleitem(1, "else"))

  println(cart.description)
  println(cart.price)
}


