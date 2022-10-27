package com.example.aprendeconmicky

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class aprenderNumeros : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aprender_numeros)

        val botonaprendernumeros = findViewById<ImageButton>(R.id.botonnumeros)
        botonaprendernumeros.setOnClickListener {
            val lanzar = Intent(this, video::class.java)
            startActivity(lanzar)
        }
    }
}