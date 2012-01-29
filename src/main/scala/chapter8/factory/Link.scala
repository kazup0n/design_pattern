package chapter8.factory

abstract class Link(caption:String, url:String) extends Item(caption) {
  
  def makeHTML(): String

}