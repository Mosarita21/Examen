package com.example.examenolivaroque

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.util.Log


class MainActivity : AppCompatActivity() {
    private lateinit var btnCambio: Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnCambio = findViewById(R.id.btnCambio)

        btnCambio.setOnClickListener {
            PasarActivity()
        }

    }

    private fun PasarActivity() {

        val intent = Intent(this@MainActivity, MainActivity3::class.java)

    startActivity(intent)

    }
}
