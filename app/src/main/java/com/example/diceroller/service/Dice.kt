package com.example.diceroller.service

import android.annotation.SuppressLint
import android.widget.TextView

class Dice(private val side:Int) {

    @SuppressLint("SetTextI18n")
    fun roll(textView:TextView, diceNumber:String){
        val result =  (1..side).random().toString()
        textView.text = "Dice $diceNumber : $result"
    }

}