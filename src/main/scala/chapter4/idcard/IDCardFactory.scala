package chapter4.idcard

import chapter4.framework._

class IDCardFactory extends Factory {
  type E = IDCard
  
  var owners = List[String]()
  var sequenceNumber = 1
  override def createProduct(owner: String): IDCard = {
    val card = new IDCard(owner,  sequenceNumber)
    sequenceNumber += 1
    return card
  }

  override def registerProduct(product: IDCard): Unit = {owners.+:(product.owner)}

}