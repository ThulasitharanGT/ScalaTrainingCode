package com.nielsen.basics

//Case classes are good for modeling immutable data
// Keyword case class, an identifier, and a parameter list
// the parameters are public vals.
case class Book(isbn: String)

case class Message(sender: String, recipient: String, body: String)



object CaseClasses_12 extends App {
  //new was not used to instantiate the Message case class.
  // because case classes have an apply method by default taking care of object construction
  val frankenstein = Book("978-0486282114")

  val message1 = Message("guillaume@quebec.ca", "jorge@catalonia.es", "Ça va ?")
  println(message1.sender)  // prints guillaume@quebec.ca
 // message1.sender = "travis@washington.us"  // this line does not compile
  //Cannot Re assign to Val , instead using var is discouraged

  // Comparison : compared by structure and not by reference:
  val message2 = Message("jorge@catalonia.es", "guillaume@quebec.ca", "Com va?")
  val message3 = Message("jorge@catalonia.es", "guillaume@quebec.ca", "Com va?")
  val message4 = Message("jorge@catalonia.es", "guillaume@quebec.ca", "Com")
  //message2 and message3 refer to different objects, the value of each object is equal.
  val messagesAreTheSame = message2 == message3  // true
  println(messagesAreTheSame)
  val messagesAreDiff = message3 == message4
  println(messagesAreDiff)

//Copying : create a (shallow) copy of an instance of a case class using the copy method.
// optionally constructor arguments can be changed.
  val message5 = Message("julien@bretagne.fr", "travis@washington.us", "Me zo o komz gant ma amezeg")
  val message6 = message5.copy(sender = message5.recipient, recipient = "claire@bourgogne.fr")
  println( message6.sender ) // travis@washington.us
    println(message6.recipient) // claire@bourgogne.fr
    println(message6.body)  // "Me zo o komz gant ma amezeg"
}
