package com.carlatatiana.corem.treinops

import Api.CaracterService
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_pesquisa.*
import kotlinx.android.synthetic.main.activity_resultado.*
import model.Caracter
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class PesquisaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pesquisa)

        btPesquisar.setOnClickListener {
            val retrofit  = Retrofit.Builder()
                .baseUrl("https://swapi.co/api/people/1")
                .addConverterFactory(GsonConverterFactory.create())
                .build()

            val service = retrofit.create(CaracterService::class.java)




        }
    }

}






