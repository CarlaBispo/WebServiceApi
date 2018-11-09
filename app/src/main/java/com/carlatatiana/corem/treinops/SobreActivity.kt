package com.carlatatiana.corem.treinops

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_sobre.*

class SobreActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sobre)
    }


    fun seguir(view: View) {
        val ir = btSeguir
        val intent = Intent(this, PesquisaActivity::class.java)
        startActivity(intent)
        finish()
    }

}
