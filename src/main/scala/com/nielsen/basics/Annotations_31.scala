package com.nielsen.basics

import scala.annotation.tailrec
object Annotations_31 extends App {
  //associate meta-information with definitions
  @deprecated
  def hello = "hola"
  hello

  //Certain annotations will actually cause compilation to fail if a condition(s) is not met.
  def factorial(x: Int): Int = {
    @tailrec
    def factorialHelper(x: Int, accumulator: Int): Int = {
      if (x == 1) accumulator else factorialHelper(x - 1, accumulator * x)
    }
    factorialHelper(x, 1)
  }

  def factorial1(x: Int): Int = {
    //@tailrec
    def factorialHelper(x: Int): Int = {
      if (x == 1) 1 else x * factorialHelper(x - 1)
    }
    factorialHelper(x)
  }
}
