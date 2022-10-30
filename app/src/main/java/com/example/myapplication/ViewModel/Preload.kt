package com.example.myapplication.ViewModel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log
import com.example.myapplication.Features.LOG
import com.example.myapplication.R
import com.example.myapplication.ViewModel.Home.Home
import com.example.myapplication.ViewModel.Login.Login

class Preload : AppCompatActivity() {

    var NameClass = "Preload"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_preload)
        LOG.Info(NameClass,"Inicio de la actividad")
        Handler().postDelayed(Runnable {
            kotlin.run {
                val intent = Intent(this, Login::class.java)
                startActivity(intent)
                finish()
            }
        },1000)

    }
}