package com.example.xo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import com.example.tic_tac_toe.MainActivity

class Firstpg : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_firstpg)

        val button = findViewById<ImageButton>(R.id.play)
        button.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            overridePendingTransition(R.transition.explode,R.transition.explode)
            startActivity(intent)
        }
    }
}