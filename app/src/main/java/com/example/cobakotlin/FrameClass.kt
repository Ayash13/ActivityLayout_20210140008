package com.example.cobakotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.ViewFlipper

class FrameClass : AppCompatActivity() {

    private lateinit var imageFlipper: ViewFlipper
    private lateinit var imageTitle: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.framelayout)

        imageFlipper = findViewById(R.id.imageFlipper)
        imageTitle = findViewById(R.id.imageTitle)

        val arrowLeft = findViewById<ImageView>(R.id.arrowLeft)
        val arrowRight = findViewById<ImageView>(R.id.arrowRight)

        arrowLeft.setOnClickListener {
            imageFlipper.showPrevious()
            updateImageTitle()
        }

        arrowRight.setOnClickListener {
            imageFlipper.showNext()
            updateImageTitle()
        }

        // Initial image title
        updateImageTitle()
    }

    private fun updateImageTitle() {
        val currentIndex = imageFlipper.indexOfChild(imageFlipper.currentView)
        val titles = listOf("Gambar1", "Gambar2") // Add more titles if needed
        if (currentIndex >= 0 && currentIndex < titles.size) {
            imageTitle.text = titles[currentIndex]
        }
    }
}
