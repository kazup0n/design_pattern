package chapter6

import framework._

import org.scalatest.junit.JUnitSuite
import org.scalatest.junit.ShouldMatchersForJUnit
import org.junit.Test
import java.util.concurrent.Executors


class TestPrototype extends JUnitSuite with ShouldMatchersForJUnit{
	@Test
	def main(){
	  
	  val manager = new Manager()
	  manager.register("strong message", new UnderlinePen('~'))
	  manager.register("warning box", new MessageBox('*'))
	  manager.register("slash box", new MessageBox('/'))
	  
	  manager.create("strong message").get.use("Hello, world")
	  manager.create("warning box").get.use("Hello, world")
	  manager.create("slash box").get.use("Hello, world")
	  
	}
}