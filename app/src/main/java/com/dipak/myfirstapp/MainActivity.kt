package com.dipak.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun launchRocket(view: android.view.View) {
        Toast.makeText(this@MainActivity, "The rocket has been launched.", Toast.LENGTH_LONG).show()
    }
}