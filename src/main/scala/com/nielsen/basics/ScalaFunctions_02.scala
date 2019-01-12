package com.nielsen.basics

object ScalaFunctions_02 extends App {
// Functions : Expressions that Tasks Parameters
  // Type is the core : f : R -> N

 //1.Anonymous Functions : Function without Name
     (a: Int) => a + 1

  //2.Named Functions :
  val increment = (z: Int) => z + 1
  println(increment(1))
  println((z: Int) => z + 1)

  //3. Functions Taking More than 1 Parameters:
  val concatenate = (param1: String, param2: String) => param1 + param2
  println(concatenate("Scala", " Concatenation"))

  // 4.Functions without parameters:
  val printno = () => 42
  println(printno())


}
