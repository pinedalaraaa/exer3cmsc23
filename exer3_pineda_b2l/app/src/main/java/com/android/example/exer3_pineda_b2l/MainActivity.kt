package com.android.example.exer3_pineda_b2l

import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.graphics.toColor


class MainActivity : AppCompatActivity() {
    lateinit var tileOne : TextView
    lateinit var tileTwo : TextView
    lateinit var tileThree : TextView
    lateinit var tileFour : TextView
    lateinit var tileFive : TextView

    lateinit var tileSix : TextView
    lateinit var tileSeven : TextView
    lateinit var tileEight : TextView
    lateinit var tileNine : TextView
    lateinit var tileTen : TextView

    lateinit var tileEleven : TextView
    lateinit var tileTwelve : TextView
    lateinit var tileThirteen : TextView
    lateinit var tileFourteen : TextView
    lateinit var tileFifteen : TextView

    lateinit var tileSixteen : TextView
    lateinit var tileSeventeen : TextView
    lateinit var tileEighteen : TextView
    lateinit var tileNineteen : TextView
    lateinit var tileTwenty : TextView

    lateinit var tileTwentyOne : TextView
    lateinit var tileTwentyTwo : TextView
    lateinit var tileTwentyThree : TextView
    lateinit var tileTwentyFour : TextView
    lateinit var tileTwentyFive : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tileOne = findViewById(R.id.tile_one)
        tileTwo = findViewById(R.id.tile_two)
        tileThree = findViewById(R.id.tile_three)
        tileFour = findViewById(R.id.tile_four)
        tileFive = findViewById(R.id.tile_five)

        tileSix = findViewById(R.id.tile_six)
        tileSeven = findViewById(R.id.tile_seven)
        tileEight = findViewById(R.id.tile_eight)
        tileNine = findViewById(R.id.tile_nine)
        tileTen = findViewById(R.id.tile_ten)

        tileEleven = findViewById(R.id.tile_eleven)
        tileTwelve = findViewById(R.id.tile_twelve)
        tileThirteen = findViewById(R.id.tile_thirteen)
        tileFourteen = findViewById(R.id.tile_fourteen)
        tileFifteen = findViewById(R.id.tile_fifteen)

        tileSixteen = findViewById(R.id.tile_sixteen)
        tileSeventeen = findViewById(R.id.tile_seventeen)
        tileEighteen = findViewById(R.id.tile_eighteen)
        tileNineteen = findViewById(R.id.tile_nineteen)
        tileTwenty = findViewById(R.id.tile_twenty)

        tileTwentyOne = findViewById(R.id.tile_twenty_one)
        tileTwentyTwo = findViewById(R.id.tile_twenty_three)
        tileTwentyThree = findViewById(R.id.tile_twenty_three)
        tileTwentyFour = findViewById(R.id.tile_twenty_four)
        tileTwentyFive = findViewById(R.id.tile_twenty_five)


