package com.example.aprendeconmicky

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView

class fallaste : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fallaste)

        val botonvolver = findViewById<ImageView>(R.id.volveraintentar)
        botonvolver.setOnClickListener {
            val lanzar = Intent(this, Actividad::class.java)
            startActivity(lanzar)
        }
        val botonvolver2 = findViewById<ImageView>(R.id.volveraintentar2)
        botonvolver2.setOnClickListener {
            val lanzar = Intent(this, video::class.java)
            startActivity(lanzar)
        }
    }
    override fun onBackPressed() {
        super.onBackPressed()
        val lanzar = Intent(this, Actividad::class.java)
        startActivity(lanzar)
    }
}