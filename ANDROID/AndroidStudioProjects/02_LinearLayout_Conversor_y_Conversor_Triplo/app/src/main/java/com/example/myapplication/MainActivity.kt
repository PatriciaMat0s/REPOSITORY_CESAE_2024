package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy() {
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        binding.buttonReal.setOnClickListener{
            // buttonReal é uma conversao do id dado no .xml (button_real) para linguagem Kotlin-friendly (sem underscores e em pascalCase)
            var eur: Double = binding.editValorEuros.text.toString().toDouble()
            var taxaConversao : Double =4.4
            var real: Double = eur * taxaConversao
            real = String.format("%.2f", real).toDouble()
            binding.textResultado.text = "$real R$"
        }


        binding.buttonDolar.setOnClickListener{
            // buttonReal é uma conversao do id dado no .xml (button_real) para linguagem Kotlin-friendly (sem underscores e em pascalCase)
            var eur: Double = binding.editValorEuros.text.toString().toDouble()
            var taxaConversao : Double =1.20
            var dol: Double = eur * taxaConversao
            dol = String.format("%.2f", dol).toDouble()
            binding.textResultado.text = "$dol US$"
        }


        binding.buttonPeso.setOnClickListener{
            // buttonReal é uma conversao do id dado no .xml (button_real) para linguagem Kotlin-friendly (sem underscores e em pascalCase)
            var eur: Double = binding.editValorEuros.text.toString().toDouble()
            var taxaConversao : Double =31.5
            var peso: Double = eur * taxaConversao
            peso = String.format("%.2f", peso).toDouble()
            binding.textResultado.text = "$peso $"
        }


    }
}