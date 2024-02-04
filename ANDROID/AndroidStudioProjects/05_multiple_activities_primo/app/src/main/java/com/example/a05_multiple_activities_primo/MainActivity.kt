package com.example.a05_multiple_activities_primo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.a05_multiple_activities_primo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding  by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.buttonGoToPrimo.setOnClickListener {


            binding.editPrimo.setOnClickListener {
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
//                    binding.= "O número $num é primo!!!"
                      startActivity(Intent(this, MainActivity2::class.java))
                else
//                    binding.textResultado.text = "O número $num NÃO é primo!!!"
                      startActivity(Intent(this, MainActivity3::class.java))

            }
        }


    }

}