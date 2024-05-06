package com.example.examenolivaroque

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

const val EXTRA_NOMBRE = "com.example.examenolivaroque.NOMBRE"
const val EXTRA_TELEFONO = "com.example.examenolivaroque.TELEFONO"
const val EXTRA_DIRECCION = "com.example.examenolivaroque.DIRECCION"
const val EXTRA_FAVORITO = "com.example.examenolivaroque.FAVORITO"

class MainActivity3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
    }

    fun PasarDatos(view: View) {

        if (validarCampos()) {
            // Todos los campos están completos, procede con la acción de enviar
            // Aquí puedes colocar el código para enviar los datos, por ejemplo:

        val etNombre = findViewById<EditText>(R.id.etNombre)
        val nombre = etNombre.text.toString()

        val etTelefono = findViewById<EditText>(R.id.etTelefono)
        val telefono = etTelefono.text.toString()

        val etDireccion = findViewById<EditText>(R.id.etDireccion)
        val direccion = etDireccion.text.toString()

        val etFavorito = findViewById<EditText>(R.id.etFavorito)
        val favorito = etFavorito.text.toString()

        val intent = Intent(this, MainActivity4::class.java).apply {
            putExtra(EXTRA_NOMBRE, nombre)
            putExtra(EXTRA_TELEFONO, telefono)
            putExtra(EXTRA_DIRECCION, direccion)
            putExtra(EXTRA_FAVORITO, favorito)
        }
            startActivity(intent)
        }
   }
    private fun validarCampos(): Boolean {
        val Nombre: EditText = findViewById(R.id.etNombre)
        val Direccion: EditText = findViewById(R.id.etDireccion)
        val Telefono: EditText = findViewById(R.id.etTelefono)
        val Favorito: EditText = findViewById(R.id.etFavorito)

        val campo1 = Nombre.text.toString()
        val campo2 = Direccion.text.toString()
        val campo3 = Telefono.text.toString()
        val campo4 = Favorito.text.toString()

        if (campo1.isEmpty() || campo2.isEmpty() || campo3.isEmpty()|| campo4.isEmpty()) {
            // Al menos uno de los campos está vacío
            Toast.makeText(this, "Por favor, complete todos los campos", Toast.LENGTH_SHORT).show()
            return false
        }
        // Todos los campos están completos
        return true
    }
}
