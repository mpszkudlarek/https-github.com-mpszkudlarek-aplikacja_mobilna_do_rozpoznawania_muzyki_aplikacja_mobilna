package com.example.mobilki

import android.os.Bundle
import android.os.CountDownTimer
import android.os.Handler
import android.os.Looper
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.mobilnesystemy.R

class RecognizeActivity : AppCompatActivity() {
    private lateinit var numberDisplay: TextView
    private lateinit var holdText: TextView
    private var number = 1
    private val handler = Handler(Looper.getMainLooper())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.recognize_page)

        numberDisplay = findViewById(R.id.number_display)
        holdText = findViewById(R.id.hold_text)

        updateNumber()
        setupHoldText()
    }

    private fun updateNumber() {
        val runnable = object : Runnable {
            override fun run() {
                if (number <= 10) {
                    numberDisplay.text = number.toString()
                    number++
                    handler.postDelayed(this, 1000) // Updates every second
                }
            }
        }
        handler.post(runnable)
    }

    private fun setupHoldText() {
        holdText.setOnLongClickListener {
            object : CountDownTimer(10000, 1000) {
                override fun onTick(millisUntilFinished: Long) {
                    holdText.text = "Hold for ${millisUntilFinished / 1000} s"
                }

                override fun onFinish() {
                    holdText.text = "Hold complete"
                }
            }.start()
            true
        }
    }
}