package com.sonia.assignment

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    var tvnumber: TextView?= null
    var addition: Button?= null
    var multiplication: Button?= null
    var subtraction: Button?=null
    var division: Button?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        tvnumber=findViewById(R.id.tvnumber)
        addition=findViewById(R.id.addition)
        multiplication=findViewById(R.id.multiply)
        subtraction=findViewById(R.id.subtraction)
        division=findViewById(R.id.division)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        subtraction?.setOnClickListener {
            tvnumber?.setText("${tvnumber?.text?.toString()?.toInt()?.minus(2)}")
        }
        addition?.setOnClickListener {
            tvnumber?.setText("${tvnumber?.text?.toString()?.toInt()?.plus(2)}")
        }
        multiplication?.setOnClickListener {
            tvnumber?.setText("${tvnumber?.text?.toString()?.toInt()?.times(2)}")
        }
        division ?.setOnClickListener {
            tvnumber?.setText("${tvnumber?.text?.toString()?.toInt()?.div(2)}")
        }
    }
}