package com.example.harshitha.kotlindemo

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import com.example.harshitha.kotlindemo.R.id.textView

//Used instead of findViewById
//kotlinx.android.synthetic.main.<layout filename>.<id of view>
import kotlinx.android.synthetic.main.activity_main.textView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun count (view: View) {
//        // Get the text view
//        val showCountTextView = findViewById<TextView>(R.id.textView) as TextView

        // Get the value of the text view.
        val countString = textView.text.toString()
        // Convert value to a number and increment it
        var count = Integer.parseInt(countString)
        count++
        // Display the new value in the text view.
        textView.text = count.toString();
    }

    fun toast(view : View){
        val myToast = Toast.makeText(this,"Hello",Toast.LENGTH_SHORT).show()
    }

    fun random(view : View){
        val randomIntent = Intent(this, SecondActivity::class.java)

        val countString = textView.text.toString()
        val count = Integer.parseInt(countString)
        randomIntent.putExtra(SecondActivity.TOTAL_COUNT, count)

        startActivity(randomIntent)
    }
}
