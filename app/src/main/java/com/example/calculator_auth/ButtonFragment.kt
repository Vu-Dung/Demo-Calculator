package com.example.calculator

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.calculator_auth.R
import kotlinx.android.synthetic.main.fragment_button.*

class ButtonFragment : Fragment(), View.OnClickListener {
    private lateinit var sendTextListener: SendTextListener

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        button0.setOnClickListener(this)
        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)
        button5.setOnClickListener(this)
        button6.setOnClickListener(this)
        button7.setOnClickListener(this)
        button8.setOnClickListener(this)
        button9.setOnClickListener(this)
        buttonAdd.setOnClickListener(this)
        buttonSub.setOnClickListener(this)
        buttonMul.setOnClickListener(this)
        buttonDiv.setOnClickListener(this)
        buttonAC.setOnClickListener(this)
        buttonClear.setOnClickListener(this)
        buttonOpen.setOnClickListener(this)
        buttonClose.setOnClickListener(this)
        buttonDot.setOnClickListener(this)
        buttonEqual.setOnClickListener(this)
    }

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        return inflater.inflate(R.layout.fragment_button, container, false)
    }

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        if (context is SendTextListener)
            sendTextListener = context
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.button0 -> sendTextListener.sendTex(button0.text.toString())
            R.id.button1 -> sendTextListener.sendTex(button1.text.toString())
            R.id.button2 -> sendTextListener.sendTex(button2.text.toString())
            R.id.button3 -> sendTextListener.sendTex(button3.text.toString())
            R.id.button4 -> sendTextListener.sendTex(button4.text.toString())
            R.id.button5 -> sendTextListener.sendTex(button5.text.toString())
            R.id.button6 -> sendTextListener.sendTex(button6.text.toString())
            R.id.button7 -> sendTextListener.sendTex(button7.text.toString())
            R.id.button8 -> sendTextListener.sendTex(button8.text.toString())
            R.id.button9 -> sendTextListener.sendTex(button9.text.toString())
            R.id.buttonAdd -> sendTextListener.sendTex(buttonAdd.text.toString())
            R.id.buttonSub -> sendTextListener.sendTex(buttonSub.text.toString())
            R.id.buttonMul -> sendTextListener.sendTex(buttonMul.text.toString())
            R.id.buttonDiv -> sendTextListener.sendTex(buttonDiv.text.toString())
            R.id.buttonAC -> sendTextListener.sendTex(buttonAC.text.toString())
            R.id.buttonClear -> sendTextListener.sendTex(buttonClear.text.toString())
            R.id.buttonClose -> sendTextListener.sendTex(buttonClose.text.toString())
            R.id.buttonOpen -> sendTextListener.sendTex(buttonOpen.text.toString())
            R.id.buttonEqual -> sendTextListener.sendTex(buttonEqual.text.toString())
            R.id.buttonDot -> sendTextListener.sendTex(buttonDot.text.toString())
        }
    }
}
