package com.example.aprendeconmicky

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class actividad6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actividad6)

        val f14= findViewById<ImageView>(R.id.f14)
        f14.setOnClickListener {
            val lanzar = Intent(this, fallaste::class.java)
            startActivity(lanzar)
        }

        val f15 = findViewById<ImageView>(R.id.f15)
        f15.setOnClickListener {
            val lanzar = Intent(this, fallaste::class.java)
            startActivity(lanzar)
        }

        val cinco = findViewById<ImageView>(R.id.cinco)
        cinco.setOnClickListener {
            val lanzar = Intent(this, actividad7::class.java)
            startActivity(lanzar)
        }

    }

    override fun onBackPressed() {
        super.onBackPressed()
        val lanzar = Intent(this, MainActivity::class.java)
        startActivity(lanzar)
    }
}
