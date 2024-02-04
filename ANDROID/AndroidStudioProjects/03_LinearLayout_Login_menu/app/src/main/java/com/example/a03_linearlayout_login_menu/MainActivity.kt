package com.example.a03_linearlayout_login_menu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.a03_linearlayout_login_menu.databinding.ActivityMainBinding

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

                Toast.makeText(applicationContext, "VALID LOGIN!", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(applicationContext, "OUPSIE, INVALID LOGIN!", Toast.LENGTH_SHORT).show()
            }
        }

    }
}