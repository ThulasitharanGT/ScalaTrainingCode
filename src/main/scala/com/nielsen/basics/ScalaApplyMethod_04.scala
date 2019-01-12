package com.nielsen.basics

import java.io.FileInputStream
import java.util.Properties

//object and class has default Apply/injector  method
//Invoke without name
object ScalaApplyMethod_04 {
  private val prop = new Properties()
  prop.load(new FileInputStream("src\\main\\scala\\com\\nielsen\\basics\\config.properties"))
  def apply(s:String) = prop.getProperty(s)
}

object Main extends App
{
  // don't specify a method name, and simply pass the arguments in a pair of parenthesis, Scala calls the apply method
  println(ScalaApplyMethod_04.apply("database"))
  println(ScalaApplyMethod_04("dbuser"))

   //Apply Method in list
  val myList = List("India", "America", "Japan", "China")
  //myList("jjj")
  myList(2)
  println( myList.apply(3))

}