package com.learning.self

object TestingFunction
{
  def main(args: Array[String]): Unit =
  {
    val Num_List=1 to 10
    val Num_List2= Num_List.map( x =>x + 5)
    println(Num_List2)
    val Num_List3= Num_List2.reduce((x,y) => x+y+1)
    println(Num_List3)
    val Num_List_Fun= ( x: Int)=> {x + 5}
    println(Num_List_Fun(4))
    for ( i <- Num_List)
    println(Num_List_Fun(i))
    val Num_List_Fun_2= ( x: Int,y : String)=> {y+x+y}
    println(Num_List_Fun_2(3,"#"))

  }

}
