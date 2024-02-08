package com.example.lab8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rButton: Button = findViewById(R.id.red_button)
        val yButton: Button = findViewById(R.id.button_yellow)
        val gButton: Button = findViewById(R.id.button_green)
        val textView: TextView = findViewById(R.id.textView)
        val rLayout:ConstraintLayout = findViewById(R.id.root_layout)
        val button30: Button = findViewById(R.id.button_30)
        val button40: Button = findViewById(R.id.button_40)

        rButton.setOnClickListener{
            textView.text = "Красный"
            rLayout.setBackgroundColor(resources.getColor(R.color.redColor, null))
        }
        yButton.setOnClickListener{
            textView.text = "Жёлтый"
            rLayout.setBackgroundColor(resources.getColor(R.color.yellowColor, null))
        }
        gButton.setOnClickListener{
            textView.text = "Зелёный"
            rLayout.setBackgroundColor(resources.getColor(R.color.greenColor, null))
        }
        button30.setOnClickListener{
            textView.textSize = 30F
        }
        button40.setOnClickListener{
            textView.textSize = 40F
        }
    }
}