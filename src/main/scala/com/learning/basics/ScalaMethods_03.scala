package com.learning.basics

object ScalaMathods_03 extends App {
//Methods : defined with the def keyword,followed by a name, parameter lists, a return type, and a body.

//1. Method taking 2 Parameters
  def add(x: Int, y: Int): Int = x + y
  println(add(1, 2))

  //2. Method taking more than 2  Parameters
  def addAndMultiply(x: Int, y: Int)(mul: Double): Double = (x + y) * mul
  println(addAndMultiply(1, 2)(3.8))

  //3. Method Without Parameter
  def noParam: String = System.getProperty("name")
  println("Hello, " + noParam + "!")

  //4. Method With multi line Expressions
  def squareNumber(num: Float): String = {
    val square = num * num
    square.toString
   // return square.toString  : return key word is option by default the value of last statement of the method will be returned.
  }
  println(squareNumber(3.78F))

}
