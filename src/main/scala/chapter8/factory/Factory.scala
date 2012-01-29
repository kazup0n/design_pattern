package chapter8.factory

abstract class Factory {

  
  
  def createLink(caption:String, url:String):Link
  def createTray(caption:String):Tray
  def createPage(title:String, author:String):Page
}

object Factory{
  def getFactory(className:String) =  Class.forName(className).newInstance().asInstanceOf[Factory]
}