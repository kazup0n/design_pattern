package chapter8.factory.list

import scala.collection.immutable.List

private[list] class HTMLBuilder {
  val builder = new StringBuilder()
  
  def makeTitle(title: String): HTMLBuilder = {
    start("html").nl()
    start("head").nl()
    	indent().start("title").text(title).end("title").nl().end("head").nl()
    start("body").nl()
    tag("h1", title).nl()
  }

  def makeString(str: String): Unit = {tag("p", str).nl()}

  def makeItems(items: List[String]): HTMLBuilder = {
    start("ul").nl()
    for(item <- items){
      indent().tag("li", item).nl()
    }
    end("ul").nl()
  }

  def close(): HTMLBuilder = { end("body").end("html") }


  def getResult(): String = builder.toString()
  
  def tag(tag:String, text:String):HTMLBuilder = start(tag).text(text).end(tag)

  def nl():HTMLBuilder = text("\n")
  
  def start(tag:String):HTMLBuilder = text("<" + tag + ">")

  def indent():HTMLBuilder = text("\t")
  
  def end(tag:String):HTMLBuilder = text("</"+ tag + ">")
  
  def text(text:String):HTMLBuilder = {
    builder.append(text)
    return this
  }
  

}