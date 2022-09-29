package com.example.aprendeconmicky

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botoninicio=findViewById<Button>(R.id.boton1)
        botoninicio.setOnClickListener {
            val lanzar = Intent(this, aprenderNumeros::class.java)
            startActivity(lanzar)
        }



    }
}