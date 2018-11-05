package model

import com.google.gson.annotations.SerializedName

data class Caracter(

        @SerializedName("name") val nome: String,
        @SerializedName("skin") val skin: String,
        @SerializedName("gender") val gender: String
)
