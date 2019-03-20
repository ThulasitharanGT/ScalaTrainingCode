package com.learning.self

object Main_Meassage {
  def main(args: Array[String]): Unit = {


    def testMessagePattern(l: List[Message]): String = {
      l match {
        case Nil => "Not found"
        case Message(EmailAddress(u1, d1), _) :: Message(EmailAddress(u2, d2), _) :: _ if (u1 == u2) => u1 + " got two successive emails"
        case h :: t => testMessagePattern(t)
      }
    }

    val messageList = List(
      Message("tom@gmail.com", "Message text 1"),
      Message("7742394590", "Message text 2"),
      Message("8326192398", "Message text 3"),
      Message("lisa@gmail.com", "Message text 4"),
      Message("lisa@yahoo.com", "Message text 5"),
      Message("harry@gmail.com", "Message text 6")
    )

    println(testMessagePattern(messageList))
  }
}
