package com.learning.basics

//Traits and abstract classes can have an abstract type member
trait Buffer {
  type T
  val element: T
}

//Extending Trait with Upper Bound
abstract class SeqBuffer extends Buffer {
  type U
  type T <: Seq[U]
  def length = element.length
}

//Traits or classes with abstract type members are often used in combination with anonymous class instantiations.
abstract class IntSeqBuffer extends SeqBuffer {
  type U = Int
}
// turn abstract type members into type parameters of classes and vice versa.
object AbstractTypes_23 extends App{
  //newIntSeqBuf uses an anonymous class implementation of IntSeqBuf (i.e. new IntSeqBuffer), setting type T to a List[Int].
  def newIntSeqBuf(elem1: Int, elem2: Int): IntSeqBuffer =
    new IntSeqBuffer {
      type T = List[U]
      val element = List(elem1, elem2)
    }
  val buf = newIntSeqBuf(7, 8)
  println("length = " + buf.length)
  println("content = " + buf.element)
}
