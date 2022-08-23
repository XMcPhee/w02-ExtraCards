package com.example.extracards

class Card(var rank: String, var suit: String, var flip: Boolean = true) {

    fun Flip(){
        flip = !flip
    }

    fun printDetail(): String{
        return when (flip){
            true -> ("$rank $suit")
            else -> ("------")
        }
    }
}