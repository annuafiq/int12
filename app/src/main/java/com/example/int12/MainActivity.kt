package com.example.int12

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button1 = findViewById<Button>(R.id.Button)
        button1.setOnClickListener {
            val intent1 = Intent(this, profilsya::class.java)
            startActivity(intent1)
        }
        var button2 = findViewById<Button>(R.id.Button2)
        button2.setOnClickListener {
            val intent1 = Intent(this, sekolah::class.java)
            startActivity(intent1)
        }
    }
}