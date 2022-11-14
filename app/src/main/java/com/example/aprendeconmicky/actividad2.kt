package com.example.aprendeconmicky

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView

class actividad2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actividad2)



        val fx3= findViewById<ImageView>(R.id.f3)
        fx3.setOnClickListener {
            val lanzar = Intent(this, fallaste::class.java)
            startActivity(lanzar)
        }

        val fx4 = findViewById<ImageView>(R.id.f4)
        fx4.setOnClickListener {
            val lanzar = Intent(this, fallaste::class.java)
            startActivity(lanzar)
        }

        val fx5 = findViewById<ImageView>(R.id.f5)
        fx5.setOnClickListener {
            val lanzar = Intent(this, fallaste::class.java)
            startActivity(lanzar)
        }
        val cuatrox = findViewById<ImageView>(R.id.cuatro)
        cuatrox.setOnClickListener {
            val lanzar = Intent(this, actividad3::class.java)
            startActivity(lanzar)
            val mp = MediaPlayer.create(this, R.raw.nice22)
            mp.start()
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        val lanzar = Intent(this, MainActivity::class.java)
        startActivity(lanzar)
    }

}

