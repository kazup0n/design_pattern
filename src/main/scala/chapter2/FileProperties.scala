package chapter2

import java.util.Properties
import java.io.File
import java.io.FileInputStream
import java.io.FileOutputStream

class FileProperties()  extends FileIO{
  val properties:Properties = new Properties
  
  
  def getValue(key:String):String = properties.getProperty(key)
  def setValue(key:String, value:String) = properties.put(key, value)
  def writeToFile(filename:String) = properties.save(new FileOutputStream(new File(filename)), "")
  def readFromFile(filename:String) = properties.load(getClass().getClassLoader().getResourceAsStream(filename))
  
  
}