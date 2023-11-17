package com.example.tetris

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.ProgressBar

class MainActivity : AppCompatActivity() {
    private val SPLASH_DELAY: Long = 2000 // Задержка в 3 секунды

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Показать ProgressBar
        val progressBar = findViewById<ProgressBar>(R.id.progressBar)
        progressBar.visibility = View.VISIBLE

        // Имитация задержки и перехода на другую активность
        Handler().postDelayed({
            // Скрыть ProgressBar
            progressBar.visibility = View.GONE

            // Переход к другой активности
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
            finish()
        }, SPLASH_DELAY)
    }
}
