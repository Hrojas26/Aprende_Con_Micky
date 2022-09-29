package com.example.aprendeconmicky

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class felicitaciones : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_felicitaciones)

        val botonnew = findViewById<ImageButton>(R.id.botonjugarnew)
        botonnew.setOnClickListener {
            val lanzar = Intent(this, Actividad::class.java)
            startActivity(lanzar)
        }
    }
}