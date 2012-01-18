package chapter4.framework

abstract class Factory {
  type E <: Product
  
  final def create(owner:String):E = {
    val p = createProduct(owner)
    registerProduct(p)
    return p
  }
  
  protected def createProduct(owner:String):E
  protected def registerProduct(product:E)
  
}