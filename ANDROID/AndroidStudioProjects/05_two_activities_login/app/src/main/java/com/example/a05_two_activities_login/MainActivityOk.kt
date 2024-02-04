package com.example.a05_two_activities_login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.a05_two_activities_login.databinding.ActivityMainNokBinding
import com.example.a05_two_activities_login.databinding.ActivityMainOkBinding

class MainActivityOk : AppCompatActivity() {


    private val binding  by lazy {
        ActivityMainOkBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_ok)

        binding.buttonVoltarOk.setOnClickListener {
            startActivity(Intent(this,  MainActivity::class.java))
        }

    }
}