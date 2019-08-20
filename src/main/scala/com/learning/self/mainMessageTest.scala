package com.learning.self

object mainMessageTest {
  def main(args: Array[String]): Unit = {
    val messageList = List(
      Message("tom@gmail.com", "Message text 1"),
      Message("7742394590", "Message text 2"),
      Message("8326192398", "Message text 3"),
      Message("lisa@gmail.com", "Message text 4"),
      Message("lisa@yahoo.com", "Message text 5"),
      Message("harry@gmail.com", "Message text 6")
    )

  messageList match {
    case nil => println("Nil")
    }

  }

}
