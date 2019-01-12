package com.nielsen.basics

object CallByName_39 extends App{


  def time() = {
    println("Getting time in nano seconds")
    System.nanoTime
  }
  def delayed( t: => Long ) = {
    println("In delayed method")
    println("Param: " + t)
  }

  delayed(time());

//Varags
  def printStrings( args:Seq[String] ) = {
    var i : Int = 0;

    for( arg <- args ){
      println("Arg value[" + i + "] = " + arg );
      i = i + 1;
    }
  }
var myArray = Array("Java", "Scala", "Python")
  var myArray1 = Array("Java", "Scala")
  printStrings (myArray )
  printStrings (myArray1 )
}
