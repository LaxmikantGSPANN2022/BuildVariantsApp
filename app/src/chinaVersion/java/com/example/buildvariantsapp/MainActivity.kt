package com.example.buildvariantsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var textViewSample: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textViewSample = findViewById(R.id.simpleTextView)

        textViewSample?.setText(
            "Hello China, this build FLAVOR is = ${
                BuildConfig.APPLICATION_ID
            }"
        )
    }
}