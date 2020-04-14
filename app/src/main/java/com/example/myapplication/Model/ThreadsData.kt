package com.example.myapplication.Model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ThreadsData(
    var title : String,
    var name : String,
    var detail : String
) : Parcelable