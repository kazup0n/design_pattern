package chapter3

abstract class AbstractDisplay {
	
  final def display() = {
	  println(open())
	  for(i <- 0 until 5) println(print)
	  println(close())
  }
	
  private[chapter3] def print():String
  
  private[chapter3] def close():String
	
  private[chapter3] def open():String
  
}