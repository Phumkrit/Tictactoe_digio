package com.example.xo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class ten : AppCompatActivity() {
    //1=Circle  0 =Cross
    var activePlayer = 1
    var gameIsActive = true
    var count = 0
    var text = ""
    var gameState = intArrayOf(
        2, 2, 2, 2, 2, 2, 2, 2, 2, 2
        , 2, 2, 2, 2, 2, 2, 2, 2, 2, 2
        , 2, 2, 2, 2, 2, 2, 2, 2, 2, 2
        , 2, 2, 2, 2, 2, 2, 2, 2, 2, 2
        , 2, 2, 2, 2, 2, 2, 2, 2, 2, 2
        , 2, 2, 2, 2, 2, 2, 2, 2, 2, 2
        , 2, 2, 2, 2, 2, 2, 2, 2, 2, 2
        , 2, 2, 2, 2, 2, 2, 2, 2, 2,2
        , 2, 2, 2, 2, 2, 2, 2, 2, 2,2
        , 2, 2, 2, 2, 2, 2, 2, 2, 2, 2)
    var winningPosition = arrayOf(

        //Horizential
        intArrayOf(0, 1, 2, 3, 4,5,6,7,8,9),
        intArrayOf(10,11,12,13,14,15,16,17,18,19),
        intArrayOf(20,21,22,23,24,25,26,27,28,29),
        intArrayOf(30,31,32,33,34,35,36,37,38,39),
        intArrayOf(40,41,42,43,44,45,46,47,48,49),
        intArrayOf(50,51,52,53,54,55,56,57,58,59),
        intArrayOf(60,61,62,63,64,65,66,67,68,69),
        intArrayOf(70,71,72,73,74,75,76,77,78,79),
        intArrayOf(80,81,82,83,84,85,86,87,88,89),
        intArrayOf(90,91,92,93,94,95,96,97,98,99),
        //Vertical
        intArrayOf(0,10,20,30,40,50,60,70,80,90),
        intArrayOf(1,11,21,31,41,51,61,71,81,91),
        intArrayOf(2,12,22,32,42,52,62,72,82,92),
        intArrayOf(3,13,23,33,43,53,63,73,83,93),
        intArrayOf(4,14,24,34,44,54,64,74,84,94),
        intArrayOf(5,15,25,35,45,55,65,75,85,95),
        intArrayOf(6,16,26,36,46,56,66,76,86,96),
        intArrayOf(7,17,27,37,47,57,67,77,87,97),
        intArrayOf(8,18,28,38,48,58,68,78,88,98),
        intArrayOf(9,19,29,39,49,59,69,79,89,99),
        intArrayOf(0,11,22,33,44,55,66,77,88,99),
        intArrayOf(9,18,27,36,45,54,63,72,81,90)
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
                val intent = Intent(this@ten, History::class.java)
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
                text = "row 1 column 9"
            else if (tappedcounter == 9)
                text = "row 1 column 10"
            else if (tappedcounter == 10)
                text = "row 2 column 1"
            else if (tappedcounter == 11)
                text = "row 2 column 2"
            else if (tappedcounter == 12)
                text = "row 2 column 3"
            else if (tappedcounter == 13)
                text = "row 2 column 4"
            else if (tappedcounter == 14)
                text = "row 2 column 5"
            else if (tappedcounter == 15)
                text = "row 2 column 6"
            else if (tappedcounter == 16)
                text = "row 2 column 7"
            else if (tappedcounter == 17)
                text = "row 2 column 8"
            else if (tappedcounter == 18)
                text = "row 2 column 9"
            else if (tappedcounter == 19)
                text = "row 2 column 10"
            else if (tappedcounter == 20)
                text = "row 3 column 1"
            else if (tappedcounter == 21)
                text = "row 3 column 2"
            else if (tappedcounter == 22)
                text = "row 3 column 3"
            else if (tappedcounter == 23)
                text = "row 3 column 4"
            else if (tappedcounter == 24)
                text = "row 3 column 5"
            else if (tappedcounter == 25)
                text = "row 3 column 6"
            else if (tappedcounter == 26)
                text = "row 3 column 7"
            else if (tappedcounter == 27)
                text = "row 3 column 8"
            else if (tappedcounter == 28)
                text = "row 3 column 9"
            else if (tappedcounter == 29)
                text = "row 3 column 10"
            else if (tappedcounter == 30)
                text = "row 4 column 1"
            else if (tappedcounter == 31)
                text = "row 4 column 2"
            else if (tappedcounter == 32)
                text = "row 4 column 3"
            else if (tappedcounter == 33)
                text = "row 4 column 4"
            else if (tappedcounter == 34)
                text = "row 4 column 5"
            else if (tappedcounter == 35)
                text = "row 4 column 6"
            else if (tappedcounter == 36)
                text = "row 4 column 7"
            else if (tappedcounter == 37)
                text = "row 4 column 8"
            else if (tappedcounter == 38)
                text = "row 4 column 9"
            else if (tappedcounter == 39)
                text = "row 4 column 10"
            else if (tappedcounter == 40)
                text = "row 5 column 1"
            else if (tappedcounter == 41)
                text = "row 5 column 2"
            else if (tappedcounter == 42)
                text = "row 5 column 3"
            else if (tappedcounter == 43)
                text = "row 5 column 4"
            else if (tappedcounter == 44)
                text = "row 5 column 5"
            else if (tappedcounter == 45)
                text = "row 5 column 6"
            else if (tappedcounter == 46)
                text = "row 5 column 7"
            else if (tappedcounter == 47)
                text = "row 5 column 8"
            else if (tappedcounter == 48)
                text = "row 5 column 9"
            else if (tappedcounter == 49)
                text = "row 5 column 10"
            else if (tappedcounter == 50)
                text = "row 6 column 1"
            else if (tappedcounter == 51)
                text = "row 6 column 2"
            else if (tappedcounter ==52)
                text = "row 6 column 3"
            else if (tappedcounter == 53)
                text = "row 6 column 4"
            else if (tappedcounter == 54)
                text = "row 6 column 5"
            else if (tappedcounter == 55)
                text = "row 6 column 6"
            else if (tappedcounter == 56)
                text = "row 6 column 7"
            else if (tappedcounter == 57)
                text = "row 6 column 8"
            else if (tappedcounter == 58)
                text = "row 6 column 9"
            else if (tappedcounter == 59)
                text = "row 6 column 10"
            else if (tappedcounter == 60)
                text = "row 7 column 1"
            else if (tappedcounter == 61)
                text = "row 7 column 2"
            else if (tappedcounter == 62)
                text = "row 7 column 3"
            else if (tappedcounter == 63)
                text = "row 7 column 4"
            else if (tappedcounter == 64)
                text = "row 7 column 5"
            else if (tappedcounter == 65)
                text = "row 7 column 6"
            else if (tappedcounter == 66)
                text = "row 7 column 7"
            else if (tappedcounter == 67)
                text = "row 7 column 8"
            else if (tappedcounter == 68)
                text = "row 7 column 9"
            else if (tappedcounter == 69)
                text = "row 7 column 10"
            else if (tappedcounter == 70)
                text = "row 8 column 1"
            else if (tappedcounter == 71)
                text = "row 8 column 2"
            else if (tappedcounter == 72)
                text = "row 8 column 3"
            else if (tappedcounter == 73)
                text = "row 8 column 4"
            else if (tappedcounter == 74)
                text = "row 8 column 5"
            else if (tappedcounter == 75)
                text = "row 8 column 6"
            else if (tappedcounter == 76)
                text = "row 8 column 7"
            else if (tappedcounter == 77)
                text = "row 8 column 8"
            else if (tappedcounter == 78)
                text = "row 8 column 9"
            else if (tappedcounter == 79)
                text = "row 8 column 10"
            else if (tappedcounter == 80)
                text = "row 9 column 1"
            else if (tappedcounter == 81)
                text = "row 9 column 2"
            else if (tappedcounter == 82)
                text = "row 9 column 3"
            else if (tappedcounter == 83)
                text = "row 9 column 4"
            else if (tappedcounter == 84)
                text = "row 9 column 5"
            else if (tappedcounter == 85)
                text = "row 9 column 6"
            else if (tappedcounter == 86)
                text = "row 9 column 7"
            else if (tappedcounter == 87)
                text = "row 9 column 8"
            else if (tappedcounter == 88)
                text = "row 9 column 9"
            else if (tappedcounter == 89)
                text = "row 9 column 10"
            else if (tappedcounter == 90)
                text = "row 10 column 1"
            else if (tappedcounter == 91)
                text = "row 10 column 2"
            else if (tappedcounter == 92)
                text = "row 10 column 3"
            else if (tappedcounter == 93)
                text = "row 10 column 4"
            else if (tappedcounter == 94)
                text = "row 10 column 5"
            else if (tappedcounter == 95)
                text = "row 10 column 6"
            else if (tappedcounter == 96)
                text = "row 10 column 7"
            else if (tappedcounter == 97)
                text = "row 10 column 8"
            else if (tappedcounter == 98)
                text = "row 10 column 9"
            else if (tappedcounter == 99)
                text = "row 10 column 10"
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
        if (gameIsActive && count == 100) {
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
        setContentView(R.layout.activity_ten)



    }
}
