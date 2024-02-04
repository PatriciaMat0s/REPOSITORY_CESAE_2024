package com.example.a05_multiple_activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private val binding  by lazy {
        ActivityMain.binding.inflate(layoutInflater)
    }

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(binding.root)

            binding.button01.setOnClickListener {

                Toast.makeText(applicationContext, "O BOTAO FOI CLICADO OMG", Toast.LENGTH_SHORT)
                    .show()
            }

            binding.buttonGo2ndPrimo.setOnClickListener {

                //val intent = Intent(this, MainActivity2::class.java)
                //startActivity(intent)
                //OU:
                startActivity(Intent(this, SplashScreenActivity::class.java))

            }

}}


