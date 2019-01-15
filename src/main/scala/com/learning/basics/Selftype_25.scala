package com.learning.basics
//way to declare that a trait must be mixed into another trait without extending
//write an identifier, the type of another trait to mix in, and a => (e.g. someIdentifier: SomeOtherTrait =>).

trait User1 {
  def username: String
}
trait Tweeter1 {
  this: User1 =>  // reassign this
  def tweet(tweetText: String) = println(s"$username: $tweetText")
}
class VerifiedTweeter1(val username_ : String) extends Tweeter1 with User1 {  // We mixin User because Tweeter required it
  def username = s"real $username_"
}

object Selftype_25 extends App{
  //this: User => in trait Tweeter, now the variable username is in scope
  // for the tweet method. This also means that since VerifiedTweeter extends Tweeter,
  // it must also mix-in User (using with User).

  val realBeyoncé = new VerifiedTweeter1("Beyoncé")
  realBeyoncé.tweet("Just spilled my glass of lemonade")  // prints "real Beyoncé: Just spilled my glass of lemonade"
}
