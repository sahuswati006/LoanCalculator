package com.example.loancalculator

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import java.io.Serializable

@Parcelize
data class LoanLengthModel(
  val fiveYearsMthlyPymt: Float,
  val tenYearsMthlyPymt: Float,
  val fifteenYearsMthlyPymt: Float,
  val twentyYearsMthlyPymt: Float,
  val twentyfifthYearsMthlyPymt: Float,
  val thirtyYearsMthlyPymt: Float
):Parcelable


//data class LoanLengthModel1(
//  val fiveYearsMthlyPymt: Float,
//  val tenYearsMthlyPymt: Float,
//  val fifteenYearsMthlyPymt: Float,
//  val twentyYearsMthlyPymt: Float,
//  val twentyfifthYearsMthlyPymt: Float,
//  val thirtyYearsMthlyPymt: Float
//):Parcelable