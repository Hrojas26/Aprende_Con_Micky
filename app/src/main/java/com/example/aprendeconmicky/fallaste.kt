package com.example.aprendeconmicky

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class fallaste : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fallaste)

        val botonvolver = findViewById<ImageButton>(R.id.volver)
        botonvolver.setOnClickListener {
            val lanzar = Intent(this, Actividad::class.java)
            startActivity(lanzar)

            val botonvolvervideo = findViewById<ImageButton>(R.id.volvervideo)
            botonvolvervideo.setOnClickListener {
                val lanzar = Intent(this, video::class.java)
                startActivity(lanzar)
            }
        }
    }
}