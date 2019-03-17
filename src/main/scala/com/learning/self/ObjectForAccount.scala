package com.learning.self
import com.learning.self.Account._
object ObjectForAccount
{
  def main(args: Array[String]): Unit = {
    var a= Account(Savings_Account)
    println(a.Balance)
    println(a.InterestRate)
    println(a.MinimumBalance)
    a.Deposit(458.5)
    println(a.Balance)
  }
}
