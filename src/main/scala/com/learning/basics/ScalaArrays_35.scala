package com.learning.basics
import Array.{ofDim,concat,range}

object ScalaArrays_35 extends App{

  var myArray = Array(1.9, 2.9, 3.4, 3.5)

  // Print all the array elements
  for ( a <- myArray ) {
    println( a )
  }
  //Multi Dimensional Array
    var myMatrix = ofDim[Int](3,3)

  // build a matrix
  for (i <- 0 to 2) {
    for ( j <- 0 to 2) {
      myMatrix(i)(j) = j;
    }
  }

  // Print two dimensional array
  for (a <- 0 to 2) {
    for ( b <- 0 to 2) {
      print(" " + myMatrix(a)(b));
    }
    println();
  }

  var myList1 = range(10, 20, 2)
  var myList2 =  range(10,20)

  var myList3 =  concat( myList1, myList2)
}
