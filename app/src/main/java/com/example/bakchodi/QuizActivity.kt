package com.example.bakchodi

import android.content.Intent
import android.graphics.Color
import android.media.MediaPlayer
import android.os.*
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class QuizActivity : AppCompatActivity() {

    private lateinit var questions: List<Questions>
    private var currentIndex = 0
    private var score = 0
    private lateinit var timer: CountDownTimer
    private var mediaPlayer: MediaPlayer? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.quiz_layout)

        questions = QuestionRepository.getQuestions()

        findViewById<Button>(R.id.submitBtn).setOnClickListener {
            checkAnswer()
        }

        loadQuestion()
    }

    private fun loadQuestion() {

        if (currentIndex >= questions.size) {
            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra("score", score)
            intent.putExtra("total", questions.size)
            startActivity(intent)
            finish()
            return
        }

        val q = questions[currentIndex]

        findViewById<TextView>(R.id.questionCount).text =
            "Question ${currentIndex + 1}/${questions.size}"

        findViewById<ProgressBar>(R.id.progressBar).apply {
            max = questions.size
            progress = currentIndex + 1
        }

        findViewById<TextView>(R.id.questionText).text = q.question

        val group = findViewById<RadioGroup>(R.id.optionsGroup)
        group.clearCheck()

        val options = listOf(
            findViewById<RadioButton>(R.id.opt1),
            findViewById<RadioButton>(R.id.opt2),
            findViewById<RadioButton>(R.id.opt3),
            findViewById<RadioButton>(R.id.opt4)
        )

        for (i in options.indices) {
            options[i].text = q.options[i]
            // Reset background to the custom KBC drawable
            options[i].setBackgroundResource(R.drawable.kbc_option_bg)
            options[i].setTextColor(Color.WHITE)
        }

        startTimer()
    }

    private fun startTimer() {
        if (::timer.isInitialized) timer.cancel()
        
        // Stop previous audio if playing
        stopAudio()
        
        // Start playing timer audio and get its duration
        val audioDuration = playAudio(R.raw.timer_sound).toLong()
        
        // If duration is 0 (file not found or error), default to 10 seconds
        val timerDuration = if (audioDuration > 0) audioDuration else 10000L

        timer = object : CountDownTimer(timerDuration, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                findViewById<TextView>(R.id.timer).text = (millisUntilFinished / 1000).toString()
            }

            override fun onFinish() {
                checkAnswer()
            }
        }.start()
    }

    private fun playAudio(audioResId: Int): Int {
        var duration = 0
        try {
            mediaPlayer = MediaPlayer.create(this, audioResId)
            duration = mediaPlayer?.duration ?: 0
            mediaPlayer?.start()
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return duration
    }

    private fun stopAudio() {
        mediaPlayer?.stop()
        mediaPlayer?.release()
        mediaPlayer = null
    }

    private fun checkAnswer() {
        timer.cancel()
        stopAudio() // Stop timer sound

        val group = findViewById<RadioGroup>(R.id.optionsGroup)
        val selectedId = group.checkedRadioButtonId
        val correctIndex = questions[currentIndex].correctAnswer

        val options = listOf(
            findViewById<RadioButton>(R.id.opt1),
            findViewById<RadioButton>(R.id.opt2),
            findViewById<RadioButton>(R.id.opt3),
            findViewById<RadioButton>(R.id.opt4)
        )

        // Highlight correct answer in Green (KBC Style)
        options[correctIndex].setBackgroundColor(Color.GREEN)
        options[correctIndex].setTextColor(Color.BLACK)

        if (selectedId != -1) {
            val selectedIndex = group.indexOfChild(findViewById(selectedId))
            if (selectedIndex == correctIndex) {
                score++
                playAudio(R.raw.correct_sound) 
            } else {
                // Highlight wrong answer in Red
                options[selectedIndex].setBackgroundColor(Color.RED)
                options[selectedIndex].setTextColor(Color.WHITE)
                playAudio(R.raw.wrong_sound)
            }
        }

        Handler(Looper.getMainLooper()).postDelayed({
            currentIndex++
            loadQuestion()
        }, 1500)
    }

    override fun onDestroy() {
        super.onDestroy()
        stopAudio()
    }
}
