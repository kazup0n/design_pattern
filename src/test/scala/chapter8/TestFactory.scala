package chapter8



import org.scalatest.junit.JUnitSuite
import org.scalatest.junit.ShouldMatchersForJUnit
import org.junit.Test
import java.util.concurrent.Executors
import factory._

class TestFactory extends JUnitSuite with ShouldMatchersForJUnit{
  @Test
  def testMain(){
    
    val factoryName = "chapter8.factory.list.ListFactory"
    
    val factory = Factory.getFactory(factoryName)
    val trayNews = factory.createTray("NewsPaper")
    trayNews.add(factory.createLink("Asahi", "http://www.asahi.com"))
    trayNews.add(factory.createLink("Yomiuri", "http://www.yomiuri.co.jp"))
    
    val trayYahoo = factory.createTray("Yahoo")
    trayYahoo.add(factory.createLink("Yahoo!", "http://yahoo.com"))
    trayYahoo.add(factory.createLink("Yahoo! Japan", "http://www.yahoo.co.jp"))
    
    val traySearch = factory.createTray("Search Engines") 
    traySearch.add(trayYahoo)
    traySearch.add(factory.createLink("Excite","http://www.excite.com"))
    traySearch.add(factory.createLink("Google","http://google.com"))
    
    val page = factory.createPage("LinkPage", "kazuhiro")
    page.add(trayNews)
    page.add(traySearch)
    page.output()
    
    
  }
}