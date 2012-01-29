package chapter8.factory.list

import chapter8.factory.Link

private[list] class ListLink(caption: String, url: String) extends Link(caption, url) {

  def makeHTML(): String = "<li><a href=\"" + url + "\">" + caption + "</a></li>\n"

}