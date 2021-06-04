package com.example.xo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class History : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_history)
        val log = findViewById<TextView>(R.id.view3)
        val view2 = findViewById<TextView>(R.id.showt3)

        val move = intent.getSerializableExtra("move")
        log.text = move.toString()
        val player = intent.getSerializableExtra("player")
        view2.text = player.toString()

        val button = findViewById<Button>(R.id.tofirstpg)
        button.setOnClickListener {
            val intent = Intent(this,Firstpg::class.java)
            startActivity(intent)
        }

    }
}