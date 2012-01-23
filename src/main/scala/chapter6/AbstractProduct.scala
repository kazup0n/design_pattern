package chapter6

import chapter6.framework.Product

abstract class AbstractProduct extends Product {

  def use(s: String): Unit

  def createClone(): Product = clone().asInstanceOf[Product]

}