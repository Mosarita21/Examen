package com.example.examenolivaroque.adapter
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.examenolivaroque.R
import com.example.examenolivaroque.SuperAnimal

class SuperAnimalAdapter (private val superanimalList:List<SuperAnimal>):RecyclerView.Adapter<SuperAnimalViewHolder>  () {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperAnimalViewHolder {
        val layoutInflater=LayoutInflater.from(parent.context)
        return SuperAnimalViewHolder(layoutInflater.inflate(R.layout.item_superanimal,parent,false))
    }

    override fun onBindViewHolder(holder: SuperAnimalViewHolder, position: Int) {
      val item=superanimalList[position]
        holder.render(item)

    }

    override fun getItemCount(): Int=superanimalList.size

}



