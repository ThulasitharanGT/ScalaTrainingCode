package com.nielsen.basics

import scala.collection.mutable.{ArrayBuffer, ListBuffer}
object ScalaColections_38 extends App {

  val mbset = "1,2,3"
  var srcFilesPath = ListBuffer[String]()
  var trgFilesPath = ArrayBuffer[Int]()
  var mbArray = Array.empty[Long]
  srcFilesPath = ListBuffer("one","two")
  trgFilesPath = ArrayBuffer(1,2,3)
  mbArray = mbset.split(",").map(a => a.toLong)
  println(mbArray.getClass)

  mbArray.foreach{ i =>  println( "array = " + i ) }
  val htmlcode = Map("red" -> "#FF0000", "azure" -> "#F0FFFF","peru" -> "#CD853F")

  htmlcode.keys.foreach{ i =>
    print( "Key = " + i )
    println(" Value = " + htmlcode(i) )}

  //Set
  val veges = Set("carror", "beans", "tomato")
  val nums: Set[Int] = Set()

  println( "Head of fruit : " + veges.head )


}


