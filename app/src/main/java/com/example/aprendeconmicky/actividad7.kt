package com.example.aprendeconmicky

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class actividad7 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actividad7)

        val f16= findViewById<ImageView>(R.id.f16)
        f16.setOnClickListener {
            val lanzar = Intent(this, fallaste::class.java)
            startActivity(lanzar)
        }

        val f17 = findViewById<ImageView>(R.id.f17)
        f17.setOnClickListener {
            val lanzar = Intent(this, fallaste::class.java)
            startActivity(lanzar)
        }

        val dos = findViewById<ImageView>(R.id.dos)
        dos.setOnClickListener {
            val lanzar = Intent(this, felicitaciones::class.java)
            startActivity(lanzar)
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        val lanzar = Intent(this, MainActivity::class.java)
        startActivity(lanzar)
    }
}
