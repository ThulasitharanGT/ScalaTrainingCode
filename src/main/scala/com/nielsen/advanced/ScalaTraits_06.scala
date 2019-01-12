package com.nielsen.advanced

trait WelcomeTrait_06 {
  def welcome(name: String): Unit
}

trait WelcomeTraits_06 {
  def ScalaTrait(name: String): Unit =
    println("Hello, " + name + "!")
}
class WelcomeByDefault extends WelcomeTraits_06

// Multiple Traits Can also be extended
class CustomizableWelcome(prefix: String, postfix: String) extends WelcomeTraits_06 {
  override def ScalaTrait(name: String): Unit = {
    println(prefix + name + postfix)
  }
}

object ScalaTraits_06 extends App{
  //Classes and objects can extend traits but traits cannot be instantiated and therefore have no parameters.
  //Trait : similar to Interface in Java
  //types containing certain fields and methods
  val greeter = new WelcomeByDefault()
  greeter.ScalaTrait("Scala developer") // Hello, Scala developer!
  val customGreeter = new CustomizableWelcome("How are you, ", "?")
  customGreeter.ScalaTrait("Scala developer")

}
