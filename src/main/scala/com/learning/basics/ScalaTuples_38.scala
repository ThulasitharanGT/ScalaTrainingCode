package com.learning.basics

object ScalaTuples_38 extends App{
  //tuple is a class that can hold elements of different types ;Immutable
  val ingredient  = ("Sugar" , 25) :Tuple2[String, Int]

  //Accessing Elements
  println(ingredient._1) // Sugar
  println(ingredient._2) // 25

  //Destructing Elements
  val (name, quantity) = ingredient
  val (des,_) = ingredient
  println(name) // Sugar
  println(quantity) // 25
  println(des)

  //Destructuring with pattern Matching
  val planetDistanceFromSun = List(("Mercury", 57.9), ("Venus", 108.2), ("Earth", 149.6 ), ("Mars", 227.9), ("Jupiter", 778.3))

  planetDistanceFromSun.foreach{ tuple => {

    tuple match {

      case ("Mercury", distance) => println(s"Mercury is $distance millions km far from Sun")

      case p if(p._1 == "Venus") => println(s"Venus is ${p._2} millions km far from Sun")

      case p if(p._1 == "Earth") => println(s"Blue planet is ${p._2} millions km far from Sun")

      case _ => println("Too far....")
    }
  }
  }
  // value () of type Unit is conceptually the same as the value () of type Tuple0.
  // There can only be one value of this type since it has no elements.
  val numPairs = List((2, 5), (3, -7), (20, 56))
  for ((a, b) <- numPairs) {
    println(a * b)
  }
}
