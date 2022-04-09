package com.example.propapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class activitySecond : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)


        val button2 = findViewById<Button>(R.id.button2)
        button2.setOnClickListener(){
            val Intent = Intent(this, gatunki::class.java)
            startActivity(Intent)

        }
        val button3 = findViewById<Button>(R.id.button3)
        button3.setOnClickListener(){
            val Intent = Intent(this, gatunki2::class.java)
            startActivity(Intent)
        }
        val button4 = findViewById<Button>(R.id.button4)
        button4.setOnClickListener(){
            val Intent = Intent(this, gatunki3::class.java)
            startActivity(Intent)
        }
    }
}