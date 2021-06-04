package com.example.xo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class six : AppCompatActivity() {
    //1=Circle  0 =Cross
    var activePlayer = 1
    var gameIsActive = true
    var count = 0
    var text = ""
    var gameState = intArrayOf(2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2)
    var winningPosition = arrayOf(
        intArrayOf(0, 1, 2, 3, 4,5),
        intArrayOf(6, 7,8 ,9,10,11),
        intArrayOf(12,13,14,15,16,17),
        intArrayOf(18,19,20,21,22,23),
        intArrayOf(24,25,26,27,28,29),
        intArrayOf(30,31,32,33,34,35),
        intArrayOf(0, 6,12,18,24,30),
        intArrayOf(1, 7,13,19,25,31),
        intArrayOf(2, 8,14,20,26,32),
        intArrayOf(3, 9,15,21,27,33),
        intArrayOf(4,10,16,22,28,34),
        intArrayOf(5,11,17,23,29,35),
        intArrayOf(0, 7,14,21,28,35),
        intArrayOf(5,10,15,20,25,30)
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
                val intent = Intent(this@six, History::class.java)
                intent.putExtra("move", list)
                intent.putExtra("player", player)
                startActivity(intent)
            }
            if (tappedcounter == 0)
                if (tappedcounter == 0)
                    text = "Line1 left corner"
                else if (tappedcounter == 1)
                    text = "Line1 left"
                else if (tappedcounter == 2)
                    text = "Line1 center left"
                else if (tappedcounter == 3)
                    text = "Line1 center right"
                else if (tappedcounter == 4)
                    text = "Line1 right"
                else if (tappedcounter == 5)
                    text = "Line1 right corner"
                else if (tappedcounter == 6)
                    text = "Line2 left corner"
                else if (tappedcounter == 7)
                    text = "Line2 left"
                else if (tappedcounter == 8)
                    text = "Line2 center left"
                else if (tappedcounter == 9)
                    text = "Line2 center right"
                else if (tappedcounter == 10)
                    text = "Line2 right"
                else if (tappedcounter == 11)
                    text = "Line2 right corner"
                else if (tappedcounter == 12)
                    text = "Line3 left corner"
                else if (tappedcounter == 13)
                    text = "Line3 left"
                else if (tappedcounter == 14)
                    text = "Line3 center left"
                else if (tappedcounter == 15)
                    text = "Line3 center right"
                else if (tappedcounter == 16)
                    text = "Line3 right"
                else if (tappedcounter == 17)
                    text = "Line3 right corner"
                else if (tappedcounter == 18)
                    text = "Line4 left corner"
                else if (tappedcounter == 19)
                    text = "Line4 left"
                else if (tappedcounter == 20)
                    text = "Line4 center left"
                else if (tappedcounter == 21)
                    text = "Line4 center right"
                else if (tappedcounter == 22)
                    text = "Line4 right"
                else if (tappedcounter == 23)
                    text = "Line4 right corner"
                else if (tappedcounter == 24)
                    text = "Line5 left corner"
                else if (tappedcounter == 25)
                    text = "Line5 left"
                else if (tappedcounter == 26)
                    text = "Line5 center left"
                else if (tappedcounter == 27)
                    text = "Line5 center right"
                else if (tappedcounter == 28)
                    text = "Line5 right"
                else if (tappedcounter == 29)
                    text = "Line5 right corner"
                else if (tappedcounter == 30)
                    text = "Line6 left corner"
                else if (tappedcounter == 31)
                    text = "Line6 left"
                else if (tappedcounter == 32)
                    text = "Line6 center left"
                else if (tappedcounter == 33)
                    text = "Line6 center right"
                else if (tappedcounter == 34)
                    text = "Line6 right"
                else if (tappedcounter == 35)
                    text = "Line6 right corner"
            list.add("\n"+text+"\n")
            for (winningposition:IntArray in winningPosition) {
                if (gameState[winningposition[0]] == gameState[winningposition[1]] && gameState[winningposition[1]] == gameState[winningposition[2]] && gameState[winningposition[0]] != 2
                    && gameState[winningposition[2]] == gameState[winningposition[3]] && gameState[winningposition[3]] == gameState[winningposition[4]]  && gameState[winningposition[4]] == gameState[winningposition[5]]   ) {
                    if (gameState[winningposition[0]] == 0) txt.text =
                        "Cross Wins!!!"
                    else if (gameState[winningposition[0]] == 1) txt.text =
                        "Circle Wins!!!"
                    layout.visibility = View.VISIBLE
                    gameIsActive = false
                }
            }

        }
        if (gameIsActive && count == 36) {
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
        setContentView(R.layout.activity_six)



    }
}
