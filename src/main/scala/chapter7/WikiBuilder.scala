package chapter7

import scala.collection.immutable.List

class WikiBuilder extends Builder {

  val builder = new StringBuilder()
  
  def makeTitle(title: String): Unit = {line("= " + title + " =")}

  def makeString(str: String): Unit = {nl().append(str).nl()}

  def makeItems(items: List[String]): Unit = {
    for(item <- items){
      line(" * " + item)
    }
    
  }

  def close(): Unit = {}

  def getResult(): String = builder.toString()
  
  private def nl() = append("\n")
  
  private def line(text:String) = append(text).nl()
  
  private def append (text:String):WikiBuilder = {
    builder.append(text)
    return this
  }

}