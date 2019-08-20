package com.learning.self

class PartSet extends Part {
  var Part_Price:Int=0
  def setPrice (Temp_Price:Int) : Unit= {Part_Price=Temp_Price}
  def ShowPrice():Unit  ={println("Price : "+Part_Price)      }

}
