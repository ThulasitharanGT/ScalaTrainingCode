package com.learning.basics

//Variance : correlation of subtyping relationships of complex types and the subtyping relationships of their component types
class Foo[+A] // A covariant class
class Bar[-A] // A contravariant class
class Baz[A]  // An invariant class

//Covariant
abstract class Animal2 {
  def name: String
}
// The Scala standard library has a generic immutable sealed abstract class List[+A]
case class Cat2(name: String) extends Animal2
case class Dog2(name: String) extends Animal2


object ScalaVariances_19 extends App {
  //Covariant : for two types A and B where A is a subtype of B, then List[A] is a subtype of List[B]
  def printAnimalNames(animals: List[Animal2]): Unit = {
    animals.foreach { animal =>
      println(animal.name)
    }
    val cats: List[Cat2] = List(Cat2("Whiskers"), Cat2("Tom"))
    val dogs: List[Dog2] = List(Dog2("Fido"), Dog2("Rex"))

    printAnimalNames(cats)
    // Whiskers
    // Tom
    printAnimalNames(dogs)
    // Fido
    // Rex

  }

}



