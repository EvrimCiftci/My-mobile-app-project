package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class ScoreActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_score)

        val username = intent.getStringExtra("name").toString()
        val score = intent.getIntExtra("score", 0)

        val displayResult = findViewById<TextView>(R.id.displayResult)
        val playAgain = findViewById<Button>(R.id.playAgain)

        displayResult.text = "${username}! you have scored ${score} points out of 10"

        playAgain.setOnClickListener{
            startActivity(Intent(this@ScoreActivity, MainActivity::class.java))
            finishAffinity()
        }

    }
}