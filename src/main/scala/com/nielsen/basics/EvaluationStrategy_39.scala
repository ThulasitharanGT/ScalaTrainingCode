package com.nielsen.basics


case class Document(numOfPages: Int, typeOfDoc: String)


object EvaluationStrategy_39 extends App{
//Call By Name :substitute the literal at the place from where we call our function
val printerSwitch = false
  //Function 1
  def printPages(doc: Document, lastIndex: Int, print: (Int) => Unit, isPrinterOn: () => Boolean) = {
    if(lastIndex <= doc.numOfPages && isPrinterOn()) for(i <- 1 to lastIndex) print(i)  }
  //Approach 1
  //looks odd; using a () => expression   as the result will be boolean and it is obvious
  printPages(Document(15, "DOCX"), 16, colorPrint, () => !printerSwitch)

  //Function 2 : => Byname
  //removed the () parenthesis and added => in function def
  def printPages1(doc: Document, lastIndex: Int, print: (Int) => Unit, isPrinterOn: => Boolean) =
  {
    if(lastIndex <= doc.numOfPages && isPrinterOn)
      for(i <- 1 to lastIndex) print(i)
  }
  val colorPrint = (index: Int) => {
    println(s"Printing Color Page $index.")
  }

  println("---------Method V1-----------")
  //Approach 2:

  //Boolean expression as a last argument. And because our function expects it to be of by name type,
  // it's going to be evaluated later when the call is actually made.
  printPages1(Document(15, "DOCX"), 2, colorPrint, !printerSwitch)

//Call By Value :expression is evaluated and the result is bound to the parameter

  def compareIntegers(value1: Int, value2: Int): Int =
    if (value1 == value2) 0 else if (value1 > value2) 1 else -1

  compareIntegers(10, 8)

}
