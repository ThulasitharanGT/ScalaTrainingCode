package com.learning.basics

object ObjectCreate_01 extends App
// extends App  -- Trait that
{
  //The main method is an entry point of a program
 override def main(args:Array[String]):Unit = //Similar to Public static void main in java
  {
    //Type inference
val r = "String"
    println("start time = " + this.executionStart)
    //1.Variable Declaration
    val Welcome = "Hello" //Immutable Variable
  // val Welcome = "Hello"
  var Message  = "Scala" //Mutable Variable

    println( Welcome + Message) //Printing Values Analogous to System.out.println in java
//2. Using Blocks
    //   - Single Line
    println({
      val x = 1 + 1
      x + 1

    })
    //   - Multiple  Line  to separate multiple expressions in same line Semi colon is used
    println({
      val y = "Print" ;      y + " Value"
    })
    //3. Triple Quotes are used to represent string in multiple line
    println(
      """
        |Scala is Object Oriented
        |and Functional Programming Language
      """.stripMargin)



  }
//Performance , Concurrent Programming
  // https://scalafiddle.io.
}
