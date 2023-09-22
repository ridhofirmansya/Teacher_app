package com.example.teacher_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnNext: Button = findViewById(R.id.btnNext)

        btnNext.setOnClickListener {
            val intent = Intent(this@MainActivity, secondactivity::class.java)
            startActivity(intent)
        }

    }
}