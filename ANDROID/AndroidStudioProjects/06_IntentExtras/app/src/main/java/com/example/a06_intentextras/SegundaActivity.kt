package com.example.a06_intentextras

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.a06_intentextras.databinding.ActivitySegundaBinding

class SegundaActivity : AppCompatActivity() {

    private lateinit var  binding: ActivitySegundaBinding





    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivitySegundaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var i = intent
        val nome = i.extras?.getString("nome")

        binding.textSegunda.text = "Olá ${nome}!"


    }
}