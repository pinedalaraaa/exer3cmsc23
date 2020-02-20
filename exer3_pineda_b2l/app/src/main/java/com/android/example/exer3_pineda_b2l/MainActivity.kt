package com.android.example.exer3_pineda_b2l

import android.content.Context
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.start_button).setOnClickListener {
            addName(it)
            updateInterface(it)
            setListeners()
        }
    }

    private fun addName(view: View) {
        val editText = findViewById<EditText>(R.id.name_edit)
        val nameTextView = findViewById<TextView>(R.id.display_name)

        nameTextView.text = editText.text

        val inputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        inputMethodManager.hideSoftInputFromWindow(view.windowToken, 0)
    }

    private fun updateInterface (view: View) {
        val editText = findViewById<EditText>(R.id.name_edit)
        val startButton = findViewById<Button>(R.id.start_button)
        val gameTitle = findViewById<TextView>(R.id.game_title)

        val tileOne = findViewById<TextView>(R.id.tile_one)
        val tileTwo = findViewById<TextView>(R.id.tile_two)
        val tileThree = findViewById<TextView>(R.id.tile_three)
        val tileFour = findViewById<TextView>(R.id.tile_four)
        val tileFive = findViewById<TextView>(R.id.tile_five)

        val tileSix = findViewById<TextView>(R.id.tile_six)
        val tileSeven = findViewById<TextView>(R.id.tile_seven)
        val tileEight = findViewById<TextView>(R.id.tile_eight)
        val tileNine = findViewById<TextView>(R.id.tile_nine)
        val tileTen = findViewById<TextView>(R.id.tile_ten)

        val tileEleven = findViewById<TextView>(R.id.tile_eleven)
        val tileTwelve = findViewById<TextView>(R.id.tile_twelve)
        val tileThirteen = findViewById<TextView>(R.id.tile_thirteen)
        val tileFourteen = findViewById<TextView>(R.id.tile_fourteen)
        val tileFifteen = findViewById<TextView>(R.id.tile_fifteen)

        val tileSixteen = findViewById<TextView>(R.id.tile_sixteen)
        val tileSeventeen = findViewById<TextView>(R.id.tile_seventeen)
        val tileEighteen = findViewById<TextView>(R.id.tile_eighteen)
        val tileNineteen = findViewById<TextView>(R.id.tile_nineteen)
        val tileTwenty = findViewById<TextView>(R.id.tile_twenty)

        val tileTwentyOne= findViewById<TextView>(R.id.tile_twenty_one)
        val tileTwentyTwo = findViewById<TextView>(R.id.tile_twenty_two)
        val tileTwentyThree = findViewById<TextView>(R.id.tile_twenty_three)
        val tileTwentyFour = findViewById<TextView>(R.id.tile_twenty_four)
        val tileTwentyFive = findViewById<TextView>(R.id.tile_twenty_five)

        val constraintGuide = findViewById<TextView>(R.id.constraint_guide)
        val displayName = findViewById<TextView>(R.id.display_name)
        val moveText = findViewById<TextView>(R.id.move_count)
        val counter = findViewById<TextView>(R.id.counter)


        editText.visibility = View.GONE
        startButton.visibility = View.GONE
        gameTitle.visibility = View.GONE
        view.visibility = View.GONE

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

    private fun makeColored(view: View) {
        when (view.id) {

            // Boxes using Color class colors for the background
            R.id.tile_one -> view.setBackgroundColor(Color.DKGRAY)
            R.id.tile_two -> view.setBackgroundColor(Color.GRAY)
            R.id.tile_three -> view.setBackgroundColor(Color.BLUE)
            R.id.tile_four -> view.setBackgroundColor(Color.MAGENTA)
            R.id.tile_five -> view.setBackgroundColor(Color.BLUE)

            R.id.tile_six -> view.setBackgroundColor(Color.DKGRAY)
            R.id.tile_seven -> view.setBackgroundColor(Color.GRAY)
            R.id.tile_eight -> view.setBackgroundColor(Color.BLUE)
            R.id.tile_nine -> view.setBackgroundColor(Color.MAGENTA)
            R.id.tile_ten -> view.setBackgroundColor(Color.BLUE)

            R.id.tile_eleven -> view.setBackgroundColor(Color.DKGRAY)
            R.id.tile_twelve -> view.setBackgroundColor(Color.GRAY)
            R.id.tile_thirteen -> view.setBackgroundColor(Color.BLUE)
            R.id.tile_fourteen -> view.setBackgroundColor(Color.MAGENTA)
            R.id.tile_fifteen -> view.setBackgroundColor(Color.BLUE)

            R.id.tile_sixteen -> view.setBackgroundColor(Color.DKGRAY)
            R.id.tile_seventeen -> view.setBackgroundColor(Color.GRAY)
            R.id.tile_eighteen -> view.setBackgroundColor(Color.BLUE)
            R.id.tile_nineteen -> view.setBackgroundColor(Color.MAGENTA)
            R.id.tile_twenty -> view.setBackgroundColor(Color.BLUE)

            R.id.tile_twenty_one -> view.setBackgroundColor(Color.DKGRAY)
            R.id.tile_twenty_two -> view.setBackgroundColor(Color.GRAY)
            R.id.tile_twenty_three -> view.setBackgroundColor(Color.BLUE)
            R.id.tile_twenty_four -> view.setBackgroundColor(Color.MAGENTA)
            R.id.tile_twenty_five -> view.setBackgroundColor(Color.BLUE)

            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
    private fun setListeners() {

        val tileOne = findViewById<TextView>(R.id.tile_one)
        val tileTwo = findViewById<TextView>(R.id.tile_two)
        val tileThree = findViewById<TextView>(R.id.tile_three)
        val tileFour = findViewById<TextView>(R.id.tile_four)
        val tileFive = findViewById<TextView>(R.id.tile_five)

        val tileSix = findViewById<TextView>(R.id.tile_six)
        val tileSeven = findViewById<TextView>(R.id.tile_seven)
        val tileEight = findViewById<TextView>(R.id.tile_eight)
        val tileNine = findViewById<TextView>(R.id.tile_nine)
        val tileTen = findViewById<TextView>(R.id.tile_ten)

        val tileEleven = findViewById<TextView>(R.id.tile_eleven)
        val tileTwelve = findViewById<TextView>(R.id.tile_twelve)
        val tileThirteen = findViewById<TextView>(R.id.tile_thirteen)
        val tileFourteen = findViewById<TextView>(R.id.tile_fourteen)
        val tileFifteen = findViewById<TextView>(R.id.tile_fifteen)

        val tileSixteen = findViewById<TextView>(R.id.tile_sixteen)
        val tileSeventeen = findViewById<TextView>(R.id.tile_seventeen)
        val tileEighteen = findViewById<TextView>(R.id.tile_eighteen)
        val tileNineteen = findViewById<TextView>(R.id.tile_nineteen)
        val tileTwenty = findViewById<TextView>(R.id.tile_twenty)

        val tileTwentyOne= findViewById<TextView>(R.id.tile_twenty_one)
        val tileTwentyTwo = findViewById<TextView>(R.id.tile_twenty_two)
        val tileTwentyThree = findViewById<TextView>(R.id.tile_twenty_three)
        val tileTwentyFour = findViewById<TextView>(R.id.tile_twenty_four)
        val tileTwentyFive = findViewById<TextView>(R.id.tile_twenty_five)

        val rootConstraintLayout = findViewById<View>(R.id.constraint_layout)

        val clickableViews: List<View> =
            listOf(tileOne, tileTwo, tileThree, tileFour, tileFive,
                tileSix, tileSeven, tileEight, tileNine, tileTen,
                tileEleven, tileTwelve, tileThirteen, tileFourteen, tileFifteen,
                tileSixteen, tileSeventeen, tileEighteen, tileNineteen, tileTwenty,
                tileTwentyOne, tileTwentyTwo, tileTwentyThree, tileTwentyFour, tileTwentyFive,
                rootConstraintLayout)

        for (item in clickableViews) {
            item.setOnClickListener { makeColored(it) }
        }
    }
}
