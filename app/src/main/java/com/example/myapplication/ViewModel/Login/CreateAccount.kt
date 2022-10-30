package com.example.myapplication.ViewModel.Login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.myapplication.R

class CreateAccount : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_account)

        val button: Button = findViewById(R.id.CreateAccount_6)
        button.setOnClickListener {
            val intent = Intent(this, CreateAccount::class.java);
            startActivity(intent)
            finish()
        }

    }
}