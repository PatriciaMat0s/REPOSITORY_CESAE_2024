package com.example.a05_multiple_activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.a05_multiple_activities.databinding.ActivityMain2Binding
import com.example.a05_multiple_activities.databinding.ActivityMainBinding


class MainActivity2 : AppCompatActivity() {

    private val binding  by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.buttonGo2ndPrimo.setOnClickListener {
//
            val num: Int = binding.editPrimo.text.toString().toInt()
            var flag = false

            for (i in 2..num-1) {
                if (num % i == 0) { //ie, se o numero nao for primo
                    flag = true
                    break
                }
            }
            if (flag == false) //if (!flag)
                binding.= "O número $num é primo!!!"
            else
            binding.textResultado.text = "O número $num NÃO é primo!!!"

        }


    }
}