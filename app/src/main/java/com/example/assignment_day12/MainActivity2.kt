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

        val callbtn = findViewById<Button>(R.id.CallButton)
        callbtn.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.setData(Uri.parse("tel:123456789"))
            startActivity(intent)
        }

        val card1 = findViewById<CardView>(R.id.AppDev)
        val card2= findViewById<CardView>(R.id.ML)
        val card3 = findViewById<CardView>(R.id.Cyber)
        val card4 = findViewById<CardView>(R.id.Block)
        val card5 = findViewById<CardView>(R.id.Web3)
        val card6 = findViewById<CardView>(R.id.WebDev)

        card1.setOnClickListener {
            val intent1 = Intent(applicationContext,AndroidDevelopment::class.java)
            startActivity(intent1)
        }

        card2.setOnClickListener {
            val intent2= Intent(applicationContext,MachineLearning::class.java)
            startActivity(intent2)
        }

        card3.setOnClickListener {
            val intent3 = Intent(applicationContext,CyberSecurity::class.java)
            startActivity(intent3)
        }

        card4.setOnClickListener {
            val intent4 = Intent(applicationContext,blockChain::class.java)
            startActivity(intent4)
        }

        card5.setOnClickListener {
            val intent5 = Intent(applicationContext,Web3::class.java)
            startActivity(intent5)
        }

        card6.setOnClickListener {
            val intent6 = Intent(applicationContext,WebDev::class.java)
            startActivity(intent6)
        }

    }
}