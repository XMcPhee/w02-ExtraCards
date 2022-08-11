package com.example.extracards

class Card(var rank: String, var suit: String, var flip: Boolean = true) {

    fun Flip(){
        flip = !flip
    }

    fun printDetail(){
        when (flip){
            true -> println("$rank $suit")
            else -> println("------")
        }
    }
}