package com.example.navigationdatabindingtest.model
 import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class UserPersonalModel(val name: String,
                        val edad: Int,
                        val hobby: String) : Parcelable{

}
