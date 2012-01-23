package chapter6.framework

@cloneable
trait Product {

  def use(s:String):Unit
  def createClone():Product
  
}