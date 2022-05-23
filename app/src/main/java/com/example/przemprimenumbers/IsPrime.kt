package com.example.przemprimenumbers

import kotlin.math.sqrt

fun isPrime(number: Int): Boolean{
    val maxDivider = sqrt(number.toDouble())
    for (i in 2..maxDivider.toInt()){
        if(number % i == 0){
            return false
        }
    }
    return true
}