package com.learning.basics

import scala.util.control.NonFatal

object ScalaOptions_12 extends App{
//Option : Type Constructor  : Helps to construct type : Type Parameter
  //Option is a type constructor : foo
  // Option[Int] is a type : foo[Int]

 // val a: Option = Some(1)
  val a: Option[Int] = Some(1) // T can be any type being passed
  // Two Subtype : Some and None

  //returning a value from a function that can be null.
 /* def safeToInt(canBeNumber: String): Int =
  {
    try
    {
    canBeNumber.toInt
    }
    catch
      {     case
    NonFatal(e) => throw Exception
      }
  }*/
  //safeToInt("'")

  def toInt(in: String): Option[Int] = {
    try {
      Some(Integer.parseInt(in.trim))
    } catch {
      case e: NumberFormatException => None
    }
  }
  toInt("hello")
}
