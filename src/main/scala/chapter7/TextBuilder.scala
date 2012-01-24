package chapter7

import scala.collection.immutable.List

class TextBuilder extends Builder {
  val builder = new StringBuilder()
  def makeTitle(title: String): Unit = {
    builder.append("===========================================")
    builder.append("「"+ title + "」\n")
    builder.append("\n")
  }

  def makeString(str: String): Unit = {
    builder.append("■" + str + "\n")
    builder.append("\n")
  }

  def makeItems(items: List[String]): Unit = {
    for(item <- items){
      builder.append(" * " + item + "\n")
    }
    builder.append("\n")
  }

  def close(): Unit = {
    builder.append("===========================================")
  }
  
  def getResult():String = builder.toString()
  

}