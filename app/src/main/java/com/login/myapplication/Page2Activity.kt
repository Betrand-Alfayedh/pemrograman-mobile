package com.login.myapplication

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Page2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page2)

        // Terima data yang dikirim dari MainActivity
        val username = intent.getStringExtra("USERNAME")

        val welcomeTextView = findViewById<TextView>(R.id.welcomeTextView)
        if (username != null) {
            welcomeTextView.text = "Welcome to Admin, $username!"
        } else {
            welcomeTextView.text = "Welcome to Admin!"
        }
    }
}
