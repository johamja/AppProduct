package com.example.myapplication.ViewModel.Categories

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.Model.Categories
import com.example.myapplication.R
import com.example.myapplication.ViewModel.Categories.Adapter.VMCategoriesAdapter
import com.example.myapplication.ViewModel.Login.CreateAccount
import com.google.android.material.floatingactionbutton.FloatingActionButton

class VMCategories : AppCompatActivity() {


    val ListCategories = listOf<Categories>(
        Categories("Favoritos","descripcion", Color.valueOf(12F, 12F, 12F),1),
        Categories("Mi dia","descripcion", Color.valueOf(12F, 12F, 12F),2),
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_categories)
        initRecyclerView()

        findViewById<FloatingActionButton>(R.id.VMCategories_FloatingButton).setOnClickListener{
            val intent = Intent(this, VMAddCategories::class.java);
            startActivity(intent)
        }
    }

    private fun initRecyclerView(){
        var recyclerView = findViewById<RecyclerView>(R.id.VMCategories_RecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = VMCategoriesAdapter(ListCategories)
    }
}