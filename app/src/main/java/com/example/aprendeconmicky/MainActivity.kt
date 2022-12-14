package com.example.aprendeconmicky

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.media.MediaPlayer
import android.view.KeyEvent
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {


    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val boton1 = findViewById<ImageButton>(R.id.play)
        boton1.setOnClickListener {
            val mp = MediaPlayer.create(this, R.raw.bienvenidass)
            mp.start()
        }

        val botoninicio = findViewById<ImageButton>(R.id.botonlindo)
        botoninicio.setOnClickListener {
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




