package com.nielsen.basics

object ConcatenatingLists_22 extends App {
  val fruit1 = "apples" :: ("oranges" :: ("pears" :: Nil))
  val fruit2 = "mangoes" :: ("banana" :: Nil)
// ::  - Cons prepends a new element to the beginning of an existing List
  var fruit3 = fruit1 :: fruit2
  println( "fruit1 :: fruit2 : " + fruit3 )
  // ::: - List has a method named ::: that concatenates a passed List and the List on which ::: was invoked
  // use two or more lists with ::: operator
  var fruit = fruit1 ::: fruit2
  println( "fruit1 ::: fruit2 : " + fruit )

  // use two lists with Set.:::() method
  fruit = fruit1.:::(fruit2)
  println( "fruit1.:::(fruit2) : " + fruit )

  // pass two or more lists as arguments
  fruit = List.concat(fruit1, fruit2)
  println( "List.concat(fruit1, fruit2) : " + fruit  )

}
