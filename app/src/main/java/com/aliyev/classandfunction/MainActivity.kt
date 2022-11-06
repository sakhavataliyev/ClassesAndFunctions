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

        val homer = Simpson(27, "Aliyev", "Developer")
        homer.hairColor = "Green"

        //    Object and Instance

        /*  homer.age = 26
          homer.name = "Aliyev"
          homer.job = "Nuclear"
  */
        println(homer.name + " " + homer.age + " " + homer.hairColor )

//        Nullability
//        Nullable(?) && Non-null
        var myString : String? = null
        var myAge : Int? = null

//        println(myString)
//        println(myAge!! * 8)

//        1) Null Safety
        if (myAge != null){
            println(myAge!! * 8)
        }
        else {
            println("myAge null!")
        }
//          2) Safe call
        println(myAge?.compareTo(2))

//        3) Elvis
        val myResult = myAge?.compareTo(2) ?: 200
        println(myResult)




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