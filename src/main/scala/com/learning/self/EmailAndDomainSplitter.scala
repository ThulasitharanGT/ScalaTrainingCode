package com.learning.self

class EmailAndDomainSplitter(mailId:String) {

  var domain:String = null
  var name:String = null
  def apply={
    val splitted= mailId.split("@")
    if (splitted.length == 2)
   {
     domain = splitted(1)
    name=splitted(0)
   }
  }
}
