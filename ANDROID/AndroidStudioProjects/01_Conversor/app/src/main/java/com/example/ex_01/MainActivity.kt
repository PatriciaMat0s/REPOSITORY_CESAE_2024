package com.example.ex_01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ex_01.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

   private val binding by lazy {
       ActivityMainBinding.inflate(layoutInflater)
   }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.buttonConverter.setOnClickListener {
//
            var eur: Double = binding.editTextEuro.text.toString().toDouble()
            var taxaConversao : Double = 1.09
            var dol: Double = eur * taxaConversao
            dol = String.format("%.2f", dol).toDouble()
            binding.textDollars.text = "$dol $"
        }

    }
}

//class MainActivity : AppCompatActivity() {
//
//    private lateinit var binding: ActivityMainBinding
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        binding = ActivityMainBinding.inflate(layoutInflater)
//        setContentView(R.layout.activity_main)
//
//        binding.editTest2.setOnClickListener {
//            //aqui vamos ler o valor inserido na EditText e
//            //apresentar o valor concatenado com “Olá” no TextView:
////            val euros: Double = binding.etValorEuros.text.toString().toDouble()
//
//            val eur: Double = binding.editTest2.text.toString().toDouble()
//            val dol: Double = num * 1.09
//            binding.textResultado.text = num.toString()
//        }
//    }
//}