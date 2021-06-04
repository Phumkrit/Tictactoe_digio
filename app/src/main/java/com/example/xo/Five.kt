package com.example.xo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class Five : AppCompatActivity() {
    //1=Circle  0 =Cross
    var activePlayer = 1
    var gameIsActive = true
    var count = 0
    var text = ""
    var gameState = intArrayOf(2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2)
    var winningPosition = arrayOf(
        intArrayOf(0, 1, 2, 3, 4),
        intArrayOf(5, 6, 7,8 ,9),
        intArrayOf(10, 11,12,13,14),
        intArrayOf(15,16,17,18,19),
        intArrayOf(20,21,22,23,24),
        intArrayOf(0, 5,10,15,20),
        intArrayOf(1, 6,11,16,21),
        intArrayOf(2, 7,12,17,22),
        intArrayOf(3, 8,13,18,23),
        intArrayOf(4,9,14,19,24),
        intArrayOf(0, 6,12,18,24),
        intArrayOf(4,8,12,16,20)
    )

    var list: ArrayList<String> = ArrayList()
    val player: ArrayList<String> = ArrayList()
    fun dropIn(view: View) {
        val counter = view as ImageView
        val txt = findViewById<TextView>(R.id.winner1)
        val layout = findViewById<LinearLayout>(R.id.winner)
        val tappedcounter = counter.tag.toString().toInt()
        if (gameState[tappedcounter] == 2 && gameIsActive) {
            if (activePlayer == 1) {
                counter.setImageResource(R.drawable.circle)
                activePlayer = 0
                player.add("\n CIRCLE Move to \n")
                count++
                gameState[tappedcounter] = 1
            } else {
                counter.setImageResource(R.drawable.cross)
                activePlayer = 1
                player.add("\n CROSS Move to \n")
                count++
                gameState[tappedcounter] = 0
            }
            val move = findViewById<Button>(R.id.Move)
            move.setOnClickListener {
                val intent = Intent(this@Five, History::class.java)
                intent.putExtra("move", list)
                intent.putExtra("player", player)
                startActivity(intent)
            }
            if (tappedcounter == 0)
                text = "Line1 left corner"
            else if (tappedcounter == 1)
                text = "Line1 left"
            else if (tappedcounter == 2)
                text = "Line1 center"
            else if (tappedcounter == 3)
                text = "Line1 right"
            else if (tappedcounter == 4)
                text = "Line1 right corner"
            else if (tappedcounter == 5)
                text = "Line2 left corner"
            else if (tappedcounter == 6)
                text = "Line2 left"
            else if (tappedcounter == 7)
                text = "Line2 center"
            else if (tappedcounter == 8)
                text = "Line2 right"
            else if (tappedcounter == 9)
                text = "Line2 right corner"
            else if (tappedcounter == 10)
                text = "Line3 left corner"
            else if (tappedcounter == 11)
                text = "Line3 left"
            else if (tappedcounter == 12)
                text = "Line3 center"
            else if (tappedcounter == 13)
                text = "Line3 right"
            else if (tappedcounter == 14)
                text = "Line3 right corner"
            else if (tappedcounter == 15)
                text = "Line4 left corner"
            else if (tappedcounter == 16)
                text = "Line4 left"
            else if (tappedcounter == 17)
                text = "Line4 center"
            else if (tappedcounter == 18)
                text = "Line4 right"
            else if (tappedcounter == 19)
                text = "Line4 right corner"
            else if (tappedcounter == 20)
                text = "Line5 left corner"
            else if (tappedcounter == 21)
                text = "Line5 left"
            else if (tappedcounter == 22)
                text = "Line5 center"
            else if (tappedcounter == 23)
                text = "Line5 right"
            else if (tappedcounter == 24)
                text = "Line5 right corner"
            list.add("\n"+text+"\n")
            for (winningposition:IntArray in winningPosition) {
                if (gameState[winningposition[0]] == gameState[winningposition[1]] && gameState[winningposition[1]] == gameState[winningposition[2]] && gameState[winningposition[0]] != 2
                    && gameState[winningposition[2]] == gameState[winningposition[3]] && gameState[winningposition[3]] == gameState[winningposition[4]]  ) {
                    if (gameState[winningposition[0]] == 0) txt.text =
                        "Cross Wins!!!"
                    else if (gameState[winningposition[0]] == 1) txt.text =
                        "Circle Wins!!!"
                    layout.visibility = View.VISIBLE
                    gameIsActive = false
                }
            }

        }
        if (gameIsActive && count == 25) {
            txt.text = "DRAW"
            layout.visibility = View.VISIBLE
            gameIsActive = false
        }

    }
    fun playAgain(view: View) {
        activePlayer = 1
        gameIsActive = true
        count = 0
        val linearLayout = findViewById<LinearLayout>(R.id.winner)
        val gridLayout =
            findViewById<GridLayout>(R.id.gridLayout)
        for (i in gameState.indices) {
            gameState[i] = 2
        }
        linearLayout.visibility = View.INVISIBLE
        for (i in 0 until gridLayout.childCount) {
            (gridLayout.getChildAt(i) as ImageView).setImageResource(0) //p t n
        }

    }
    protected override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_five)



    }
}
