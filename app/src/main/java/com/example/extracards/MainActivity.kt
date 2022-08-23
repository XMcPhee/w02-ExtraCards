package com.example.extracards

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val card = Card("ACE", "HEARTS", false)
        val button = findViewById<Button>(R.id.button)
        val textView = findViewById<TextView>(R.id.textView)
        textView.text = card.printDetail()

        button.setOnClickListener {
            card.Flip()
            textView.text = card.printDetail()
        }

    }
}