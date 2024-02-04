package com.example.a05_two_activities_login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.a05_two_activities_login.databinding.ActivityMainBinding
import com.example.a05_two_activities_login.databinding.ActivityMainNokBinding

class MainActivityNok : AppCompatActivity() {

    private val binding  by lazy {
        ActivityMainNokBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_nok)


    Toast.makeText(applicationContext, "OUPSIE, INVALID LOGIN!", Toast.LENGTH_SHORT).show()

        binding.buttonVoltarNok.setOnClickListener {
        startActivity(Intent(this,  MainActivity::class.java))
        }


    }
}