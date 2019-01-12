package com.nielsen.basics
import scala.collection.mutable.ArrayBuffer

//Minimal Trait
trait HairColor

//trait with a method body
trait WelcomeTraits_06 {
  def ScalaTrait(name: String): Unit =
    println("Hello, " + name + "!")
}
// generic types and with abstract methods.
trait Iterator[A] {
  //Abstract Methods
  def hasNext: Boolean
  def next(): A
}
//Extending the trait Iterator[A] requires a type A and implementations of the methods hasNext and next.
//Use the extends keyword to extend a trait. Then implement any abstract members of the trait using the override keyword:
class NumIterator(to: Int) extends Iterator[Int] {
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
//Subtyping : Where a given trait is required, a subtype of the trait can be used instead.
trait Animal {
  val name: String
}

class Puppy(val name: String) extends Animal
class Kitten(val name: String) extends Animal

object IteratorTrait_06 extends App{
  val iterator = new NumIterator(10)
  iterator.next()  // prints 0
  iterator.next()  // prints 1


  val Kitten = new Kitten("Harry")
  val Puppy = new Puppy("Sally")
  val animals = ArrayBuffer.empty[Animal]
  animals.append(Kitten)
  animals.append(Puppy)
  animals.foreach(pet => println(pet.name))  // Prints Harry Sally
}