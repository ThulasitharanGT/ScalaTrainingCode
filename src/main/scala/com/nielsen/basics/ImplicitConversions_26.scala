package com.nielsen.basics
import scala.language.implicitConversions

//when calling a Java method that expects a java.lang.Integer, you are free to pass it a scala.Int instead.
// That’s because Predef includes the following implicit conversions:
object ImplicitConversions_26 extends App {

  implicit def int2Integer(x: Int) =
    java.lang.Integer.valueOf(x)
}
