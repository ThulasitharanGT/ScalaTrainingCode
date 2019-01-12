package com.nielsen.basics

//An upper type bound T <: A declares that type variable T refers to a subtype of type A
abstract class Ani {
  def name: String
}
abstract class Pen extends Ani {}

class Nib extends Pen {
  override def name: String =  "Nib"
}
class Tip extends Pen {
  override def name: String = "Tip"
}
class Ink extends Ani {
  override def name: String = "Ink"
}
class PetContainer[P <: Pen](p: P) {
  def pet: P = p
}
object UpperTypeBounds_20 extends App{
  val dogContainer = new PetContainer[Tip](new Tip)
  val catContainer = new PetContainer[Nib](new Nib)
//  val lionContainer = new PetContainer[Ink](new Ink)
//                         ^this would not compile
}
