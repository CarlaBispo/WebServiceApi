package com.carlatatiana.corem.treinops.Api

import com.carlatatiana.corem.treinops.Model.Caracter
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface CaracterService {

        @GET("/api/people/{user}")
        fun buscarCaracter(@Path("user") user: String): Call<Caracter>
    }

