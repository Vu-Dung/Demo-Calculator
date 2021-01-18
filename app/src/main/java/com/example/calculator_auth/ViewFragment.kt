package com.example.calculator

import android.R
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import kotlinx.android.synthetic.main.fragment_view.*
import net.objecthunter.exp4j.ExpressionBuilder

class ViewFragment : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        return inflater.inflate(com.example.calculator_auth.R.layout.fragment_view, container, false)
    }

    fun getText(text: String?) {
        when (text) {
            "AC" -> {
                textMath.setText("")
                textResult.setText("")
            }
            "C" -> textMath.setText(textMath.text.toString().subSequence(0, (textMath.getText().toString()).length - 1))
            "=" -> {
                val txt = textMath.text.toString()
                if (txt != "") {
                    val expression = ExpressionBuilder(txt).build()
                    val result = expression.evaluate()
                    textResult.text = result.toString()
                }
            }
            else -> textMath.setText(textMath.text.toString() + text)
        }
    }
}
