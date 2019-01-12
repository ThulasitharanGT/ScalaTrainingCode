package com.nielsen.basics

object ScalaTypeInference_07 extends App{

  val Name  : String = "Montreux Jazz Café"
  def sumOf(x: Int) : Unit = { return x + x}

  //Omitting  Type : Compiler will detect it
  val businessName = "Montreux Jazz Café"

  def squareOf(x: Int) = x * x

  // recursive methods, the compiler is not able to infer a result type.
  //def fac(n: Int) = if (n == 0) 1 else n * fac(n - 1)
}
