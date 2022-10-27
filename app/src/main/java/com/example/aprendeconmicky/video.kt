package com.example.aprendeconmicky

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.MediaController
import android.widget.Toast
import android.widget.VideoView

class video : AppCompatActivity() {



    var videoView: VideoView? = null

    var mediaController: MediaController? = null



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video)

        videoView = findViewById<View>(R.id.videoView) as VideoView?
        if (mediaController == null)
        {
            mediaController= MediaController(this )
            mediaController!!.setAnchorView(this.videoView)
        }
        videoView!!.setMediaController(mediaController)
        videoView!!.setVideoURI(Uri.parse("android.resource://" +packageName + "/" + R.raw.aprende))
        videoView!!.requestFocus()
        videoView!!.start()
        videoView!!.setOnCompletionListener {
            Toast.makeText(applicationContext, "Video End",Toast.LENGTH_LONG).show()
        }


        videoView!!.setOnErrorListener { mediaPlayer, i, i2 ->
             Toast.makeText(applicationContext,"Error Occured", Toast.LENGTH_LONG).show()
            false




        }

        val botonsiguiente = findViewById<ImageButton>(R.id.botonsito)
        botonsiguiente.setOnClickListener {
            val lanzar = Intent(this, Actividad::class.java)
            startActivity(lanzar)
        }
    }

}

