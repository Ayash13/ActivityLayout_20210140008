package com.example.cobakotlin

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var imageView: ImageView
    private lateinit var textView: TextView
    private lateinit var button: Button

    private var isImageChanged = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageView = findViewById(R.id.imageView)
        textView = findViewById(R.id.textView)
        button = findViewById(R.id.button)

        button.setOnClickListener {
            // Toggle the image and text when the button is clicked
            if (isImageChanged) {
                imageView.setImageResource(R.drawable.gambar1)
                textView.text = "Gambar 1"
            } else {
                imageView.setImageResource(R.drawable.gambar2) // Replace with the new image resource
                textView.text = "Gambar 2"
            }

            // Toggle the flag to track the state
            isImageChanged = !isImageChanged
        }
    }
}
