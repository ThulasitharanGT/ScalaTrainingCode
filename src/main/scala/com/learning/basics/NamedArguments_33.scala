package com.learning.basics

//When calling methods, we can label the arguments with their parameter names like so
object NamedArguments_33 extends App {
  def printName(first: String, last: String): Unit = {
    println(first + " " + last)
  }
  printName("John", "Smith")  // Prints "John Smith"
  printName(first = "John", last = "Smith")  // Prints "John Smith"
  printName(last = "Smith", first = "John")  // Prints "John Smith

  //some arguments are named and others are not, the unnamed arguments must come first
  // and in the order of their parameters in the method signature.

  def printName1(first: String, last: String): Unit = {
    println(first + " " + last)
  }
//  printName1(last = "Smith", "john")  // Does not compile
val (myVar1: Int, myVar2: String) = Pair(40, "Foo")
}
