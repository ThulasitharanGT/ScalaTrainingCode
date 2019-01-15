package com.learning.basics

// Usual Classes
//Members are public by default
//Parameters without val or var are private value
class ScalaClasses_04 (prefix: String, suffix: String) {
  private var _x = 0
  var _y = 0
    def greet(name: String): Unit =
      println(prefix + name + suffix)
  }
// Case Classes :  immutable and compared by value
case class Dot(x: Int, y: Int)

object PrintClass extends App{
  val greeter = new ScalaClasses_04("Hello, ", "!")
  greeter.greet("Scala developer")
 //val Sc = new ScalaClasses_04("","")

  val dot = Dot(1, 2)
  val anotherDot = Dot(1, 9)
  val yetAnotherDot = Dot(1, 2)

  if (dot == anotherDot) {
    println(dot + " and " + anotherDot + " are the same.")
  } else {
    println(dot + " and " + anotherDot + " are different.")
  }

  if (dot == yetAnotherDot) {
    println(dot + " and " + yetAnotherDot + " are the same.")
  } else {
    println(dot + " and " + yetAnotherDot + " are different.")
  }
}
