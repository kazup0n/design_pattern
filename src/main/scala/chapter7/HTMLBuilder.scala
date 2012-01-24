package chapter7

import scala.collection.immutable.List

class HTMLBuilder extends Builder {
  val builder = new StringBuilder()
  
  def makeTitle(title: String): Unit = {
    start("html").nl()
    start("head").nl()
    	indent().start("title").text(title).end("title").nl().end("head").nl()
    start("body").nl()
    tag("h1", title).nl()
  }

  def makeString(str: String): Unit = {tag("p", str).nl()}

  def makeItems(items: List[String]): Unit = {
    start("ul").nl()
    for(item <- items){
      indent().tag("li", item).nl()
    }
    end("ul").nl()
  }

  def close(): Unit = { end("body").end("html") }


  def getResult(): String = builder.toString()
  
  private def tag(tag:String, text:String):HTMLBuilder = start(tag).text(text).end(tag)

  private def nl():HTMLBuilder = text("\n")
  
  private def start(tag:String):HTMLBuilder = text("<" + tag + ">")

  private def indent():HTMLBuilder = text("\t")
  
  private def end(tag:String):HTMLBuilder = text("</"+ tag + ">")
  
  private def text(text:String):HTMLBuilder = {
    builder.append(text)
    return this
  }
  

}