package com.learning.basics

//takes a type as a parameter : used for collection classes.

class Stack[A] //type as a parameter within square brackets []
{

  private var elements: List[A] = Nil
  def push(x: A) { elements = x :: elements }
  def peek: A = elements.head
  def pop(): A = {
    val currentTop = peek
    elements = elements.tail
    currentTop
  }
}


//Using Sub Types
class Fruit
class Apple extends Fruit
class Banana extends Fruit


object GenericClasses_18 extends App {

  val stack = new Stack[Int]
  stack.push(1)
  stack.push(2)
  println(stack.pop)  // prints 2
  println(stack.pop)  // prints 1

  //Subtypes can Also Be used
  val fruitStack = new Stack[Fruit]
  val apple = new Apple
  val banana = new Banana

  fruitStack.push(apple)
  fruitStack.push(banana)
  //type Stack[Char] cannot be used as an integer stack of type Stack[Int].
}
