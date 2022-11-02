package com.example.myapplication.ViewModel.Categories.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.Model.Categories
import com.example.myapplication.R

class VMCategoriesAdapter(private val CategoriesList: List<Categories>) :
    RecyclerView.Adapter<VMCategoriesViewHolder>() {

    /**
     * esta funcion devuelve al view holder el item el layout que va poder modificar
     * */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VMCategoriesViewHolder {
        val layoutItemCategorie = LayoutInflater.from(parent.context)
        return VMCategoriesViewHolder(
            layoutItemCategorie.inflate(
                R.layout.item_category,
                parent,
                false
            )
        )
    }

    /**
     *
     * @return pasa por cada uno de los items y llama al  VMCategoriesViewHolder
     * */
    override fun onBindViewHolder(holder: VMCategoriesViewHolder, position: Int) {
        val item = CategoriesList[position]
        holder.render(item)
    }

    /**
     * @return devolver el tamaño de la lista
     * */
    override fun getItemCount(): Int {
        return CategoriesList.size
    }
}