package com.nielsen.basics

//Methods in Scala can be parameterized by type as well as value
//Similar to generic Types
object PolymorphicMethods_27 extends App{
  // type parameter A and values parameters x and length
  def listOfDuplicates[A](x: A, length: Int): List[A] = {
    if (length < 1)
      Nil
    else
    //:: means prepend an element on the left to a sequence on the right
      x :: listOfDuplicates(x, length - 1)
  }
  println(listOfDuplicates[Int](3, 4))  // List(3, 3, 3, 3)
  println(listOfDuplicates("La", 8))  // List(La, La, La, La, La, La, La, La)
}
