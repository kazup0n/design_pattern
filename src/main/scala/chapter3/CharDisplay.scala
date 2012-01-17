package chapter3

class CharDisplay(char:Char) extends AbstractDisplay{

  override def print():String = String.valueOf(char)
  override def close():String = ">>"
  override def open():String = "<<"
  
}