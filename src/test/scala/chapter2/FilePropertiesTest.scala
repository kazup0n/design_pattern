package chapter2

import org.scalatest.junit.JUnitSuite
import org.scalatest.junit.ShouldMatchersForJUnit
import org.junit.Test
import java.util.concurrent.Executors


class FilePropertiesTest extends JUnitSuite with ShouldMatchersForJUnit{
	@Test
	def main(){
	  
	  val io:FileIO = new FileProperties()
	  
	  io.readFromFile("file.txt")
	  io.setValue("year", "2004")
	  io.setValue("month", "4")
	  io.setValue("day", "21")
	  io.writeToFile("newfile.txt")
	  
	}
}