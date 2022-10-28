package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log
import com.example.myapplication.Features.LOG
import com.example.myapplication.ViewModel.Preload

class MainActivity : AppCompatActivity() {

    var NameClass = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        LOG.Info(NameClass,"Inicio de la actividad")
        val intent = Intent(this, Preload::class.java)
        startActivity(intent)
        finish()
    }
}