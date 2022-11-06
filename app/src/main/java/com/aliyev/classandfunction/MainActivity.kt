package com.aliyev.classandfunction

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Void - unit
        mySum(29, 372)

        var result = myMultiply(40, 50)
        textView.text = "${result}"

//        button.setOnClickListener {
//            println("Clicked set")
//        }

        //Class

        val homer = Simpson()

//    Object and Instance

        homer.age = 26
        homer.name = "Aliyev"
        homer.work = "Nuclear"

        println(homer.name + " " + homer.age + " " + homer.work )

    }

//  Input - Return
    fun mySum(a: Int, b: Int) {
        textView.text = "Result: ${a + b}"
//        textView.text = "Result: ${a + b}"
//        println(a+b)
    }

    fun myMultiply(x: Int, y: Int) :Int{
        return x * y
    }

    fun helloKotlin(view: View) {
        textView.text = "Change Hello Kotlin"
    }





}