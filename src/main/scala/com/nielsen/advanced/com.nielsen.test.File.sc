val r = "aaa"


val ingredient = ("Sugar" , 25):Tuple2[String, Int]
val (name, quantity) = ingredient
val (des,_) = ingredient


val x:Int = 10
x.max(30)


val rawString = raw"I have no escape \n character in the String \n "
val usualString = "I have no escape \n character in the String \n "


def toInt(in: String): Option[Int] = {
  try {
    Some(Integer.parseInt(in.trim))
  } catch {
    case e: NumberFormatException => None
  }
}
toInt("1")