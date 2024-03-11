package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val userNameEt = findViewById<EditText>(R.id.et_name)
        val startButton = findViewById<Button>(R.id.startBtn)

        startButton.setOnClickListener(View.OnClickListener {
            val userName = userNameEt.text.toString().trim()
            if (userName.isNotEmpty()) {
                val intent = Intent(this@MainActivity, GameActivity::class.java)
                intent.putExtra("user", userName)
                startActivity(intent)
            } else {
                Toast.makeText(this@MainActivity, "Please Enter Username", Toast.LENGTH_SHORT).show()
            }
        })
    }
}