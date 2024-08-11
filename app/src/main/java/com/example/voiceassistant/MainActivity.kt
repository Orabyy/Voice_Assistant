package com.example.voiceassistant

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val profileBtn = findViewById<Button>(R.id.btnProfile)
        val balanceBtn = findViewById<Button>(R.id.btnBalance)

        profileBtn.setOnClickListener{
            startActivity(Intent(this, Profile::class.java))
        }
        balanceBtn.setOnClickListener{
            startActivity(Intent(this, Balance::class.java))
        }
    }
}