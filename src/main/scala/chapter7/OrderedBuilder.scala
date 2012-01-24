package chapter7

import scala.collection.immutable.List
import java.util.concurrent.atomic.AtomicInteger

trait OrderedBuilder extends Builder {

  private val counter = new AtomicInteger()
  
  override abstract def makeTitle(title: String): Unit = {
    assert(counter.compareAndSet(0, 1), "call makeTitleExecuted once")
    super.makeTitle(title)
  }

  override abstract def makeString(str: String): Unit = {
    assertMakeTitleExecuted()
    super.makeString(str)
  }

  override abstract def makeItems(items: List[String]): Unit = {
    assertMakeTitleExecuted()
    super.makeItems(items)
  }

  override abstract def close(): Unit = {
    assertMakeTitleExecuted()
    super.close()
  }

  override abstract def getResult(): String = { super.getResult() }

  private def assertMakeTitleExecuted(){
	  assert(counter.compareAndSet(1, 1), "call makeTitle before other methods")
  }
  
  
}