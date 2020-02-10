package com.example.dictionary

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import java.util.*
import android.util.Log;
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.collections.HashMap

class MainActivity : AppCompatActivity() {
    //val hashmap= HashMap<String, String>()
    private var line = ArrayList<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        dictionary()
    }
    fun addAnotheractivity(view:View){
       startActivity(Intent(this,Add::class.java))
    }
    private fun dictionary(){
        val reader=Scanner(resources.openRawResource(R.raw.greword))
            while(reader.hasNextLine()) {
                line.add(reader.nextLine())
            }
                //Log.d("just","Line is:$line")
                val myadapter =
                    ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, line)
                definations.adapter = myadapter

    }
}
