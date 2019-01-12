package com.nielsen.basics

object AccessModifiers_33 extends App{

}
class Executive {
  //Variable workDetails will be accessible to any class within the enclosing package basics.
  private[basics] var workDetails = null
  //Variable friends will be accessible to any class within the enclosing package nielsen.
  private[nielsen] var friends = null
  //Variable secrets will be accessible only on the implicit object within instance methods (this)
  private[this] var secrets = null
  protected def f() { println("f") }

  def help(another : Executive) {
    println(another.workDetails)
  //  println(another.secrets) //ERROR
  }
}
class SubExecutive extends Executive
{
  f()
}