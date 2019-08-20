package com.learning.self

object constructorTest {
  def main(args: Array[String]): Unit = {
    val c=new constructorClass()
    println(c.numPistons)
    println(c.Turbo)
    println(c.cc)
    val c1= new getterSetterCheck
    c1.variableCheck=9

  }
}
