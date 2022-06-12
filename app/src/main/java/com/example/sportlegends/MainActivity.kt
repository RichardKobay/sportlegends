package com.example.sportlegends

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    @SuppressLint("CutPasteId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val activityMessi = findViewById<Button>(R.id.btnMessi)
        val activityKobe = findViewById<Button>(R.id.btnKobe)
        val activityCheco = findViewById<Button>(R.id.btnCheco)

        activityMessi.setOnClickListener {
            val changeMessi = Intent(this, messi::class.java)
            startActivity(changeMessi)
        }

        activityKobe.setOnClickListener {
            val changekobe = Intent(this, kobe::class.java)
            startActivity(changekobe)
        }

        activityCheco.setOnClickListener {
            val changeCheco = Intent(this, checo::class.java)
            startActivity(changeCheco)
        }
    }
}