package com.learning.self

// Factory Pattern
abstract class Account  {
  def Balance : Double
  def InterestRate : Double
  def Withdraw (WithdrawAmount :Double)
  def Deposit(DepositAmount :Double)
  def MinimumBalance : Double
}

object Account  {
  val Savings_Account =0
  val Current_Account =1
  val Pension_Account =2
  val Salary_Account =3
  val Junior_Account =4

  private class SavingsAccount extends Account
  {
    var _Balance:Double=3500
    var _MinimumBalance:Double=500
    var _InterestRate:Double=3.5
    override def Balance : Double =_Balance
    override def InterestRate : Double = _InterestRate
    override def MinimumBalance : Double =_MinimumBalance
    override def Withdraw (WithdrawAmount :Double) =    {
      if (_Balance-WithdrawAmount >= _MinimumBalance)
      {_Balance =_Balance-WithdrawAmount }
      else { println("No sufficient funds")  }
    }
    override def Deposit (DepositAmount :Double) ={_Balance =_Balance+DepositAmount}
  }
  private class CurrentAccount extends Account
  {
    var _Balance:Double=3500
    var _MinimumBalance:Double=1000
    var _InterestRate:Double=3.25
    override def Balance : Double =_Balance
    override def InterestRate : Double = _InterestRate
    override def MinimumBalance : Double =_MinimumBalance
    override def Withdraw (WithdrawAmount :Double) =    {
      if (_Balance-WithdrawAmount >= _MinimumBalance)
      {_Balance =_Balance-WithdrawAmount }
      else { println("No sufficient funds")  }
    }
    override def Deposit (DepositAmount :Double) ={_Balance =_Balance+DepositAmount}
  }
  private class PensionAccount extends Account
  {
    var _Balance:Double=3500
    var _MinimumBalance:Double=100
    var _InterestRate:Double=4.5
    override def Balance : Double =_Balance
    override def InterestRate : Double = _InterestRate
    override def MinimumBalance : Double =_MinimumBalance
    override def Withdraw (WithdrawAmount :Double) =    {
      if (_Balance-WithdrawAmount >= _MinimumBalance)
      {_Balance =_Balance-WithdrawAmount }
      else { println("No sufficient funds")  }
    }
    override def Deposit (DepositAmount :Double) ={_Balance =_Balance+DepositAmount}
  }
  private class SalaryAccount extends Account
  {
    var _Balance:Double=3500
    var _MinimumBalance:Double=0
    var _InterestRate:Double=3.5
    override def Balance : Double =_Balance
    override def InterestRate : Double = _InterestRate
    override def MinimumBalance : Double =_MinimumBalance
    override def Withdraw (WithdrawAmount :Double) =    {
      if (_Balance-WithdrawAmount >= _MinimumBalance)
      {_Balance =_Balance-WithdrawAmount }
      else { println("No sufficient funds")  }
    }
    override def Deposit (DepositAmount :Double) ={_Balance =_Balance+DepositAmount}
  }
  private class JuniorAccount extends Account
  {
    var _Balance:Double=3500
    var _MinimumBalance:Double=0
    var _InterestRate:Double=3.5
    override def Balance : Double =_Balance
    override def InterestRate : Double = _InterestRate
    override def MinimumBalance : Double =_MinimumBalance
    override def Withdraw (WithdrawAmount :Double) =    {
      if (_Balance-WithdrawAmount >= _MinimumBalance)
      {_Balance =_Balance-WithdrawAmount }
      else { println("No sufficient funds")  }
    }
    override def Deposit (DepositAmount :Double) ={_Balance =_Balance+DepositAmount}
  }

  def apply(AccountType: Int): Account = {
    AccountType match{
      case Savings_Account => new SavingsAccount()
      case Current_Account => new CurrentAccount()
      case Pension_Account => new PensionAccount()
      case Salary_Account => new SalaryAccount()
      case Junior_Account => new JuniorAccount()
      case _ => new SavingsAccount()
    }
  }
}


