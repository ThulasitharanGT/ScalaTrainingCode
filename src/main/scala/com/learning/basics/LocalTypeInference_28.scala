package com.learning.basics

//not necessary in Scala to specify the type of a variable, since the compiler
// can deduce the type from the initialization expression of the variable
//Return Type is not necessary to be specified
object LocalTypeInference_28 extends App {
  val x = 1 + 2 * 3         // the type of x is Int
  val y = x.toString()      // the type of y is String
  def succ(x: Int) = x + 1  // method succ returns Int values


//recursive methods, the compiler is not able to infer a result type
 // def fac(n: Int) = if (n == 0) 1 else n * fac(n - 1)

  //not compulsory to specify type parameters when polymorphic methods are called or generic classes are instantiated.
  def id[T](x: T) = x
  val p = MyPair(1, "scala") // type: MyPair[Int, String]
  val q = id(1)              // type: Int
 /* Equivalent to
 val x: MyPair[Int, String] = MyPair[Int, String](1, "scala")
  val y: Int = id[Int](1)*/

  //Dangerous to rely on scala compiler in following cases
  var obj = null
 // obj = new Object()
}

case class MyPair[A, B](x: A, y: B);
