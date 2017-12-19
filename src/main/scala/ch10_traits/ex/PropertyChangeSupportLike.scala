package ch10_traits.ex

import java.beans.{PropertyChangeEvent, PropertyChangeListener, PropertyChangeSupport}

/**
  * Created by Stas on 19/12/2017.
  */
trait PropertyChangeSupportLike {
  private val support = new PropertyChangeSupport(this)

  def fireIndexedPropertyChange(propertyName: String, index: Int, oldValue: Int, newValue: Int): Unit = support.fireIndexedPropertyChange(propertyName, index, oldValue, newValue)

  def firePropertyChange(propertyName: String, oldValue: scala.Any, newValue: scala.Any): Unit = support.firePropertyChange(propertyName, oldValue, newValue)

  def getPropertyChangeListeners(propertyName: String): Array[PropertyChangeListener] = support.getPropertyChangeListeners(propertyName)

  def addPropertyChangeListener(listener: PropertyChangeListener): Unit = support.addPropertyChangeListener(listener)

  def fireIndexedPropertyChange(propertyName: String, index: Int, oldValue: scala.Any, newValue: scala.Any): Unit = support.fireIndexedPropertyChange(propertyName, index, oldValue, newValue)

  def removePropertyChangeListener(propertyName: String, listener: PropertyChangeListener): Unit = support.removePropertyChangeListener(propertyName, listener)

  def addPropertyChangeListener(propertyName: String, listener: PropertyChangeListener): Unit = support.addPropertyChangeListener(propertyName, listener)

  def removePropertyChangeListener(listener: PropertyChangeListener): Unit = support.removePropertyChangeListener(listener)

  def fireIndexedPropertyChange(propertyName: String, index: Int, oldValue: Boolean, newValue: Boolean): Unit = support.fireIndexedPropertyChange(propertyName, index, oldValue, newValue)

  def getPropertyChangeListeners: Array[PropertyChangeListener] = support.getPropertyChangeListeners

  def firePropertyChange(event: PropertyChangeEvent): Unit = support.firePropertyChange(event)

  def firePropertyChange(propertyName: String, oldValue: Int, newValue: Int): Unit = support.firePropertyChange(propertyName, oldValue, newValue)

  def hasListeners(propertyName: String): Boolean = support.hasListeners(propertyName)

  def firePropertyChange(propertyName: String, oldValue: Boolean, newValue: Boolean): Unit = support.firePropertyChange(propertyName, oldValue, newValue)
}

class PropertyPoint(x: Int, y: Int) extends java.awt.Point(x, y) with PropertyChangeSupportLike {
  def this() = this(0, 0)

  override def move(x: Int, y: Int): Unit = {
    super.move(x, y)
    firePropertyChange(new PropertyChangeEvent(this, "x", "old x", "new x"))
  }
}

object Ex5M extends App {
  val p = new PropertyPoint(1, 1)
  p.addPropertyChangeListener((evt: PropertyChangeEvent) => println(evt.toString))

  p.move(10, 10)
}


