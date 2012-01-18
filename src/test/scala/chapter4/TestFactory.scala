package chapter4

import idcard._

import org.scalatest.junit.JUnitSuite
import org.scalatest.junit.ShouldMatchersForJUnit
import org.junit.Test
import java.util.concurrent.Executors


class TestFactory extends JUnitSuite with ShouldMatchersForJUnit{
	@Test
	def main(){
	  val factory = new IDCardFactory()
	  factory.createProduct("kazuhiro").use()
	  factory.createProduct("yuka").use()
	  factory.createProduct("noko").use()
	}
}