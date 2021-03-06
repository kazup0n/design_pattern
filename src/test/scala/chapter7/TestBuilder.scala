package chapter7



import org.scalatest.junit.JUnitSuite
import org.scalatest.junit.ShouldMatchersForJUnit
import org.junit.Test
import java.util.concurrent.Executors


class TestBuilder extends JUnitSuite with ShouldMatchersForJUnit{
	@Test
	def testTextBuilder(){
		executeBuilder(new TextBuilder())
	}
	
	@Test
	def testHTMLBuilder() {
	  executeBuilder(new HTMLBuilder())
	}
	
	@Test
	def testWikiBuilder() {
	  executeBuilder(new WikiBuilder())
	}
	
	
	private def executeBuilder(builder:Builder){
	  val director = new Director(builder)
	  director.construct()
	  println(builder.getResult())
	}
	
	@Test(expected=classOf[AssertionError])
	def testOrderedHTMLBuilder(){
	  (new HTMLBuilder() with OrderedBuilder).makeItems(List("",""))
	}
	
	@Test(expected=classOf[AssertionError])
	def testOrderedTextBuilder(){
	  (new TextBuilder() with OrderedBuilder).makeItems(List("",""))
	} 

	
}