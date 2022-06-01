package com.example.tsu_study_stam

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class registration : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.registration)

        val button3 = findViewById<ImageButton>(R.id.imageButton)
        button3.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)

            startActivity(intent)

        }

        findViewById<TextView>(R.id.textView2).text = intent.extras?.getString("name", "")

    }
}