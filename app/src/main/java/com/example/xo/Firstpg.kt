package com.example.xo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import com.example.tic_tac_toe.*

class Firstpg : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_firstpg)

       val button = findViewById<Button>(R.id.three)
        button.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            overridePendingTransition(R.transition.explode,R.transition.explode)
            startActivity(intent)
        }
        val four = findViewById<Button>(R.id.four)
        four.setOnClickListener {
            val intent4 = Intent(this, FourActivity::class.java)
            startActivity(intent4)
        }

        val five = findViewById<Button>(R.id.five)
        five.setOnClickListener {
            val intent5 = Intent(this, Five::class.java)
            startActivity(intent5)
        }

        val six = findViewById<Button>(R.id.six)
        six.setOnClickListener {
            val intent6 = Intent(this, com.example.xo.six::class.java)
            startActivity(intent6)
        }

        val seven = findViewById<Button>(R.id.seven)
        seven.setOnClickListener {
            val intent7 = Intent(this, Seven::class.java)
            startActivity(intent7)
        }

        val eight = findViewById<Button>(R.id.eight)
        eight.setOnClickListener {
            val intent8 = Intent(this, Eight::class.java)
            startActivity(intent8)
        }

        val nine = findViewById<Button>(R.id.nine)
        nine.setOnClickListener {
            val intent9 = Intent(this, com.example.xo.nine::class.java)
            startActivity(intent9)
        }

        val ten = findViewById<Button>(R.id.ten)
        ten.setOnClickListener {
            val intent10 = Intent(this, com.example.xo.ten::class.java)
            startActivity(intent10)
        }
    }



}