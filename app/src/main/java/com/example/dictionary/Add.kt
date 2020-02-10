package com.example.dictionary

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_add.*
import java.io.PrintStream

class Add : AppCompatActivity() {
    private val Words="word.txt"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add)
    }
    fun onclick(view:View){
        val word=etWord.text.toString()
        val defn=etDefn.text.toString()

        val line="$word\t\t$defn"

        val outputStream=PrintStream(openFileOutput(Words, Context.MODE_APPEND))
        outputStream.println(line)
        outputStream.close()

        val myintent=Intent()
        myintent.putExtra("word",word)
        myintent.putExtra("defn",defn)

        //Intent myintent=
    }
}
