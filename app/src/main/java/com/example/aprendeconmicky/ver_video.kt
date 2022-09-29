package com.example.aprendeconmicky

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class ver_video : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ver_video)

        val botonsiguiente = findViewById<ImageButton>(R.id.siguiente)
        botonsiguiente.setOnClickListener {
            val lanzar = Intent(this, Actividad::class.java)
            startActivity(lanzar)
        }
    }
}