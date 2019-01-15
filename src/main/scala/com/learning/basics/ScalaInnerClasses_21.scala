package com.learning.basics

//one class inside another class
class PandorasBox {
  case class Thing (name: String)
  var things = new collection.mutable.ArrayBuffer[Thing]()
  things += Thing("Evil Thing #1")
  things += Thing("Evil Thing #2")
  def addThing(name: String)
  {
    things += new Thing(name)
  }
}
class OuterClass {
  class InnerClass {
    var x = 1
  }
}
object ScalaInnerClasses_21 extends App {
  val p = new PandorasBox
  //access the things in PandorasBox with the things method.
  p.things.foreach(println)
  //add new things to PandorasBox by calling the addThing method
  p.addThing("Evil Thing #3")
  p.addThing("Evil Thing #4")


  // inner classes are bound to the object
  // Java : inner classes are members of the enclosing class,
  // Scala :  inner classes are bound to the outer object.
  val oc1 = new OuterClass
  val oc2 = new OuterClass
  val ic1 = new oc1.InnerClass
  val ic2 = new oc2.InnerClass
  ic1.x = 10
  ic2.x = 20
  println(s"ic1.x = ${ic1.x}")
  println(s"ic2.x = ${ic2.x}")
}
