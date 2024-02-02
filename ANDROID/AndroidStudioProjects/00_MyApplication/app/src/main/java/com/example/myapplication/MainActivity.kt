package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.buttonOla.setOnClickListener {
            //aqui vamos ler o valor inserido na EditText e
            //apresentar o valor concatenado com “Olá” no TextView:
            var nome: String = binding.editNome.text.toString()
            binding.textResultado.text = "HI THERE, " + nome + "!!!"
        }
    }
}