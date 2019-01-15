package com.learning.advanced

object HOControlAbstraction extends App{
//For Each
  //Map
  //Flat Map
  def f3(s:String) = s.split(" ")
  val l = List("Class Composition with Mixins","Implicit Parameters","Implicit Conversions")
 l.map(f3)//Map Returns the collection of return type of f3
  //Flat map :  Flattened Output : will give unexpected results if the output is not collection.
  l.flatMap(f3)
  // Filter : Returns New collection
  val cont =  List("Asia","Africa","Antartica","Australia","India")
  cont.filter(x => x.startsWith("I"))

  //WithFileter : Does not return new collection,just apply the function:Lazy Method
  //Map function will be reached only if first expression is true
  cont.withFilter(x => x.startsWith("I")).map(r => r.capitalize)
  //For
  // For {seq}yield {expr} : For {seq} {expr}
// Generator : e <- col
// For loop is a syntactic sugar for higher order abstraction
  //Internally both are same for and foreach
val n = 1 to 5
  for(i <- n) println(i)// need to have a collection to Iterate
  for(i <- 1 to 5) println(i)
  // Same can be done with foreach
}
