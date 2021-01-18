package com.example.calculator_auth

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var button: Button = findViewById(R.id.buttonStart)
        button.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        var intent: Intent = Intent(this, Calculator::class.java)
        startActivity(intent)
    }
}
