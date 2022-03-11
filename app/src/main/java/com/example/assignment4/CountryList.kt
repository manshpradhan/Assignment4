package com.example.assignment4

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

open class CountryList{

    @SerializedName("name")
    @Expose
    val name: String? = null

    @SerializedName("alpha_code_2")
    @Expose
    val alphaCode2: String? = null

    @SerializedName("alpha_code_3")
    @Expose
    val alphaCode3: String? = null

    @SerializedName("emoji")
    @Expose
    val emoji: String? = null

}