package com.example.aprendeconmicky

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class Actividad : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actividad)

        val botonnueve = findViewById<ImageButton>(R.id.boton9)
        botonnueve.setOnClickListener {
            val lanzar = Intent(this, felicitaciones::class.java)
            startActivity(lanzar)

            }
    }
}