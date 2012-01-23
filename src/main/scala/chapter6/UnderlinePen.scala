package chapter6

import chapter6.framework.Product

class UnderlinePen(ulchar:Char) extends AbstractProduct {

  def use(s: String): Unit = {
    val length = s.getBytes().length
    println("\"" + s + "\"")
    println(String.valueOf(ulchar) * length)
  }
}