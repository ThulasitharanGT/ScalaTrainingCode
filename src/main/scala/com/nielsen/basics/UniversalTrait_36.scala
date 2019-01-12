package com.nielsen.basics

//Value classes and Universal Traits
//avoid allocating runtime objects : Has primary constructor ,one val param ,only methods (def)
// not allowed var, val, nested classes, traits, or objects. Value class cannot be extended by another class
//permit value classes to extend traits, universal traits extending for Any.
trait Extensive extends Any {
  def print(): Unit = println(this)
}
class Wrapper(val underlying: Int) extends AnyVal with Extensive
object UniversalTrait_36 extends App  {

}
