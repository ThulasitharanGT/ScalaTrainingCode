package com.nielsen.basics

object HigherOrderFunctions_09 extends App {
//take other functions as parameters or return a function as a result
  //Map is a example of Higher Order function

  val salaries = Seq(20000, 70000, 40000)
  //the tuple on the left of the arrow => is a parameter list
  // and the value of the expression on the right is what gets returned
  val doubleSalary = (x: Int) => x * 2
  val newSalaries = salaries.map(doubleSalary)

  //Shrinking using Anonymous Function
  //compiler can infer the type of x  based on the type of function map expect
  val newSalariesAnon = salaries.map(x => x * 2) // List(40000, 140000, 80000)
  //val newSalariesAnon1 = salaries.map(1)

  val salConcise = salaries.map(_ * 2)

  //Place Holder Syntax

  //Define a range
  val r = 1 to 5

  //Option 1 - define a function value and then pass it
  val f = (x:Int) => x + 10 ;  r.map(f)

  //Option 2 - pass an inline function value as a single step
  r.map(x => x + 10)
  r.reduce((x,y) => x * y )

//Map takes 1 param , Reduce take 2 param . so x = > ? ,(x,y) => ?  removed?
 /* r.map(x + 10)
  r.reduce(x * y )*/

  // makes it possible to remove the list of parameters.
  r.map(_ + 10)
  //One Parameter one _
  r.reduce(_ * _ )

  //Examples
  r.filter(x => x > 5)   ; r.filter(_ > 5)

  r.reduce((x,y) => x + y / x min y) ; // r.reduce(  _ + _ / _ min _)
}
//pass methods as arguments
case class WeeklyWeatherForecast(temperatures: Seq[Double]) {
// coerce the method into a function.
  private def convertCtoF(temp: Double) = temp * 1.8 + 32

  // compiler coerces convertCtoF to the function x => convertCtoF(x)  : X generated Variable within scope
  def forecastInFahrenheit: Seq[Double] = temperatures.map(convertCtoF) // <-- passing the method convertCtoF
}

//Functions that accept functions
object SalaryRaiser {
  //Method only vary by multiplication factor

  def smallPromotion(salaries: List[Double]): List[Double] =
    salaries.map(salary => salary * 1.1)

  def greatPromotion(salaries: List[Double]): List[Double] =
    salaries.map(salary => salary * math.log(salary))

  def hugePromotion(salaries: List[Double]): List[Double] =
    salaries.map(salary => salary * salary)
}

//Reduce redundant code
object SalaryRaiserupdated {

  val salaries = List(1000.00,2000.00)
  //salaries plus a function of type
  private def promotion(salaries: List[Double], promotionFunction: Double => Double): List[Double] =
    salaries.map(promotionFunction)

  def smallPromotion(salaries: List[Double]): List[Double] =
    promotion(salaries, salary => salary * 1.1)

  def bigPromotion(salaries: List[Double]): List[Double] =
    promotion(salaries, salary => salary * math.log(salary))

  def hugePromotion(salaries: List[Double]): List[Double] =
    promotion(salaries, salary => salary * salary)


  val diffpro = promotion(salaries, salary => salary * salary)
}

//Functions that return functions
object ReturnFunction {

  //(String, String) => String
  def urlBuilder(ssl: Boolean, domainName: String): (String, String) => String = {
    val schema = if (ssl) "https://" else "http://"
    (endpoint: String, query: String) => s"$schema$domainName/$endpoint?$query"
  }

  val domainName = "www.example.com"
  def getURL = urlBuilder(ssl=true, domainName)
  val endpoint = "users"
  val query = "id=1"
  val url = getURL(endpoint, query) // "https://www.example.com/users?id=1": String
  // anonymous function is (endpoint: String, query: String) => s"https://www.example.com/$endpoint?$query".
}