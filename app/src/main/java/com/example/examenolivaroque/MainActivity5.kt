package com.example.examenolivaroque

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.MediaController
import android.widget.Toast
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity

class MainActivity5 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main5)


        val videoView = findViewById<VideoView>(R.id.videoView)
        val videoPath = "android.resource://$packageName/${R.raw.cuidadomascotas}"
        val uri = Uri.parse(videoPath)
        videoView.setVideoURI(uri)

        val mediaController = MediaController(this)
        mediaController.setAnchorView(videoView)
        videoView.setMediaController(mediaController)

        videoView.setOnPreparedListener { mp ->
            // El video está listo para ser reproducido
        }

        videoView.setOnCompletionListener { mp ->
            // El video ha terminado de reproducirse
        }

        videoView.start()
    }


fun Listas(view: View) {
    val intent: Intent = Intent(this@MainActivity5, MainActivity2::class.java)
    startActivity(intent)
}

    fun Mensaje(view: View) {
        Toast.makeText(this@MainActivity5, "Cuida a tu mascota, nunca sabes cuando ya no este", Toast.LENGTH_SHORT).show()
    }


    fun Salir(view:View){
        finishAffinity()
    }
}