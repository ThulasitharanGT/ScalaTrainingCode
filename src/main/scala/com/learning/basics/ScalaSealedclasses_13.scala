package com.learning.basics

object ScalaSealedclasses_13 extends App {
  //Sealed classes :In Traits and classes all subtypes must be declared in the same file.
  // The assures that all subtypes are known.
  sealed abstract class Furniture
  case class Couch() extends Furniture
  case class Chair() extends Furniture
  def findPlaceToSit(piece: Furniture): String = piece match {
    case a: Couch => "Lie on the couch"
    case b: Chair => "Sit on the chair"

  }
}
