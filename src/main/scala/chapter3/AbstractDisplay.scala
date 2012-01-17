package chapter3

abstract class AbstractDisplay {
	
  final def display() = {
	  println(open())
	  for(i <- 0 until 5) println(print)
	  println(close())
  }
	
  def print():String
  
  def close():String
	
  def open():String
  
}