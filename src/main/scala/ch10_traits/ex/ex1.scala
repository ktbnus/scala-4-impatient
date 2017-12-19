package ch10_traits.ex

import java.awt.geom.Ellipse2D

/**
  * Created by Stas on 19/12/2017.
  */
trait RectngleLike {
  def translate(x: Double, y: Double): Unit = ()

  def grow(h: Double, v: Double): Unit = ()

  def getWidth: Double

  def getHeight: Double

  def getX: Double

  def getY: Double

  def setFrame(x: Double, y: Double, w: Double, h: Double): Unit
}

object Ex1M extends App {
  val egg = new Ellipse2D.Double(5, 10, 20, 30) with RectngleLike

}
