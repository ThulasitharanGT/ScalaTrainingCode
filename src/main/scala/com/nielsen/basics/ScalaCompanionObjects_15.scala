package com.nielsen.basics
import math.Ordering
import scala.math._

//Companions : singleton object of the same name of case class
//class and its companion object defined in the same source file
class IntPair(val x: Int, val y: Int)
{
  private val welcome = "Hello"
}

//A companion class or object can access the private members of its companion
object IntPair {

  implicit def ipord: Ordering[IntPair] =
    Ordering.by(ip => (ip.x, ip.y))
}

//With Case class
case class Circle(radius: Double) {
  import Circle._
  //Calculate Area is Private Member of object
  def area: Double = calculateArea(radius)
}

object Circle {
  private def calculateArea(radius: Double): Double = Pi * pow(radius, 2.0)
}

//companion object can also contain factory methods:
class Email1(val username: String, val domainName: String)

object Email1 {
  //Factory Pattern
  def fromString(emailString: String): Option[Email1] = {
    emailString.split('@') match {
      case Array(a, b) => Some(new Email1(a, b))
      case _ => None
    }
  }
}

object ScalaCompanionObjects_15 extends App {

  val circle1 = new Circle(5.0)
  circle1.area
//The object Email contains a factory fromString which creates an Email instance from a String.
// We return it as an Option[Email] in case of parsing errors.
  val scalaCenterEmail = Email1.fromString("scala.center@epfl.ch")
  scalaCenterEmail match {
    case Some(email) => println(
      s"""Registered an email
         |Username: ${email.username}
         |Domain name: ${email.domainName}
     """)
    case None => println("Error: could not parse email")
  }


}
