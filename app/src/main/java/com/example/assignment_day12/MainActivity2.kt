package com.example.assignment_day12

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.cardview.widget.CardView

class MainActivity2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val callback = findViewById<Button>(R.id.button)
        callback.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.setData(Uri.parse("tel:123456789"))
          startActivity(intent)
        }


        val card1 = findViewById<CardView>(R.id.App)
        val card2 = findViewById<CardView>(R.id.Web)
        val card3 = findViewById<CardView>(R.id.Block)
        val card4 = findViewById<CardView>(R.id.cyber)
        val card5 = findViewById<CardView>(R.id.ML)
        val card6 = findViewById<CardView>(R.id.web3)


        card1.setOnClickListener {
            val intent = Intent(applicationContext,AndroidDevelopment::class.java)
            startActivity(intent)
        }

        card6.setOnClickListener {
            val intent1 = Intent(applicationContext ,Web3::class.java)
            startActivity(intent1)
        }

        card5.setOnClickListener {
            val intent2 = Intent(applicationContext,MachineLearning::class.java)
            startActivity(intent2)
        }






    }
}