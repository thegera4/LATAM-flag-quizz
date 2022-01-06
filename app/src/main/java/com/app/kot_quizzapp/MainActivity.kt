package com.app.kot_quizzapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.app.kot_quizzapp.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    //lateinit var mAdView : AdView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

       /* //ads initialization
        MobileAds.initialize(this@MainActivity)

        //Banner ad
        mAdView = findViewById(R.id.adView)
        val adRequest = AdRequest.Builder().build()
        mAdView.loadAd(adRequest)*/

        /*alternativa para eliominar barra superior de UI que aun funciona ???
        pero deshabilita el ajuste
        @Suppress("DEPRECATION")
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            window.insetsController?.hide(WindowInsets.Type.statusBars())
        } else {
            window.setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN
            )
        } */

        //para eliminar barra superior de sistema (visto en el curso) pero deprecated no sirve
        //window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        /*alternativa para eliominar barra superior de UI que aun funciona ???
        pero deshabilita el ajuste
        if (Build.VERSION.SDK_INT > 16) {
            window.setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN)
        }*/

        binding.button.setOnClickListener {
            if (binding.etNombre.text.toString().isEmpty()){
                Toast.makeText(this, "Please enter your name",
                    Toast.LENGTH_SHORT).show()
            } else {
                val intent = Intent(this, QuestionsActivity::class.java)
                intent.putExtra(Constants.USER_NAME, binding.etNombre.text.toString())
                startActivity(intent)
                finish()
            }
        }
    }
}