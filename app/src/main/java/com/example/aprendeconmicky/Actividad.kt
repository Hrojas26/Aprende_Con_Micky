package com.example.aprendeconmicky

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.media.MediaPlayer

class Actividad : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actividad)

        val botonnueve = findViewById<ImageButton>(R.id.boton9)
        botonnueve.setOnClickListener {
            val lanzar = Intent(this, actividad2::class.java)
            startActivity(lanzar)
            val mp = MediaPlayer.create(this, R.raw.nice22)
            mp.start()
        }

        val falla1 = findViewById<ImageView>(R.id.F1)
        falla1.setOnClickListener {
            val lanzar = Intent(this, fallaste::class.java)
            startActivity(lanzar)
        }

        val falla2 = findViewById<ImageView>(R.id.F2)
        falla2.setOnClickListener {
            val lanzar = Intent(this, fallaste::class.java)
            startActivity(lanzar)
        }
    }
    override fun onBackPressed() {
        super.onBackPressed()
        val lanzar = Intent(this, video::class.java)
        startActivity(lanzar)
    }
}
