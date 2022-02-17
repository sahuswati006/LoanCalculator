package com.example.loancalculator

class LoanCalculation {

   fun getInterest(loanAmount:Float, interestRate: Float, years: Int): Float{
     val annual = (loanAmount * interestRate * years) / 100
     return annual / 12
  }
}