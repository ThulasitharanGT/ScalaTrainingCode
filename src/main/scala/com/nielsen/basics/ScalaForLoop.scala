package com.nielsen.basics

object ScalaForLoop extends App {

  var c ,d = 0;
  val intList = List(1, 2, 3, 4, 5, 6)
  val newList = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

  // for loop execution with a range
  for (a <- 1 to 10) {
    println("Value of a: " + a);
  }
  // for loop execution with a range using until
  for (b <- 1 until 5) {
    println("Value of b: " + b);
  }

    //Using Multiple Ranges
    // for loop execution with a range
    for (a <- 1 to 3; b <- 1 to 3) {
      println("Value of a: " + a);
      println("Value of b: " + b);
    }


    // for loop execution with a collection and filter
  for (c <- intList
         if c != 2; if c < 5) {
      println("Value of a: " + c)
    }


    // for loop execution with d yield
    var retVal = for {d <- newList if d != 3; if d < 8} yield d

    // Now print returned values using another loop.
    for (d <- retVal) {
      println("Value of d: " + d);
    }
  }
