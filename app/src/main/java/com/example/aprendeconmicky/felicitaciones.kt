package com.example.aprendeconmicky

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView

class felicitaciones : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_felicitaciones)


        val denuevo = findViewById<ImageView>(R.id.denuevo)
        denuevo.setOnClickListener {
            val lanzar = Intent(this, aprenderNumeros::class.java)
            startActivity(lanzar)
            }
        }
    override fun onBackPressed() {
        super.onBackPressed()
        val lanzar = Intent(this, MainActivity::class.java)
        startActivity(lanzar)
    }
    }