package com.nielsen.basics

import scala.io.Source
object ScalaException_37 extends App {
 // val dateCnt = -1
 val dateCnt = 10
  if (dateCnt > 0) println("positive")
  else     throw new CustomException("negative")

  //Reading File
 // Source.fromFile("D:/Workspace/ScalaTraining/src/main/scala/com/nielsen/basics/Data.txt" ).foreach {
 // Source.fromFile("D:\\Workspace\\ScalaTraining\\src\\main\\scala\\com\\nielsen\\basics\\Data.txt" ).foreach {
 // Source.fromFile("src/main/scala/com/nielsen/basics/Data.txt" ).foreach {
    Source.fromFile("src\\main\\scala\\com\\nielsen\\basics\\Data.txt" ).foreach {
    print
  }


}
