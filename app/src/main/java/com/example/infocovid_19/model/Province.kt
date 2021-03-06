package com.example.infocovid_19.model

import com.google.gson.annotations.SerializedName

data class Province(
    @SerializedName("Kode_Provi")
    val code: Int,
    @SerializedName("Provinsi")
    val province: String,
    @SerializedName("Kasus_Posi")
    val positive: Int,
    @SerializedName("kasus_Semb")
    val recover: Int,
    @SerializedName("Kasus_Meni")
    val death: Int

)