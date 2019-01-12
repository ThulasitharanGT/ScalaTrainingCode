package com.nielsen.basics

//higher-order functions :  Functions that take Functions as Parameter and returns Function

class Decorator(left: String, right: String) {
  def layout[A](x: A) = left + x.toString() + right
}

object HigherOrderFunction_40 extends App {
  //Apply takes another function f and a value v and applies function f to v:
  def apply(f: Int => String, v: Int) = f(v)

  //decorator.layout is coerced automatically to  Int => String as required by method apply
  val decorator = new Decorator("[", "]")
  //decorator.layout is a polymorphic method abstracts over some of its signature types,
  // Scala compiler has to instantiate its method type first
  println(apply(decorator.layout, 7))
}


