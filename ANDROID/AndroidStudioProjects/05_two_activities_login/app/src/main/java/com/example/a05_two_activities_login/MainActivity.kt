package com.example.a05_two_activities_login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.a05_two_activities_login.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private val binding  by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.buttonLogin.setOnClickListener {
            var username: String = binding.editUsername.text.toString()
            var password: String = binding.editPassword.text.toString()

            binding.editUsername.setText("")
            binding.editPassword.text.clear() //equivalente ao anterior


            if(username.equals("user") && password.equals("pass")) {

//              Toast.makeText(applicationContext, "VALID LOGIN!", Toast.LENGTH_SHORT).show()
                startActivity(Intent(this,  MainActivityOk::class.java))

            }else{
//              Toast.makeText(applicationContext, "OUPSIE, INVALID LOGIN!", Toast.LENGTH_SHORT).show()
                startActivity(Intent(this,  MainActivityNok::class.java))

            }
        }

    }
}