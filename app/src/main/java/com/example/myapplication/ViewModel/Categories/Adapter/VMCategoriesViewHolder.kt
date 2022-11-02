package com.example.myapplication.ViewModel.Categories.Adapter

import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintSet.Layout
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.myapplication.Model.Categories
import com.example.myapplication.R
import com.example.myapplication.ViewModel.Categories.VMCategories

/**
 * es el ecargado de coger los ateibutos y pintarlos
 * */
class VMCategoriesViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    val name = view.findViewById<TextView>(R.id.ItemCategories_name)
    val description = view.findViewById<TextView>(R.id.ItemCategories_description)
    val themem = view.findViewById<ImageView>(R.id.ItemCategories_theme)
    val button = view.findViewById<Button>(R.id.ItemCategories_button)

    fun render(CategoriesModel: Categories) {
        name.text = CategoriesModel.name
        description.text = CategoriesModel.description

        // el evento de un click
        button.setOnClickListener {
            Toast.makeText(button.context, "hola", Toast.LENGTH_LONG).show()
        }

    }
}