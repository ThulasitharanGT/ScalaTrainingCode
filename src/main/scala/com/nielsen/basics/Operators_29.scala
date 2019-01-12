package com.nielsen.basics


//operators are methods. Any method with a single parameter can be used as an infix operator
case class Vec(val x: Double, val y: Double) {
  def +(that: Vec) = new Vec(this.x + that.x, this.y + that.y)
}

case class MyBool(x: Boolean) {
  def and(that: MyBool): MyBool = if (x) that else this
  def or(that: MyBool): MyBool = if (x) this else that
  def negate: MyBool = MyBool(!x)
}
object Operators_29 extends App{

 // with dot-notation
  println(10.+(1))
  // infix operator
  println(10 + 1)

  val vector1 = Vec(1.0, 1.0)
  val vector2 = Vec(2.0, 2.0)
  val vector3 = vector1 + vector2
  vector3.x  // 3.0
  vector3.y  // 3.0

  //Using ANd and or AS operator
  def not(x: MyBool) = x.negate
  def xor(x: MyBool, y: MyBool) = (x or y) and not(x and y)
}
