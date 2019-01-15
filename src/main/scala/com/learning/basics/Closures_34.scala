package com.learning.basics

//A Function that uses one or more free variables is known as a Closure
// closure : function, whose return value depends on the value of one or more variables declared outside this function.
object Closures_34 {

  def main(args: Array[String]) {
    println( "sum(1) value = " +  sum(1) )
    println( "sum(2) value = " +  sum(2) )
  }
  var factor = 3// free variable

  val sum = (i:Int) => i + factor
  //first :Scala compiler looks into the so-called nearest local lexical environment,
  // in which that function was defined and tries to find a binding
  //Second: Parameter List

  val multiply = (i:Int) => i * 10
}
