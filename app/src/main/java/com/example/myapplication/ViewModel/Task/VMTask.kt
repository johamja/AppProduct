package com.example.myapplication.ViewModel.Task

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.Model.Categories
import com.example.myapplication.R

class VMTask (viewcategory : Categories) : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_task)
    }

}