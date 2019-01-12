package com.nielsen.basics



//Methods and values that aren’t associated with individual instances of a class
//Denoted as Objects
//Object is a class that has exactly one instance.
// It is created lazily when it is referenced, like a lazy val.
object SingletonObjects_14 extends App{
  def sum(l: List[Int]): Int = l.sum
}

object Logger {
  def info(message: String): Unit = println(s"INFO: $message")
}
class Project(name: String, daysToComplete: Int)
class LoggerCheck {
  val project1 = new Project("TPS Reports", 1)
  val project2 = new Project("Website redesign", 5)
  Logger.info("Created projects")  // Prints "INFO: Created projects"
}
class Test
{
  val ListVal = List(1,2,3)
  //Available Globally
  println(SingletonObjects_14.sum(ListVal))
}

//static is not a keyword in Scala. the members would be static, including classes, should go in a singleton object
class X {
  import X._
  def blah = foo
}
object X {
  private def foo = 42
}