package chapter8.factory

import scala.collection.mutable.ListBuffer

abstract class Tray(caption:String) extends Item(caption) {
  protected val tray = ListBuffer[Item]()
  def makeHTML(): String
  def add(item:Item) { tray.append(item)}

}