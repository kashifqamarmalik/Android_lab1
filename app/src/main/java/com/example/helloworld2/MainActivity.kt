package com.example.helloworld2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener {
             // do something when the button is clicked
           if (textView.text == "Hello World!") {
               textView.text = "Good bye Summer!"
           } else if(textView.text == "Good bye Summer!"){
               textView.text = "Hello World!"
           }
        }

    }


}