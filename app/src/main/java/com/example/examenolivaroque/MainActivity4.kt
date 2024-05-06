package com.example.examenolivaroque

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity4 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main4)


        val nombre = intent.getStringExtra(EXTRA_NOMBRE)
        val telefono = intent.getStringExtra(EXTRA_TELEFONO)
        val direccion = intent.getStringExtra(EXTRA_DIRECCION)
        val favorito = intent.getStringExtra(EXTRA_FAVORITO)

        val tvNombre = findViewById<TextView>(R.id.tvNombre1).apply {
            text = nombre
        }

        val tvTelefono = findViewById<TextView>(R.id.tvTelefono1).apply {
            text = telefono
        }

        val tvDireccion = findViewById<TextView>(R.id.tvDireccion1).apply {
            text = direccion
        }

        val tvFavorito = findViewById<TextView>(R.id.tvFavorito1).apply {
            text = favorito
        }
    }

fun sendMessage(view: View) {
        val intent: Intent = Intent(this@MainActivity4, MainActivity3::class.java)
        startActivity(intent)
    }

    fun Continuar(view:View){

        val intent: Intent = Intent(this@MainActivity4, MainActivity5::class.java)
        startActivity(intent)
        Toast.makeText(this@MainActivity4, "Guardado", Toast.LENGTH_SHORT).show()

        }



}
