package com.learning.basics

object PatternGuards_14 extends App{

  def showImportantNotification(notification: Notification, importantPeopleInfo: Seq[String]): String = {
    notification match {
      case Email(email, _, _) if importantPeopleInfo.contains(email) =>
        "You got an email from special someone!"
      case SMS(number, _) if importantPeopleInfo.contains(number) =>
        "You got an SMS from special someone!"
      case other =>
        PatternMatching_13.showNotification(other) // nothing special, delegate to our original showNotification function
    }
  }

  val importantPeopleInfo = Seq("867-5309", "jenny@gmail.com")

  val someSms = SMS("867-5309", "Are you there?")
  val someVoiceRecording = VoiceRecording("Tom", "voicerecording.org/id/123")
  val importantEmail = Email("jenny@gmail.com", "Drinks tonight?", "I'm free after 5!")
  val importantSms = SMS("867-5309", "I'm here! Where are you?")

  println(showImportantNotification(someSms, importantPeopleInfo))
  println(showImportantNotification(someVoiceRecording, importantPeopleInfo))
  println(showImportantNotification(importantEmail, importantPeopleInfo))
  println(showImportantNotification(importantSms, importantPeopleInfo))
}
