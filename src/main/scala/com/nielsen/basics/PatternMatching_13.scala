package com.nielsen.basics

import scala.util.Random
//checking a value against a pattern
//Analogous to Switch in Java

abstract class Notification
case class Email(sender: String, title: String, body: String) extends Notification
case class SMS(caller: String, message: String) extends Notification
case class VoiceRecording(contactName: String, link: String) extends Notification

object PatternMatching_13 extends App{

  val x: Int = Random.nextInt(10)
 println( x match {
    case 0 => "zero"
    case 1 => "one"
    case 2 => "two"
    case _ => "many" //_ is a catch all or default case
   })

//Match Expression with Value
  def matchTest(x: Int): String = x match {
    case 1 => "one"
    case 2 => "two"
    case _ => "many"
  }
  println(matchTest(3) ) // many
    println( matchTest(1) ) // one

  //Matching on case classes
  def showNotification(notification: Notification): String = {
    notification match {
      case Email(email, title, _) =>
        s"You got an email from $email with title: $title"
      case SMS(number, message) =>
        s"You got an SMS from $number! Message: $message"
      case VoiceRecording(name, link) =>
        s"you received a Voice Recording from $name! Click the link to hear it: $link"
    }
  }
  val sms = SMS("12345", "Are you there?")
  val VR = VoiceRecording("Tom", "voicerecording.org/id/123")

  val someSms = SMS("867-5309", "Are you there?")
  val someVoiceRecording = VoiceRecording("Tom", "voicerecording.org/id/123")
  println(showNotification(someSms))  // prints You got an SMS from 12345! Message: Are you there?
  println(showNotification(someVoiceRecording))  // you received a Voice Recording from Tom! Click the link to hear it: voicerecording.org/id/123

  //Matching on type only
  abstract class Device
  case class Phone(model: String) extends Device {
    def screenOff = "Turning screen off"
  }
  case class Computer(model: String) extends Device {
    def screenSaverOn = "Turning screen saver on..."
  }
  // has a different behavior depending on the type of Device.
  // convention to use the first letter of the type as the case identifier (p and c in this case).
  def goIdle(device: Device) = device match {
    case p1: Phone => p1.screenOff
    case c: Computer => c.screenSaverOn

  }
}
