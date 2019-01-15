package com.learning.basics

object ScalaTypes_07 extends App {
  //Any - supertype : defines equals, hashCode, and toString : direct subclasses: AnyVal, AnyRef
//AnyVal -  Value Type : Double, Float, Long, Int, Short, Byte, Char, Unit, and Boolean
  //AnyRef  - Reference Type : Every User Type is Subtype of Anyref : Analogous to java.lang.Object.

  // instance of scala.Any
  val anyExample: List[Any] = List(
    "a string",
    732,  // an integer
    'c',  // a character
    true, // a boolean value
    () => "an anonymous function that  a string"  //<function>
  )
  anyExample.foreach(element => println(element))

  //Nothing - subtype of all types: signal non-termination like thrown exception, program exit, or an infinite loop
  //Null  - subtype of all reference types : interoperability with other JVM languages not used in scala
}


