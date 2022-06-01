package com.example.tsu_study_stam

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1 = findViewById<Button>(R.id.Continue_without_login)
        val button2 = findViewById<TextView>(R.id.textView3)
        button1.setOnClickListener{
            val intent = Intent(this, Continuewithoutlogin::class.java)
            startActivity(intent)
        }
        button2.setOnClickListener{
            val intent = Intent(this, registration::class.java)
            startActivity(intent)
        }
    }
}