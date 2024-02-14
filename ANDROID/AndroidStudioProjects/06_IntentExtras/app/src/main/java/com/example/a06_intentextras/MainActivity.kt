package com.example.a06_intentextras

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.a06_intentextras.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var  binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonSegunda.setOnClickListener {

            var nome = binding.editNome.text.toString()
            var i: Intent = Intent(this, SegundaActivity ::class.java)
            i.putExtra("nome", nome)

            startActivity(i)
        }




    }
}