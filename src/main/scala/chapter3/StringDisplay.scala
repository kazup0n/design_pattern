package chapter3


class StringDisplay(msg:String) extends AbstractDisplay {
	override def print():String = "|" + msg + "|"
	override def open():String = printLine()
	override def close():String = printLine()
	private def printLine() = "+" + "-" * msg.getBytes().length + "+"
	
}