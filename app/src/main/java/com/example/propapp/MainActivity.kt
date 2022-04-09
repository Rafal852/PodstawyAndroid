package com.example.propapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //gatunki
        val button = findViewById<Button>(R.id.button1)
        button.setOnClickListener(){
            val Intent = Intent(this, activitySecond::class.java)
            startActivity(Intent)

        }
        //ciekawostki
        val button2 = findViewById<Button>(R.id.button2)
        button2.setOnClickListener(){
            val Intent = Intent(this, ciekawostki::class.java)
            startActivity(Intent)

        }
    }
}