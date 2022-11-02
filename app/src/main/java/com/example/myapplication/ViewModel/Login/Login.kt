package com.example.myapplication.ViewModel.Login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.myapplication.R
import com.example.myapplication.ViewModel.Home.Home

class Login : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val login: Button = findViewById(R.id.Login_button_1)
        login.setOnClickListener {
           val intent = Intent(this, Home::class.java);
            startActivity(intent)
            finish()
        }

        val button: Button = findViewById(R.id.Login_button_2)
        button.setOnClickListener {
            val intent = Intent(this, CreateAccount::class.java);
            startActivity(intent)
            finish()
        }
    }
}