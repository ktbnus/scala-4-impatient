package ch9_traits.ex

/**
  * Created by Stas on 19/12/2017.
  */
trait IterableInputStream extends java.io.InputStream with Iterable[Byte] {

  //  override def iterator: Iterator[Byte] = ???
  override def iterator: Iterator[Byte] = new InputStreamIterator(this)

  class InputStreamIterator(outer: IterableInputStream) extends Iterator[Byte] {
    override def hasNext: Boolean = outer.available() > 0

    override def next(): Byte = outer.read().toByte
  }

}

class A {
  println("A Ctor")
}

class B {
  val getA2 = new A

  def getA = new A
}

object M123 extends App {
  val b = new B

  b.getA
  b.getA
  b.getA

  b.getA2
  b.getA2
}