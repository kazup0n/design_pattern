package chapter8.factory.list

import chapter8.factory.Tray

private[list] class ListTray(caption:String) extends Tray(caption) {

  def makeHTML(): String = { 
    val builder = new StringBuilder()
    builder.append("<li>\n")
    builder.append(caption + "\n")
    builder.append("<ul>\n")
    
    for(val item <- tray) {
      builder.append(item.makeHTML())
    }
    
    builder.append("</ul>\n")
    builder.append("</li>\n")
    return builder.toString()
  }

}