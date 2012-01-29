package chapter8.factory

import scala.collection.mutable.ListBuffer

import java.io.FileWriter

abstract class Page(title:String, author:String) {

   protected val content = ListBuffer[Item]()
  
   def add(item:Item) = {content.append(item)} 
  
   def output() = {
     var writer:FileWriter = null 
     try{
    	 val filename = title + ".html"
    	 writer = new FileWriter(filename)
    	 writer.write(makeHTML())
     }finally{
       if(writer != null){ writer.close()}
     }
   }
   
   def makeHTML():String
   
   
}