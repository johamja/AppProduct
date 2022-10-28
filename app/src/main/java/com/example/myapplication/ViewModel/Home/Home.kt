package com.example.myapplication.ViewModel.Home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.Features.LOG
import com.example.myapplication.R

class Home : AppCompatActivity() {

    var NameClass = "Home"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        LOG.Info(NameClass,"Inicio de la actividad")
    }
}