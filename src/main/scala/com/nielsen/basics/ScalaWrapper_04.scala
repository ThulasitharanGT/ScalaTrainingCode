package com.nielsen.basics

import scala.runtime.{RichByte, RichInt}

object ScalaWrapper_04 {
  val x:Int = 10
  x.max(3)
  //Wrapper , implict Conversion
  val y:RichInt = 1

  //Rich Methods ,Range out of Int types
  val rangeOfNumbers = 1 to 199

  rangeOfNumbers contains 1

  // we can write concisely because of Implicit Conversions and Type Inference happening at the backend
  1 to 10 by 2 foreach println
}
