package com.learning.basics
//partial application.
//Methods have multiple parameter lists. Calling method with  a fewer number of parameter lists
// will yield a function taking the missing parameter lists as its arguments.
object Currying_11 extends App {
  def filter(xs: List[Int], p: Int => Boolean): List[Int] =

    if (xs.isEmpty) xs //println("p=" + p)
    else if (p(xs.head)) xs.head :: filter(xs.tail, p) ;
    else filter(xs.tail, p)


  def modN(n: Int)(x: Int) = ((x % n) == 0)
  modN(2)(_)
  val nums = List(1, 2, 3, 4, 5, 6, 7, 8)

  //for modN only its first argument is actually applied.
  // yields a function of type Int => Boolean
  // thus possible candidate for the second argument of function filter.
  println(filter(nums, modN(2)))
  println(filter(nums, modN(3)))
  // println(modN _)

}


