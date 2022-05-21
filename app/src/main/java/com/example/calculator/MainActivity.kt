package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun Calc(v: View)
    {
       val n1 = findViewById<EditText>(R.id.edit)
        val n2 = findViewById<EditText>(R.id.edittext2)
        val res = findViewById<TextView>(R.id.result)
        val number1 :Float
        val number2 :Float

        val result :Float

        if (TextUtils.isEmpty(n1.text.toString())){
            n1.error = "Enter Some Number.."
            return
        }
        else{
            number1 = n1.text.toString().toFloat()
        }

        if (TextUtils.isEmpty(n2.text.toString())){
            n2.error = "Enter Some Number.."
            return
        }
        else{
            number2 = n2.text.toString().toFloat()
        }

        when(v.id){
            R.id.add ->{
                result = number1+number2
                res.text = result.toString()
            }
            R.id.sub ->{
                result = number1-number2
                res.text = result.toString()
            }
            R.id.mul ->{
                result = number1*number2
                res.text = result.toString()
            }
            R.id.div ->{
                if (number2 == 0.0F){
                    Toast.makeText(this@MainActivity,"Divide By Zero Error",Toast.LENGTH_SHORT).show()
                }else{
                    result = number1 / number2
                    res.text = result.toString()
                }
            }
        }
    }
}