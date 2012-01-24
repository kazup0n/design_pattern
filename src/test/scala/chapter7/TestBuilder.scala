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
	
	private def executeBuilder(builder:Builder){
	  val director = new Director(builder)
	  director.construct()
	  println(builder.getResult())
	}
	
	
}