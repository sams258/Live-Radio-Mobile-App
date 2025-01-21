package com.radio

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.media3.exoplayer.ExoPlayer
import androidx.media3.common.MediaItem
import com.radio.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var player: ExoPlayer
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Initialize ExoPlayer
        player = ExoPlayer.Builder(this).build()
        val mediaItem = MediaItem.fromUri("https://albal-lbnet2.radioca.st/stream?type=http&nocache=91")
        player.setMediaItem(mediaItem)
        Log.d("MainActivity", "Player initialized and media item set")

        // Play button click listener
        binding.playButton.setOnClickListener {
            Log.d("MainActivity", "Play button clicked")
            player.prepare()
            player.play()
            Log.d("MainActivity", "Player state after play: ${player.playbackState}")
        }

        // Stop button click listener
        binding.stopButton.setOnClickListener {
            Log.d("MainActivity", "Stop button clicked")
            player.stop()
            Log.d("MainActivity", "Player stopped")
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        player.release()
        Log.d("MainActivity", "Player released")
    }
}
