package com.learning.basics

/*Objects can extend or inherit Classes,
Objects cannot have a public constructor
Scala will instantiate the object on their first use*/

object IdFactory {
  private var increment = 0
  def counter(): Int = {
    increment += 1
    increment
  }
}
//Objects are single instances of their own definitions
object ScalaObjects_05 extends App{



//access an object by referring to its name.

  val newId: Int = IdFactory.counter()
  println(newId) // 1
  val newerId: Int = IdFactory.counter()
  println(newerId) // 2
}
