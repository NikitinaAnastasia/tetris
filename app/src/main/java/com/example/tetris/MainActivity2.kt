package com.example.tetris

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


        val otherActivityButton: Button = findViewById(R.id.button4)
        val otheActivityButton: Button = findViewById(R.id.button3)

        otherActivityButton.setOnClickListener {
            val intent = Intent(this, settings::class.java)
            startActivity(intent)
        }


        otheActivityButton.setOnClickListener {
            val intent = Intent(this, info::class.java)
            startActivity(intent)
        }

    }
}