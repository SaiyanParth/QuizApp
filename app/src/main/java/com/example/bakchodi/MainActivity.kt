package com.example.bakchodi

import android.content.Intent
import android.icu.text.SimpleDateFormat
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.util.Locale

class MainActivity : AppCompatActivity() {
    private lateinit var tvDays: TextView
    private lateinit var tvHours: TextView
    private lateinit var tvMinitues: TextView
    private lateinit var tvSecond: TextView
    private lateinit var tvCounterStatus: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvDays = findViewById(R.id.tvDays)
        tvHours = findViewById(R.id.tvHours)
        tvMinitues = findViewById(R.id.tvMinutes)
        tvSecond = findViewById(R.id.tvSeconds)
        tvCounterStatus = findViewById(R.id.tvCounterStatus)

        startCountdown()
    }
    private fun startCountdown() {

        try {

            // Target Date
            val targetDate = "16-03-2026 16:28:00"

            val format = SimpleDateFormat("dd-MM-yyyy HH:mm:ss", Locale.getDefault())

            val futureDate = format.parse(targetDate)

            val targetTime = futureDate!!.time
            val currentTime = System.currentTimeMillis()

            val difference = targetTime - currentTime

            if (difference <= 0) {
                tvCounterStatus.text = "Countdown Finished!"
                startActivity(Intent(this@MainActivity, instructions::class.java))
                finish()
                return
            }

            object : CountDownTimer(difference, 1000) {

                override fun onTick(millisUntilFinished: Long) {

                    val days = millisUntilFinished / (1000 * 60 * 60 * 24)
                    val hours = (millisUntilFinished / (1000 * 60 * 60)) % 24
                    val minutes = (millisUntilFinished / (1000 * 60)) % 60
                    val seconds = (millisUntilFinished / 1000) % 60

                    tvDays.text = String.format("%02d\nDays", days)
                    tvHours.text = String.format("%02d\nHours", hours)
                    tvMinitues.text = String.format("%02d\nMinutes", minutes)
                    tvSecond.text = String.format("%02d\nSeconds", seconds)
                }

                override fun onFinish() {

                    tvCounterStatus.text = "Countdown Finished!"

                    tvDays.text = "00\nDays"
                    tvHours.text = "00\nHours"
                    tvMinitues.text = "00\nMinutes"
                    tvSecond.text = "00\nSeconds"

                    //setContentView(R.layout.quiz_layout)

                    startActivity(Intent(this@MainActivity, instructions::class.java))
                    finish()
                }

            }.start()

        }
        catch (e: Exception)
        {
            e.printStackTrace()
        }
    }
}
