package com.example.aprendeconmicky

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class actividad5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actividad5)


        val f12 = findViewById<ImageView>(R.id.f12)
        f12.setOnClickListener {
            val lanzar = Intent(this, fallaste::class.java)
            startActivity(lanzar)
        }

        val f13 = findViewById<ImageView>(R.id.f13)
        f13.setOnClickListener {
            val lanzar = Intent(this, fallaste::class.java)
            startActivity(lanzar)
        }

        val ocho = findViewById<ImageView>(R.id.ocho)
        ocho.setOnClickListener {
            val lanzar = Intent(this, actividad6::class.java)
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
