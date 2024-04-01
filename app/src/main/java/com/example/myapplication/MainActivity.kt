package com.example.myapplication

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // Set the initial layout
    }

    // Click listener for the button to switch to the second layout
    fun navigateToSecondLayout(view: View) {
        setContentView(R.layout.activity_video) // Switch to the second layout
    }
}
