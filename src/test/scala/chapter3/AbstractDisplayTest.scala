package chapter3

import org.scalatest.junit.JUnitSuite
import org.scalatest.junit.ShouldMatchersForJUnit
import org.junit.Test
import java.util.concurrent.Executors


class AbstractDisplayTestA extends JUnitSuite with ShouldMatchersForJUnit{
	@Test
	def main(){
	  
	  val d1 = new CharDisplay('H')
	  val d2 = new StringDisplay("Hello, world")
	  val d3 = new StringDisplay("こんにちは!こんにちは!!")
	  
	  d1.display()
	  d2.display()
	  d3.display()
	  
	}
}