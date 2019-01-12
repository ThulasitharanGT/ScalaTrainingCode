package com.nielsen.basics

object DefaultParameterValues_32 extends App{
  //the parameter level has a default value so it is optional.
  def log(message: String, level: String = "INFO") = println(s"$level: $message")
  log("System starting")  // prints INFO: System starting
  log("User not found", "WARNING")  // prints WARNING: User not found

  //Note that default parameters in Scala are not optional when called from Java code:
//Multiple assignments : code block or method returns a Tuple (Tuple − Holds collection of Objects of different types),
// the Tuple can be assigned to a val variable
  val (myVar1: Int, myVar2: String) = Pair(40, "Foo")

}
