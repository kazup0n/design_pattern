package chapter7

trait Builder {

  def makeTitle(title:String)
  def makeString(str:String)
  def makeItems(items:List[String])
  def close()
  def getResult():String
  
  
}