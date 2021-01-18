package com.example.calculator_auth

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.calculator.SendTextListener
import com.example.calculator.ViewFragment

class Calculator : AppCompatActivity(), SendTextListener {
    var tv: ViewFragment? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)
    }

    override fun sendTex(data: String) {
        tv = supportFragmentManager.findFragmentById(R.id.viewFragment) as ViewFragment
        tv!!.getText(data)
    }
}
