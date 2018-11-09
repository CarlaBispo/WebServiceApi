package com.carlatatiana.corem.treinops


import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.carlatatiana.corem.treinops.Api.CaracterService
import com.carlatatiana.corem.treinops.Model.Caracter
import kotlinx.android.synthetic.main.activity_resultado.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class ResultadoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        // contexto webservice

        val  put = intent.getStringExtra("1")

        val retrofit = Retrofit.Builder()
            .baseUrl("https://swapi.co")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val service = retrofit.create(CaracterService::class.java)
        service.buscarCaracter(put)
            .enqueue(object : Callback<Caracter>{
                override fun onFailure(call: Call<Caracter>?, t: Throwable?) {
                    Toast.makeText(this@ResultadoActivity, "BRAVO!", Toast.LENGTH_SHORT).show()
                }

                override fun onResponse(call: Call<Caracter>?, response: Response<Caracter>?){
                   val Caracter = response?.body()
                    tvName.text = Caracter?.name
                    tvBirth.text = Caracter?.birth_year
                    tvGender.text = Caracter?.gender
                    tvHair.text = Caracter?.hair_color
                    tvSkin.text = Caracter?.skin_color

                }
            })

        btQuit.setOnClickListener {
            val Pesquisa = Intent(this, PesquisaActivity::class.java)
            startActivity(Pesquisa)
            finish()
        }
        }
    }


