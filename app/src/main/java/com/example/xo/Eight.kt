package com.example.xo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class Eight : AppCompatActivity() {
    //1=Circle  0 =Cross
    var activePlayer = 1
    var gameIsActive = true
    var count = 0
    var text = ""
    var gameState = intArrayOf(
        2, 2, 2, 2, 2, 2, 2, 2
        , 2, 2, 2, 2, 2, 2, 2, 2
        , 2, 2, 2, 2, 2, 2, 2, 2
        , 2, 2, 2, 2, 2, 2, 2, 2
        , 2, 2, 2, 2, 2, 2, 2, 2
        , 2, 2, 2, 2, 2, 2, 2, 2
        , 2, 2, 2, 2, 2, 2, 2, 2
        , 2, 2, 2, 2, 2, 2, 2, 2)
    var winningPosition = arrayOf(
        intArrayOf(0, 1, 2, 3, 4,5,6,7),
        intArrayOf(8,9,10,11,12,13,14,15),
        intArrayOf(16,17,18,19,20,21,22,23),
        intArrayOf(24,25,26,27,28,29,30,31),
        intArrayOf(32,33,34,35,36,37,38,39),
        intArrayOf(40,41,42,43,44,45,46,47),
        intArrayOf(48,49,50,51,52,53,54,55),
        intArrayOf(56,57,58,59,60,61,62,63),
        intArrayOf(0,8,16,24,32,40,48,56 ),
        intArrayOf(1,9,17,25,33,31,33,57),
        intArrayOf(2,10,18,26,34,42,50,58),
        intArrayOf(3,11,19,27,35,43,51,59),
        intArrayOf(4,12,20,28,36,44,52,60),
        intArrayOf(5,13,21,29,37,45,53,61),
        intArrayOf(6,14,22,30,38,46,54,62),
        intArrayOf(7,15,23,31,39,47,55,63),
        intArrayOf(0,9,18,27,36,45,54,63),
        intArrayOf(7,14,21,28,35,42,49,56)
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
                val intent = Intent(this@Eight, History::class.java)
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
                text = "row 1 column 8"
            else if (tappedcounter == 8)
                text = "row 2 column 1"
            else if (tappedcounter == 9)
                text = "row 2 column 2"
            else if (tappedcounter == 10)
                text = "row 2 column 3"
            else if (tappedcounter == 11)
                text = "row 2 column 4"
            else if (tappedcounter == 12)
                text = "row 2 column 5"
            else if (tappedcounter == 13)
                text = "row 2 column 6"
            else if (tappedcounter == 14)
                text = "row 2 column 7"
            else if (tappedcounter == 15)
                text = "row 2 column 8"
            else if (tappedcounter == 16)
                text = "row 3 column 1"
            else if (tappedcounter == 17)
                text = "row 3 column 2"
            else if (tappedcounter == 18)
                text = "row 3 column 3"
            else if (tappedcounter == 19)
                text = "row 3 column 4"
            else if (tappedcounter == 20)
                text = "row 3 column 5"
            else if (tappedcounter == 21)
                text = "row 3 column 6"
            else if (tappedcounter == 22)
                text = "row 3 column 7"
            else if (tappedcounter == 23)
                text = "row 3 column 8"
            else if (tappedcounter == 24)
                text = "row 4 column 1"
            else if (tappedcounter == 25)
                text = "row 4 column 2"
            else if (tappedcounter == 26)
                text = "row 4 column 3"
            else if (tappedcounter == 27)
                text = "row 4 column 4"
            else if (tappedcounter == 28)
                text = "row 4 column 5"
            else if (tappedcounter == 29)
                text = "row 4 column 6"
            else if (tappedcounter == 30)
                text = "row 4 column 7"
            else if (tappedcounter == 31)
                text = "row 4 column 8"
            else if (tappedcounter == 32)
                text = "row 5 column 1"
            else if (tappedcounter == 33)
                text = "row 5 column 2"
            else if (tappedcounter == 34)
                text = "row 5 column 3"
            else if (tappedcounter == 35)
                text = "row 5 column 4"
            else if (tappedcounter == 36)
                text = "row 5 column 5"
            else if (tappedcounter == 37)
                text = "row 5 column 6"
            else if (tappedcounter == 38)
                text = "row 5 column 7"
            else if (tappedcounter == 39)
                text = "row 5 column 8"
            else if (tappedcounter == 40)
                text = "row 6 column 1"
            else if (tappedcounter == 41)
                text = "row 6 column 2"
            else if (tappedcounter == 42)
                text = "row 6 column 3"
            else if (tappedcounter == 43)
                text = "row 6 column 4"
            else if (tappedcounter == 44)
                text = "row 6 column 5"
            else if (tappedcounter == 45)
                text = "row 6 column 6"
            else if (tappedcounter == 46)
                text = "row 6 column 7"
            else if (tappedcounter == 47)
                text = "row 6 column 8"
            else if (tappedcounter == 48)
                text = "row 7 column 1"
            else if (tappedcounter == 49)
                text = "row 7 column 2"
            else if (tappedcounter == 50)
                text = "row 7 column 3"
            else if (tappedcounter == 51)
                text = "row 7 column 4"
            else if (tappedcounter ==52)
                text = "row 7 column 5"
            else if (tappedcounter == 53)
                text = "row 7 column 6"
            else if (tappedcounter == 54)
                text = "row 7 column 7"
            else if (tappedcounter == 55)
                text = "row 7 column 8"
            else if (tappedcounter == 56)
                text = "row 8 column 1"
            else if (tappedcounter == 57)
                text = "row 8 column 2"
            else if (tappedcounter == 58)
                text = "row 8 column 3"
            else if (tappedcounter == 59)
                text = "row 8 column 4"
            else if (tappedcounter == 60)
                text = "row 8 column 5"
            else if (tappedcounter == 61)
                text = "row 8 column 6"
            else if (tappedcounter == 62)
                text = "row 8 column 7"
            else if (tappedcounter == 63)
                text = "row 8 column 8"
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
        if (gameIsActive && count == 64) {
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
        setContentView(R.layout.activity_eight)



    }
}
