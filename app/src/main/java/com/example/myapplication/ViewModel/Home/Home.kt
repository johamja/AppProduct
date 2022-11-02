package com.example.myapplication.ViewModel.Home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.myapplication.Features.LOG
import com.example.myapplication.R
import com.example.myapplication.ViewModel.Categories.VMCategories
import com.example.myapplication.ViewModel.Login.UserData

class Home : AppCompatActivity() {

    var NameClass = "Home"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        LOG.Info(NameClass,"Inicio de la actividad")

        findViewById<Button>(R.id.ActivityHome_categorias).setOnClickListener{
            val intent = Intent(this, VMCategories::class.java);
            startActivity(intent)
        }
    }
}