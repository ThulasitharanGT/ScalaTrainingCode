package com.nielsen.basics

import scala.util.Random
//object with an unapply Method,Apply method is like constructor
//unapply takes an object and tries to give arguments.
// used in pattern matching and partial functions.
object ExtractorObjects_16 extends App {
  val customer1ID = CustomerID("Sukyoung")  // CustomerID.apply("Sukyoung")
  customer1ID match {
      //The apply method creates a CustomerID string from a name.
    // CustomerID("Sukyoung") analogous to CustomerID.apply("Sukyoung")
    case CustomerID(name) => println(name)  // calling the unapply method.
    case _ => println("Could not extract a CustomerID")
  }
// Unapply Method : case CustomerID(name) => customer1ID
  //Similar to val name = CustomerID.unapply(customer2ID).get
  val customer2ID = CustomerID("Nico")
  val CustomerID(name) = customer2ID
  println(name)  // prints Nico
}

object CustomerID {
 def apply(name: String) = s"$name--${Random.nextLong}"


   /* For Testing Return Type : Boolean : case even()
  Returns single sub-value of type T, : Option[T]
   Return several sub-values T1,...,Tn, : optional tuple Option[(T1,...,Tn)].*/
  def unapply(customerID: String): Option[String] = {
    val name = customerID.split("--").head
    println(customerID.split("--")(1))
    if (name.nonEmpty) Some(name) else None
  }
}