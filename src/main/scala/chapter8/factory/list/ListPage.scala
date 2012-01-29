package chapter8.factory.list

import chapter8.factory.Page

private[list] class ListPage(title: String, author: String) extends Page(title, author) {

  def makeHTML(): String = new HTMLBuilder().makeTitle(title).
  makeItems(content.toList.map(_.makeHTML()))
  .start("hr /").tag("address", author)
  .close().getResult() 

}