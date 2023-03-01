package com.example.assignment_day12

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val clickBtn = findViewById<Button>(R.id.button)

        clickBtn.setOnClickListener {
            val intent = Intent(applicationContext,MainActivity2::class.java)
            startActivity(intent)
        }
    }
}