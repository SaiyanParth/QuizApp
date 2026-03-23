package com.example.bakchodi

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class instructions : AppCompatActivity() {
    private lateinit var nextbtn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.quiz_instructions)
        nextbtn = findViewById(R.id.nextbtn)

        nextbtn.setOnClickListener {
            startActivity(Intent(this@instructions, QuizActivity::class.java))
            finish()
        }
    }
}