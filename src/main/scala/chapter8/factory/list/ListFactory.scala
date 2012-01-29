package chapter8.factory.list

import chapter8.factory._

class ListFactory extends Factory {

  def createLink(caption: String, url: String): Link = new ListLink(caption, url) 

  def createTray(caption: String): Tray = new ListTray(caption) 

  def createPage(title: String, author: String): Page  = new ListPage(title, author) 

}