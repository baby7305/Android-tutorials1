package com.example.myapplication

import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button: Button = findViewById(R.id.button)
        val imageView: ImageView = findViewById(R.id.imageView)
        button.setOnClickListener {
            imageView.setImageResource(R.drawable.img_2)
        }
    }
}