package com.example.examenolivaroque.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.examenolivaroque.R
import com.example.examenolivaroque.SuperAnimal
import com.example.examenolivaroque.databinding.ItemSuperanimalBinding

class SuperAnimalViewHolder(view:View):RecyclerView.ViewHolder(view) {

    val superAnimal=view.findViewById<TextView>(R.id.tvSuperAnimalName)
    val comida=view.findViewById<TextView>(R.id.tvTipoComida)
    val nacimiento=view.findViewById<TextView>(R.id.tvTipoNacimiento)
    val photo=view.findViewById<ImageView>(R.id.ivSuperAnimal)

    fun render(superAnimalModel:SuperAnimal){
        superAnimal.text=superAnimalModel.Nombre
        comida.text=superAnimalModel.tipoComida
        nacimiento.text=superAnimalModel.tipoNacimiento
        Glide.with(photo.context).load(superAnimalModel.photo).into(photo)
    }
}