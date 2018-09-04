package com.example.harshitha.kotlindemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import java.util.*

import kotlinx.android.synthetic.main.activity_second.textview_random
import kotlinx.android.synthetic.main.activity_second.textview_label

class SecondActivity : AppCompatActivity() {

    companion object {
        const val TOTAL_COUNT = "total_count"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        showRandomNumber()
    }

    fun showRandomNumber(){
        //the arguments are the key and the default value if the key is not found
        val count = intent.getIntExtra(TOTAL_COUNT,0)

        //val is like constant variable and its a immutable variable
        //var is like general variable and its a mutable variable
        val random = Random()
        var randomInt = 0
        if(count>0){
            randomInt = random.nextInt(count+1)
        }

        // Display the random number.
        textview_random.text = Integer.toString(randomInt)

        // Substitute the max value into the string resource
        // for the heading, and update the heading
        textview_label.text = getString(R.string.random_heading, count)

    }

}
