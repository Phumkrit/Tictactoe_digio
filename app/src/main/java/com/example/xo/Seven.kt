package com.example.xo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class Seven : AppCompatActivity() {
    //1=Circle  0 =Cross
    var activePlayer = 1
    var gameIsActive = true
    var count = 0
    var text = ""
    var gameState = intArrayOf(2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,2,2,2,2,2,2,2,2,2,2,2,2,2)
    var winningPosition = arrayOf(
        intArrayOf(0, 1, 2, 3, 4,5,6),
        intArrayOf(7,8,9,10,11,12,13),
        intArrayOf(14,15,16,17,18,19,20),
        intArrayOf(21,22,23,24,25,26,27),
        intArrayOf(28,29,30,31,32,33,34),
        intArrayOf(35,36,37,38,39,40,41),
        intArrayOf(42,43,44,45,46,47,48),
        intArrayOf(0, 7,14,21,28,35,42),
        intArrayOf(1, 8,15,22,29,36,43),
        intArrayOf(2,9,16,23,30,37,44),
        intArrayOf(3,10,17,24,31,38,45),
        intArrayOf(4,11,18,25,32,39,46),
        intArrayOf(5,12,19,26,33,40,47),
        intArrayOf(6,13,20,27,34,41,48),
        intArrayOf(0,8,16,24,32,40,48),
        intArrayOf(6,12,18,24,30,36,42)
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
                val intent = Intent(this@Seven, History::class.java)
                intent.putExtra("move", list)
                intent.putExtra("player", player)
                startActivity(intent)
            }
            if (tappedcounter == 0)
            text = "row 1 column 1"
            else if (tappedcounter == 1)
                text = "row 1 column 2"
            else if (tappedcounter == 2)
                text = "row 1 column 3"
            else if (tappedcounter == 3)
                text = "row 1 column 4"
            else if (tappedcounter == 4)
                text = "row 1 column 5"
            else if (tappedcounter == 5)
                text = "row 1 column 6"
            else if (tappedcounter == 6)
                text = "row 1 column 7"
            else if (tappedcounter == 7)
                text = "row 2 column 1"
            else if (tappedcounter == 8)
                text = "row 2 column 2"
            else if (tappedcounter == 9)
                text = "row 2 column 3"
            else if (tappedcounter == 10)
                text = "row 2 column 4"
            else if (tappedcounter == 11)
                text = "row 2 column 5"
            else if (tappedcounter == 12)
                text = "row 2 column 6"
            else if (tappedcounter == 13)
                text = "row 2 column 7"
            else if (tappedcounter == 14)
                text = "row 3 column 1"
            else if (tappedcounter == 15)
                text = "row 3 column 2"
            else if (tappedcounter == 16)
                text = "row 3 column 3"
            else if (tappedcounter == 17)
                text = "row 3 column 4"
            else if (tappedcounter == 18)
                text = "row 3 column 5"
            else if (tappedcounter == 19)
                text = "row 3 column 6"
            else if (tappedcounter == 20)
                text = "row 3 column 7"
            else if (tappedcounter == 21)
                text = "row 4 column 1"
            else if (tappedcounter == 22)
                text = "row 4 column 2"
            else if (tappedcounter == 23)
                text = "row 4 column 3"
            else if (tappedcounter == 24)
                text = "row 4 column 4"
            else if (tappedcounter == 25)
                text = "row 4 column 5"
            else if (tappedcounter == 26)
                text = "row 4 column 6"
            else if (tappedcounter == 27)
                text = "row 4 column 7"
            else if (tappedcounter == 28)
                text = "row 5 column 1"
            else if (tappedcounter == 29)
                text = "row 5 column 2"
            else if (tappedcounter == 30)
                text = "row 5 column 3"
            else if (tappedcounter == 31)
                text = "row 5 column 4"
            else if (tappedcounter == 32)
                text = "row 5 column 5"
            else if (tappedcounter == 33)
                text = "row 5 column 6"
            else if (tappedcounter == 34)
                text = "row 5 column 7"
            else if (tappedcounter == 35)
                text = "row 6 column 1"
            else if (tappedcounter == 36)
                text = "row 6 column 2"
            else if (tappedcounter == 37)
                text = "row 6 column 3"
            else if (tappedcounter == 38)
                text = "row 6 column 4"
            else if (tappedcounter == 39)
                text = "row 6 column 5"
            else if (tappedcounter == 40)
                text = "row 6 column 6"
            else if (tappedcounter == 41)
                text = "row 6 column 7"
            else if (tappedcounter == 42)
                text = "row 7 column 1"
            else if (tappedcounter == 43)
                text = "row 7 column 2"
            else if (tappedcounter == 44)
                text = "row 7 column 3"
            else if (tappedcounter == 45)
                text = "row 7 column 4"
            else if (tappedcounter == 46)
                text = "row 7 column 5"
            else if (tappedcounter == 47)
                text = "row 7 column 6"
            else if (tappedcounter == 48)
                text = "row 7 column 7"
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
        if (gameIsActive && count == 49) {
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
        setContentView(R.layout.activity_seven)



    }
}
