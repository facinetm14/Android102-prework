package com.fakouyat.hello

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnSayHello = findViewById<Button>(R.id.btn_say_hello)
        btnSayHello.setOnClickListener {
            Toast.makeText(this, "Hello to you!", Toast.LENGTH_SHORT).show()
        }

    }
}