package com.rybarstudios.pets

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.TypedValue
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val animalList = arrayOf<String>("Tiger" , "Bear", "Penguin", "Dog", "Elephant", "Giraffe")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        animalList.forEach {
            scroll_view_linear_layout.addView(generateTextView(it))
        }

    }

    private fun generateTextView(name: String) : TextView {
        val view = TextView(this)
        view.text = name
        view.setPadding(15,15,15,15)
        view.setTextSize(TypedValue.COMPLEX_UNIT_SP, 24.0f)
        return view
    }
}
