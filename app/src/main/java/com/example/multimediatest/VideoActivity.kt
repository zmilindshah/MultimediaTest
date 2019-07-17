package com.example.multimediatest

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView

class VideoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video)
        val videoView: VideoView = findViewById(R.id.simpleVideoView)
        videoView.setVideoURI(Uri.parse("https://v.zmtcdn.com/showcase_Frappucino.mp4"))
        val mediaController = MediaController(this)
        videoView.setMediaController(mediaController)
        videoView.start()
    }
}
