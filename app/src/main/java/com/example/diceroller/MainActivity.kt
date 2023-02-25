package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.diceroller.service.Dice

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)

        rollButton.setOnClickListener {
            Toast.makeText(this, "Both Dice Are Rolled!!", Toast.LENGTH_SHORT).show()
            Dice(6).roll(findViewById(R.id.textView),"1")
            Dice(6).roll(findViewById(R.id.textView2),"2")
        }
    }
}