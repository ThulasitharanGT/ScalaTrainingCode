package com.nielsen.basics

object StringInterpolation_05 extends App {

  //s interpolator
  //$ {<expression>} to be evaluated
  val age = 10
  val nextYearAge1 = s"Next Year, I'll complete ${age + 1}."

  def incrementBy1(x: Int) = x + 1
  val nextYearAge = s"Next Year, I'll complete ${incrementBy1(age)}."

  //f interpolator : styled formatting
//expression that includes our format specifie :  floating point Number
  val amount = 100
  val firstOrderAmount = f"Your total amount is: $amount%.2f"

  // raw interpolator :Will not be able to use escape character
  val rawString = raw"I have no escape \n character in the String \n "
  val usualString = "I have no escape \n character in the String \n "
}