        findViewById<Button>(R.id.start_button).setOnClickListener {
            addName(it)
            updateInterface(it)
            setListeners()
        }
    }

    //sets the player's name
    private fun addName(view: View) {
        val editText = findViewById<EditText>(R.id.name_edit)
        val nameTextView = findViewById<TextView>(R.id.display_name)

        nameTextView.text = editText.text

        val inputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        inputMethodManager.hideSoftInputFromWindow(view.windowToken, 0)
    }

    //updates the counter
    private fun countUp() {
        val newResult: TextView = findViewById(R.id.counter)

        val text = newResult.getText().toString()
        val number = Integer.parseInt(text)
        val newCount = (number+1).toString()
        newResult.setText(newCount)
    }

    //updates the interface once the user has clicked the start button
    private fun updateInterface (view: View) {
        val editText = findViewById<EditText>(R.id.name_edit)
        val startButton = findViewById<Button>(R.id.start_button)
        val gameTitle = findViewById<TextView>(R.id.game_title)

        val constraintGuide = findViewById<TextView>(R.id.constraint_guide)
        val displayName = findViewById<TextView>(R.id.display_name)
        val moveText = findViewById<TextView>(R.id.move_count)
        val counter = findViewById<TextView>(R.id.counter)


        editText.visibility = View.GONE
        startButton.visibility = View.GONE
        gameTitle.visibility = View.GONE
        view.visibility = View.GONE

        //elements of the updated interface
        constraintGuide.visibility = View.VISIBLE
        displayName.visibility = View.VISIBLE
        moveText.visibility = View.VISIBLE
        counter.visibility = View.VISIBLE

        tileOne.visibility = View.VISIBLE
        tileTwo.visibility = View.VISIBLE
        tileThree.visibility = View.VISIBLE
        tileFour.visibility = View.VISIBLE
        tileFive.visibility = View.VISIBLE

        tileSix.visibility = View.VISIBLE
        tileSeven.visibility = View.VISIBLE
        tileEight.visibility = View.VISIBLE
        tileNine.visibility = View.VISIBLE
        tileTen.visibility = View.VISIBLE

        tileEleven.visibility = View.VISIBLE
        tileTwelve.visibility = View.VISIBLE
        tileThirteen.visibility = View.VISIBLE
        tileFourteen.visibility = View.VISIBLE
        tileFifteen.visibility = View.VISIBLE

        tileSixteen.visibility = View.VISIBLE
        tileSeventeen.visibility = View.VISIBLE
        tileEighteen.visibility = View.VISIBLE
        tileNineteen.visibility = View.VISIBLE
        tileTwenty.visibility = View.VISIBLE

        tileTwentyOne.visibility = View.VISIBLE
        tileTwentyTwo.visibility = View.VISIBLE
        tileTwentyThree.visibility = View.VISIBLE
        tileTwentyFour.visibility = View.VISIBLE
        tileTwentyFive.visibility = View.VISIBLE

    }

    //changes the color of the tiles
    private fun makeColored(view: View) {

        when (view.id) {

            // Boxes using Color class colors for the background
            R.id.tile_one -> view.setBackgroundColor(Color.BLACK)
            R.id.tile_two -> view.setBackgroundColor(Color.BLACK)
            R.id.tile_three -> view.setBackgroundColor(Color.BLACK)
            R.id.tile_four -> view.setBackgroundColor(Color.BLACK)
            R.id.tile_five -> view.setBackgroundColor(Color.BLACK)

            R.id.tile_six -> view.setBackgroundColor(Color.BLACK)
            R.id.tile_seven -> view.setBackgroundColor(Color.BLACK)
            R.id.tile_eight -> view.setBackgroundColor(Color.BLACK)
            R.id.tile_nine -> view.setBackgroundColor(Color.BLACK)
            R.id.tile_ten -> view.setBackgroundColor(Color.BLACK)

            R.id.tile_eleven -> view.setBackgroundColor(Color.BLACK)
            R.id.tile_twelve -> view.setBackgroundColor(Color.BLACK)
            R.id.tile_thirteen -> view.setBackgroundColor(Color.BLACK)
            R.id.tile_fourteen -> view.setBackgroundColor(Color.BLACK)
            R.id.tile_fifteen -> view.setBackgroundColor(Color.BLACK)

            R.id.tile_sixteen -> view.setBackgroundColor(Color.BLACK)
            R.id.tile_seventeen -> view.setBackgroundColor(Color.BLACK)
            R.id.tile_eighteen -> view.setBackgroundColor(Color.BLACK)
            R.id.tile_nineteen -> view.setBackgroundColor(Color.BLACK)
            R.id.tile_twenty -> view.setBackgroundColor(Color.BLACK)

            R.id.tile_twenty_one -> view.setBackgroundColor(Color.BLACK)
            R.id.tile_twenty_two -> view.setBackgroundColor(Color.BLACK)
            R.id.tile_twenty_three -> view.setBackgroundColor(Color.BLACK)
            R.id.tile_twenty_four -> view.setBackgroundColor(Color.BLACK)
            R.id.tile_twenty_five -> view.setBackgroundColor(Color.BLACK)
        }
    }

    //sets the listeners to the root layout and each tile
    private fun setListeners() {

        val rootConstraintLayout = findViewById<View>(R.id.constraint_layout)
        rootConstraintLayout.setBackgroundColor(Color.LTGRAY)

        val clickableViews: List<View> =
            listOf(tileOne, tileTwo, tileThree, tileFour, tileFive,
                tileSix, tileSeven, tileEight, tileNine, tileTen,
                tileEleven, tileTwelve, tileThirteen, tileFourteen, tileFifteen,
                tileSixteen, tileSeventeen, tileEighteen, tileNineteen, tileTwenty,
                tileTwentyOne, tileTwentyTwo, tileTwentyThree, tileTwentyFour, tileTwentyFive)

        for (item in clickableViews) {
            item.setOnClickListener { countUp() }
            item.setOnClickListener { makeColored(it) }
        }
    }
}
