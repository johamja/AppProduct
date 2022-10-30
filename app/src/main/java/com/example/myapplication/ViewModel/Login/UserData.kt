package com.example.myapplication.ViewModel.Login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.myapplication.R

class UserData : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_data)


        val next: Button = findViewById(R.id.)
        next.setOnClickListener {
            val intent = Intent(this, CreateAccount::class.java);
            startActivity(intent)
            finish()
        }
    }
}