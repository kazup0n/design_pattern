package chapter4.idcard

import chapter4.framework.Product

class IDCard(name:String, number:Int) extends Product {
  println(name + "のカード(" + number +  ")を作ります")
  
  val owner = name
  
  def use(): Unit = { println(name + "のカード("+number+")を使います")  }

}