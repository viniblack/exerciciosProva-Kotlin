package com.example.exercicios

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class ex01 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ex01)

        val buma = findViewById<ImageView>(R.id.buma)
        val vegeta = findViewById<ImageView>(R.id.vegeta)
        val goku = findViewById<ImageView>(R.id.goku)
        val textView = findViewById<TextView>(R.id.textView)

        buma.setOnClickListener {
            textView.text = getString(R.string.buma)

        }

        vegeta.setOnClickListener {
            textView.text = getString(R.string.vegeta)
        }

        goku.setOnClickListener {
            textView.text = getString(R.string.goku)
        }
    }
}