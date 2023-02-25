package com.example.diceroller.service

import android.annotation.SuppressLint
import android.widget.ImageView
import com.example.diceroller.R

class Dice() {

    fun roll(imgView:ImageView){
        when ((1..6).random()){
            1 ->  imgView.setImageResource(R.drawable.dice_1)
            2 ->  imgView.setImageResource(R.drawable.dice_2)
            3 ->  imgView.setImageResource(R.drawable.dice_3)
            4 ->  imgView.setImageResource(R.drawable.dice_4)
            5 ->  imgView.setImageResource(R.drawable.dice_5)
            6 ->  imgView.setImageResource(R.drawable.dice_6)
        }

    }

}