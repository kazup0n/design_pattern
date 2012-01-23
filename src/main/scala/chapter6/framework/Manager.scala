package chapter6.framework

import scala.collection.mutable.Map

class Manager() {

	val showcase = Map[String, Product]()
 
	def register(name:String, proto:Product) = {
		showcase.put(name, proto)
	}
	
	def create(name:String):Option[Product] = showcase.get(name)
}
	
	
 
