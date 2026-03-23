package com.example.bakchodi

import android.graphics.Color
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val score = intent.getIntExtra("score", 0)
        val total = intent.getIntExtra("total", 0)
        val percentage = if (total > 0) (score * 100) / total else 0

        val scoreText = findViewById<TextView>(R.id.scoreText)
        val percentageText = findViewById<TextView>(R.id.percentageText)
        val performanceText = findViewById<TextView>(R.id.performanceText)
        val answersContainer = findViewById<LinearLayout>(R.id.answersContainer)

        // Set Score & Percentage
        scoreText.text = "Score: $score / $total"
        percentageText.text = "$percentage%"

        // Performance Message
        val message = when {
            percentage >= 80 -> "🔥 Excellent Performance!"
            percentage >= 60 -> "👍 Good Job!"
            percentage >= 40 -> "🙂 Average Performance"
            else -> "📚 Keep Practicing"
        }

        performanceText.text = message

        // Load Questions
        val questions = QuestionRepository.getQuestions()

        // Dynamically add correct answers
        for (i in questions.indices) {

            val q = questions[i]

            val answerView = TextView(this)
            answerView.textSize = 16f
            answerView.setTextColor(Color.WHITE)
            answerView.setPadding(0, 8, 0, 8)

            answerView.text =
                "Q${i + 1}: ${q.question}\n✔ Answer: ${q.options[q.correctAnswer]}"

            answersContainer.addView(answerView)
        }
    }
}
