package com.example.przemprimenumbers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val _editText = findViewById<EditText>(R.id.editText)

        fun isPrime(number: Int): Boolean{
            val maxDivider = Math.sqrt(number.toDouble())
            for (i in 2..maxDivider.toInt()){
                if(number % i == 0){
                    return false
                }
            }
            return true
        }

        val button = findViewById<Button>(R.id.button)
        val text = findViewById<TextView>(R.id.texView)
        val prime: MutableList<Int> = mutableListOf()
        var counter: Int = 0

        var czas: Int = 0

        button.setOnClickListener(){
            val start = System.currentTimeMillis()
            text.text = ""
            try {
                for (i in 2.._editText.text.toString().toInt()){
                    if (isPrime(i)){
                        prime.add(i)
                        counter++
                    }
                }
                val stop = System.currentTimeMillis()
                czas = (stop - start).toInt()
                text.text = "number of primes in such range is $counter\nprogram lasted for $czas miliseconds\n"

                var licznik = 0

                for (i in prime){
                    licznik++
                    text.append(i.toString())
                    text.append("   ")
                    if (licznik % 6 == 0) {
                        text.append("\n")
                    }
                }
            } catch (e:Exception){
                text.text = e.toString()
            }
        }
    }
}