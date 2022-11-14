package com.example.aprendeconmicky

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class actividad4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actividad4)

        val f9= findViewById<ImageView>(R.id.f9)
        f9.setOnClickListener {
            val lanzar = Intent(this, fallaste::class.java)
            startActivity(lanzar)
        }

        val f10 = findViewById<ImageView>(R.id.f10)
        f10.setOnClickListener {
            val lanzar = Intent(this, fallaste::class.java)
            startActivity(lanzar)
        }

        val f11 = findViewById<ImageView>(R.id.f11)
        f11.setOnClickListener {
            val lanzar = Intent(this, fallaste::class.java)
            startActivity(lanzar)
        }
        val uno = findViewById<ImageView>(R.id.uno)
        uno.setOnClickListener {
            val lanzar = Intent(this, actividad5::class.java)
            startActivity(lanzar)
        }
    }
    override fun onBackPressed() {
        super.onBackPressed()
        val lanzar = Intent(this, MainActivity::class.java)
        startActivity(lanzar)
    }
}
