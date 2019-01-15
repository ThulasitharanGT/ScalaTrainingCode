package com.learning.basics

//Generic classes in Scala are invariant by default , niether covariant or contravariant


class Container[A](value: A) {
  private var _value: A = value
  def getValue: A = _value
  def setValue(value: A): Unit = {
    _value = value
  }
}

abstract class King1 {
  def name: String
}
case class Cat1(name: String) extends King1
case class Dog1(name: String) extends King1

object Invariant_19 extends App {
  //val catContainer: Container[Cat] = new Container(Cat("Felix"))
 // val animalContainer: Container[King] = catContainer
 // animalContainer.setValue(Dog("Spot"))
 // val cat: Cat = catContainer.getValue // Oops, we'd end up with a Dog assigned to a Cat
}
