package com.nielsen.advanced

import scala.collection.mutable.ArrayBuffer


trait Iterator[A] {
  //Abstract Methods
  def hasNext: Boolean
  def next(): A
}
//Extends Keyword and Override for implementing abstract methods
class IntIterator(to: Int) extends Iterator[Int] {
  private var current = 0
  override def hasNext: Boolean = current < to
  override def next(): Int =  {
    if (hasNext) {
      val t = current
      current += 1
      t
    } else 0
  }
}

trait Pet {
  val name: String
}

class Cat1(val name: String) extends Pet
class Dog1(val name: String) extends Pet
object ScalaTrait_06 extends App {

  //extends Iterator[Int] with  next method returning an Int
  val iterator = new IntIterator(10)
  iterator.next()  // returns 0
  iterator.next()  // returns 1

  //Subtyping : given trait is required, a subtype of the trait can be used
  val dog = new Dog1("Harry")
  val cat = new Cat1("Sally")

  val animals = ArrayBuffer.empty[Pet]
 // animals.append(dog)
  animals.append(cat)
  animals.foreach(pet => println(pet.name))  // Prints Harry Sally
}
