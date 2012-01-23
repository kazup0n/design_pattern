package chapter6

import chapter6.framework.Product

class UnderlinePen(ulchar:Char) extends Product {

  def use(s: String): Unit = {
    val length = s.getBytes().length
    println("\"" + s + "\"")
    println(String.valueOf(ulchar) * length)
  }

  def createClone(): Product = clone().asInstanceOf[UnderlinePen]

}