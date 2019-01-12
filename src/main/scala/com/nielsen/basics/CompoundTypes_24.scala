package com.nielsen.basics

//type of an object is a subtype of several other type

trait Cloneable extends java.lang.Cloneable {
  override def clone(): Cloneable = {
    super.clone().asInstanceOf[Cloneable]
  }
}
trait Resetable {
  def reset: Unit
}

object CompoundTypes_24 extends App {
  //obj : compound type is written like this in Scala: Cloneable with Resetable.
  def cloneAndReset(obj: Cloneable with Resetable): Cloneable = {
    val cloned = obj.clone()
    obj.reset
    cloned
  }
}
