package com.example.myapplication.ViewModel.Categories.Adapter

import android.content.res.Resources
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.graphics.drawable.Drawable
import android.graphics.drawable.DrawableContainer
import android.provider.Settings.Global.getString
import android.text.style.BackgroundColorSpan
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintSet.Layout
import androidx.core.content.ContextCompat
import androidx.core.content.res.ResourcesCompat
import androidx.core.graphics.alpha
import androidx.core.graphics.blue
import androidx.core.graphics.green
import androidx.core.graphics.red
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.myapplication.Model.Categories
import com.example.myapplication.R
import com.example.myapplication.ViewModel.Categories.VMCategories
import kotlin.math.absoluteValue

/**
 * es el ecargado de coger los ateibutos y pintarlos
 * */
class VMCategoriesViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    val name = view.findViewById<TextView>(R.id.ItemCategories_name)
    val description = view.findViewById<TextView>(R.id.ItemCategories_description)
    val themem = view.findViewById<ImageView>(R.id.ItemCategories_theme)
    val button = view.findViewById<Button>(R.id.ItemCategories_button)

    fun render(CategoriesModel: Categories) {
        var color = 0
        when (CategoriesModel.color){
            1 -> color = ContextCompat.getColor(button.context, R.color.Theme_color_1)
            2 -> color = ContextCompat.getColor(button.context, R.color.Theme_color_2)
            3 -> color = ContextCompat.getColor(button.context, R.color.Theme_color_3)
            4 -> color = ContextCompat.getColor(button.context, R.color.Theme_color_4)
            else -> color = ContextCompat.getColor(button.context, R.color.Theme_color_1);
        }
        name.text = CategoriesModel.name
        description.text = CategoriesModel.description
        themem.background.setTint(color)

        // el evento de un click
        button.setOnClickListener {

        }

    }



}

