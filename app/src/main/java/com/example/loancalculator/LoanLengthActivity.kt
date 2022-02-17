package com.example.loancalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_loan_length.*

class LoanLengthActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_loan_length)

    setSupportActionBar(toolbar_history_activity)
    val actionbar = supportActionBar
    if(actionbar!=null) {
      actionbar.setDisplayHomeAsUpEnabled(true)
      actionbar.title = "Loan Length"
    }

    toolbar_history_activity.setNavigationOnClickListener {
      onBackPressed()
    }


    val loanModelObject = intent.getParcelableExtra<LoanLengthModel>("loanModel")

    if (loanModelObject != null) {
      tv5YrPosition.text = getString(R.string.five_year)
      tv10YrPosition.text = getString(R.string.ten_year)
      tv15YrPosition.text = getString(R.string.fifteen_year)
      tv20YrPosition.text = getString(R.string.twenty_year)
      tv25YrPosition.text = getString(R.string.twentyfifth_year)
      tv30YrPosition.text = getString(R.string.thirty_year)

      tv5YrItem.text = "$"+loanModelObject.fiveYearsMthlyPymt.toString()
      tv10YrItem.text = "$"+loanModelObject.tenYearsMthlyPymt.toString()
      tv15YrItem.text = "$"+loanModelObject.fifteenYearsMthlyPymt.toString()
      tv20YrItem.text = "$"+loanModelObject.twentyYearsMthlyPymt.toString()
      tv25YrItem.text = "$"+loanModelObject.twentyfifthYearsMthlyPymt.toString()
      tv30YrItem.text = "$"+loanModelObject.thirtyYearsMthlyPymt.toString()


    }





  }
}