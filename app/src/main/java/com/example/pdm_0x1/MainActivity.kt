package com.example.pdm_0x1

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView

import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var textViewMessage: TextView
    private lateinit var body: LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.textViewMessage = findViewById(R.id.textView);
        this.body = findViewById(R.id.view)
    }

    @SuppressLint("SetTextI18n")
    fun onClickRandomColor(view: View) {
        val x: Int = Random.nextInt(0, 255);
        val y: Int = Random.nextInt(0, 255);
        val z: Int = Random.nextInt(0, 255);
        this.textViewMessage.text = "$x $y $z";
        this.body.setBackgroundColor(Color.rgb(x, y, z));
    }
}