package com.example.myapplication.ViewModel.Categories

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.Model.Categories
import com.example.myapplication.R
import com.example.myapplication.ViewModel.Categories.Adapter.VMCategoriesAdapter

class VMCategories : AppCompatActivity() {


    val ListCategories = listOf<Categories>(
        Categories("Favoritos","descripcion", Color.valueOf(12F, 12F, 12F),12),
        Categories("Midia","descripcion", Color.valueOf(12F, 12F, 12F),12),
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_categories)
        initRecyclerView()
    }

    private fun initRecyclerView(){
        var recyclerView = findViewById<RecyclerView>(R.id.VMCategories_RecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = VMCategoriesAdapter(ListCategories)
    }
}