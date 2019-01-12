package com.nielsen.basics

//Mixins are traits which are used to compose a class.
// Classes : One Super Class, Multiple Mixins
abstract class A {
  val message: String
}
class B extends A {
  val message = "I'm an instance of class B"
}
trait C extends A {
  def loudMessage = message.toUpperCase()
}
//Class D has a superclass B and a mixin C
class D extends B with C

// abstract class with type T
abstract class AbsIterator {
  type T //abstract type
  //Iterator Methods
  def hasNext: Boolean
  def next: T
}

// concrete class
class StringIterator(s: String) extends AbsIterator {
  type T = Char
  private var i = 0
  def hasNext = i < s.length
  def next = {
    val ch = s charAt i
    i += 1
    ch
  }
}
//Trait extends AbsIterator.
//RichIterator : No need to implement the abstract members of AbsIterator
trait RichIterator extends AbsIterator {
  def foreach(f: T => Unit): Unit = while (hasNext) f(next)
}
object ScalaMixins_08 extends App {
  val d = new D
  d.message  // I'm an instance of class B
  d.loudMessage  // I'M AN INSTANCE OF CLASS B

  //class RichStringIter : Superclass StringIterator ; Mixin: RichIterator
  //More Flexible Than  single inheritance
  class RichStringIter extends StringIterator("hello") with RichIterator
  val iter = new RichStringIter
  iter foreach println


  //Extend Multiple Trait
  trait T1
  trait T2
  trait T3
  class C extends T1 with T2 with T3
}