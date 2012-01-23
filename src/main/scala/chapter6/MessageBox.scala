package chapter6

import chapter6.framework.Product

class MessageBox(decochar:Char) extends Product {

  def use(s:String): Unit = {
    val length = s.getBytes().length
    println(String.valueOf(decochar) * (length + 4))
    println(decochar + " " + s + " " + decochar)
    println(String.valueOf(decochar) * (length + 4))
  }

  def createClone(): Product = clone().asInstanceOf[MessageBox]

}