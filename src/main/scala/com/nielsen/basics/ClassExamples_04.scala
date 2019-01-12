package com.nielsen.basics


class Point(var x: Int, var y: Int) {
  private var _z = 0
  private val bound = 100
  def move(dx: Int, dy: Int): Unit = {
    x = x + dx
    y = y + dy
  }
  override def toString: String =
    s"($x, $y)"

  def z = _z
  def z_= (newValue: Int): Unit = {
    if (newValue < bound) _z = newValue else printWarning
  }
  private def printWarning = println("WARNING: Out of bounds")
}
class DotValue(var a: Int = 0, var b: Int = 0)//Default Value Set
class Sum(val x: Int, var y: Int)
class Subtract(x: Int, y: Int)
{
  //Private member Can be accessed with in class
  println("subtract X =" + x)
}

object ClassExamples_04 extends App {
  val point1 = new Point(2, 3)
  point1.x  // 2
  println(point1)  // prints (x, y)
  point1.z = 101 // prints the warning


  val origin = new DotValue  // x and y are both set to 0 since the class has default value
  val dot1 = new DotValue(1)
  println(dot1.a)  // prints 1

  //the constructor reads arguments left to right, Need to pass to a value, name the parameter.
  val dotValue2 = new DotValue(b=2)
  println(dotValue2.b)


  //Primary constructor parameters with val and var are public
  val sum = new Sum(1, 2)
  sum.y = 3 // Compiles as it is Var
  //sum.x = 3  // <-- does not compile as it is Val

  //Parameters without val or var are private values, visible only within the class.
  val sub = new Subtract(1, 2)
  //sub.x  // <-- does not compile as it is a private member.



}