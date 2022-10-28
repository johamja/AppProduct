package com.example.myapplication.ViewModel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log
import com.example.myapplication.R
import com.example.myapplication.ViewModel.Home.Home

class Preload : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_preload)

        Handler().postDelayed(Runnable {
            kotlin.run {
                val intent = Intent(this, Home::class.java)
                startActivity(intent)
            }
        },1000)

        Log.i("MainActivity","Lanzando layout")
    }
}