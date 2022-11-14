package com.example.aprendeconmicky

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class actividad3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actividad3)

        val f6= findViewById<ImageView>(R.id.f6)
        f6.setOnClickListener {
            val lanzar = Intent(this, fallaste::class.java)
            startActivity(lanzar)
        }

        val f7 = findViewById<ImageView>(R.id.f7)
        f7.setOnClickListener {
            val lanzar = Intent(this, fallaste::class.java)
            startActivity(lanzar)
        }

        val seis = findViewById<ImageView>(R.id.seis)
        seis.setOnClickListener {
            val lanzar = Intent(this, actividad4::class.java)
            startActivity(lanzar)

        }
    }
    override fun onBackPressed() {
        super.onBackPressed()
        val lanzar = Intent(this, MainActivity::class.java)
        startActivity(lanzar)
    }
}
