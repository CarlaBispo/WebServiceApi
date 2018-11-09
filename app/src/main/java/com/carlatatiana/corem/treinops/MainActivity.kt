package com.carlatatiana.corem.treinops

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    private val SPLASH_DISPLAY_LENGTH = 5500L
    lateinit var ivSplash: ImageView




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ivSplash = findViewById(R.id.ivSplash)
        carregar()

    }

    private fun carregar(){
        val anim = AnimationUtils.loadAnimation(getApplicationContext(),
            R.anim.anim_splash)
        //anim.reset()
        ivSplash.setAnimation(anim);
        ivSplash.startAnimation(anim)

        Handler().postDelayed({
            val intent = Intent(this@MainActivity, SobreActivity::class.java)
            intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
            startActivity(intent)
            this.finish()

        },SPLASH_DISPLAY_LENGTH)

    }

}

