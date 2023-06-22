package com.example.musicplayer

import android.media.MediaPlayer
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
//import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var play_btn: ImageButton = findViewById<ImageButton>(R.id.play_btn)

        val mediaplayer = MediaPlayer.create(this, R.raw.music)

        play_btn.setOnClickListener {

            if (mediaplayer.isPlaying){
                mediaplayer.start()
                play_btn.setImageResource(R.drawable.baseline_pause_24)
            }else{
                mediaplayer.pause()
                play_btn.setImageResource(R.drawable.baseline_play_arrow_24)
            }
        }
    }
}