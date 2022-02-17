package com.example.loancalculator

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.single_row_loan.view.*

class LoanDislayAdapter(val context: Context, val items:LoanLengthModel): RecyclerView.Adapter<LoanDislayAdapter.ViewHolder>()  {

  class ViewHolder(view: View):RecyclerView.ViewHolder(view){
    val llHistoryMainItem = view.ll_loan_view
    val tvItem = view.tvItem
    val tvPosition = view.tvPosition
  }

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LoanDislayAdapter.ViewHolder {
    return ViewHolder(
      LayoutInflater.from(context).
    inflate(R.layout.single_row_loan,parent,false))
  }

  override fun onBindViewHolder(holder: LoanDislayAdapter.ViewHolder, position: Int) {
//    val date:String = items.get(position)
//    holder.tvPosition.text = (position+1).toString()
//    holder.tvItem.text = date
//
//    if (position % 2 == 0) {
//      holder.llHistoryMainItem.setBackgroundColor(
//        Color.parseColor("#EBEBEB"))
//    }else{
//      holder.llHistoryMainItem.setBackgroundColor(
//        Color.parseColor("#FFFFFF"))
//    }
  }

  override fun getItemCount(): Int {
   TODO()
  }


}