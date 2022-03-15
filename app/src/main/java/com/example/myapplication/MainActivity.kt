package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button: Button = findViewById(R.id.button)
        val editText: EditText = findViewById(R.id.editText)
        button.setOnClickListener {
            val inputText = editText.text.toString()
            Toast.makeText(this, inputText, Toast.LENGTH_SHORT).show()
        }
    }
}