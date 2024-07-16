package com.free.downloadmanager

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.free.downloadmanager.databinding.ActivityMainBinding
import com.free.downloadmanager.service.AndroidDownloader

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val downloader = AndroidDownloader(this)
        //downloader.downloadFile("https://avatars.githubusercontent.com/u/134888799?s=400&u=8647f2236934fc8befde1466486023b4b20c810b&v=4")

        binding.btnDownload.setOnClickListener {
            val url = binding.etLink.text.toString()
            downloader.downloadFile(url)
        }

    }
}