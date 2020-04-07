package com.example.flip_button

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val output_view = findViewById<TextView>(R.id.output_view)
        val high_button = findViewById<Button>(R.id.high_button)
        val low_button = findViewById<Button>(R.id.low_button)

        high_button.setOnClickListener{
            output_view.text = "1"
        }

        low_button.setOnClickListener{
            output_view.text = "0"
        }
    }
}
