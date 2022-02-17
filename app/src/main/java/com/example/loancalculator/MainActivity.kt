package com.example.loancalculator

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

  val loanCalculation=LoanCalculation()

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    btnCalculate.setOnClickListener {

      if(validateInput())
      {
        val loanAmount = etLoanAmount.text.toString().toFloat()
        val interest = etInterestRate.text.toString().toFloat()
        calculate(loanAmount, interest)
      }
      else
        Toast.makeText(this,"Please enter valid fields",Toast.LENGTH_LONG).show()

    }
  }

  private fun validateInput(): Boolean {
    var isValid = true

    if (etLoanAmount.text.toString().isEmpty() || etLoanAmount.text.toString()< 0.toString()) {
      isValid = false
    } else if (etInterestRate.text.toString().isEmpty() || etLoanAmount.text.toString()< 0.toString()) {
      isValid = false
    }

    return isValid
  }

  private fun calculate(loanAmt: Float, intrst: Float){
    val fiveYearsMonth = loanCalculation.getInterest(loanAmt, intrst, 5);
    val tenYearsMonth = loanCalculation.getInterest(loanAmt, intrst, 10);
    val fifteenYearsMonth = loanCalculation.getInterest(loanAmt, intrst, 15);
    val twentyYearsMonth = loanCalculation.getInterest(loanAmt, intrst, 20);
    val twentyfifthYearsMonth = loanCalculation.getInterest(loanAmt, intrst, 25);
    val thirtyYearsMonth = loanCalculation.getInterest(loanAmt, intrst, 30);


    val loanModel = LoanLengthModel(fiveYearsMonth, tenYearsMonth, fifteenYearsMonth, twentyYearsMonth, twentyfifthYearsMonth, thirtyYearsMonth)
    val intent = Intent(this, LoanLengthActivity::class.java)
    intent.putExtra("loanModel", loanModel)
    startActivity(intent)
  }


}