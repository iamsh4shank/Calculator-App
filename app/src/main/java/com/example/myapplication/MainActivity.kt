package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun addMe( view:View) {
        val addButton = findViewById<Button>(R.id.Document)
        val showResult = findViewById<TextView>(R.id.result)
        val StrOne = editText_first_no.text.toString()
        val StrTwo = editText_second_no.text.toString()
        val sumResult = StrOne.toDouble() + StrTwo.toDouble()
        showResult.text = sumResult.toString()
    }

    fun subMe( view:View) {
        val addButton = findViewById<Button>(R.id.Sub)
        val showResult = findViewById<TextView>(R.id.result)
        val StrOne = editText_first_no.text.toString()
        val StrTwo = editText_second_no.text.toString()
        val sumResult = StrOne.toDouble() - StrTwo.toDouble()
        showResult.text = sumResult.toString()
    }

    fun mulMe( view:View) {
        val addButton = findViewById<Button>(R.id.Mul)
        val showResult = findViewById<TextView>(R.id.result)
        val StrOne = editText_first_no.text.toString()
        val StrTwo = editText_second_no.text.toString()
        val sumResult = StrOne.toDouble()*StrTwo.toDouble()
        showResult.text = sumResult.toString()
    }

    fun divMe( view:View) {
        val addButton = findViewById<Button>(R.id.Div)
        val showResult = findViewById<TextView>(R.id.result)
        val StrOne = editText_first_no.text.toString()
        val StrTwo = editText_second_no.text.toString()
        val sumResult = StrOne.toDouble()/StrTwo.toDouble()
        showResult.text = sumResult.toString()
    }

}

