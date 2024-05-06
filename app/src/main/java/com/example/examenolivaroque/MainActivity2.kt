package com.example.examenolivaroque

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.examenolivaroque.adapter.SuperAnimalAdapter


class MainActivity2 : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        initRecyclerView()
    }

    fun initRecyclerView(){
        val recyclerView=findViewById<RecyclerView>(R.id.recyclerSuperAnimal)
        recyclerView.layoutManager=LinearLayoutManager(this)
        recyclerView.adapter=SuperAnimalAdapter(SuperHeroAnimal.superheroList)
    }

    fun Regresar(view: View) {
        val intent: Intent = Intent(this@MainActivity2, MainActivity5::class.java)
        startActivity(intent)
    }

   }
