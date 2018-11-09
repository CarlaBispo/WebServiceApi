package com.carlatatiana.corem.treinops


import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_pesquisa.*



class PesquisaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pesquisa)

        // botao pesquisar

        btPesquisar.setOnClickListener {
            val ir = btPesquisar
            val intent = Intent(this, ResultadoActivity::class.java)
            intent.putExtra("1", etCodigo.text.toString())
            startActivity(intent)
            //finish()
        }
    }

    //botao sobre

    fun sobre(view: View){
        val sobre = btSobre
        val intent = Intent(this, SobreActivity::class.java)
        startActivity(intent)
        finish()
    }

}







