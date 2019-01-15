package com.learning.basics




//Contravariance : for two types A and B where A is a subtype of B, then List[B] is a subtype of List[A]
abstract class King {
  def name: String
}
case class Cat(name: String) extends King
case class Dog(name: String) extends King
abstract class Printer[-A] {
  def print(value: A): Unit
}

class AnimalPrinter extends Printer[King] {
  def print(animal: King): Unit =
    println("The animal's name is: " + animal.name)
}

class CatPrinter extends Printer[Cat] {
  def print(cat: Cat): Unit =
    println("The cat's name is: " + cat.name)
}

object Contravariance_19 extends App{
  val myCat: Cat = Cat("Boots")
  def printMyCat(printer: Printer[Cat]): Unit = {
    printer.print(myCat)
  }

  val catPrinter: Printer[Cat] = new CatPrinter
  val animalPrinter: Printer[King] = new AnimalPrinter
  printMyCat(catPrinter)
  //printMyCat(animalPrinter)
}
