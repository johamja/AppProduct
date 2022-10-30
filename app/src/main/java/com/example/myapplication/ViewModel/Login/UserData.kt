package com.example.myapplication.ViewModel.Login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.myapplication.R
import com.example.myapplication.ViewModel.Home.Home

class UserData : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_data)


        val next: Button = findViewById(R.id.UserData_9)
        next.setOnClickListener {
            val intent = Intent(this, Home::class.java);
            startActivity(intent)
            finish()
        }
    }
}