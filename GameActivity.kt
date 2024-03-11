package com.example.quizapp

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.example.quizapp.classes.Constants
import com.example.quizapp.classes.Question

class GameActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var randomQuestionsList : ArrayList<Question>
    private lateinit var mQuestionsList : ArrayList<Question>

    private lateinit var tvQuestion : TextView
    private lateinit var tvOptionOne : TextView
    private lateinit var tvOptionTwo : TextView
    private lateinit var tvOptionThree : TextView
    private lateinit var tvOptionFour : TextView
    private lateinit var btnSubmit : TextView
    private lateinit var pb : ProgressBar
    private lateinit var tvProgress : TextView

    private lateinit var name : String

    private  var mSelectedPosition: Int = 0
    private var mCorrectAnswer : Int = 0
    private var mCurrentPosition: Int = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        mQuestionsList = Constants.getQuestion()
        mQuestionsList.shuffle()
        randomQuestionsList = mQuestionsList.take(10) as ArrayList<Question>
        name = intent.getStringExtra("user").toString()

        tvQuestion = findViewById<TextView>(R.id.tv_question)
        tvOptionOne = findViewById<TextView>(R.id.tv_optionOne)
        tvOptionTwo = findViewById<TextView>(R.id.tv_optionTwo)
        tvOptionThree = findViewById<TextView>(R.id.tv_optionThree)
        tvOptionFour = findViewById<TextView>(R.id.tv_optionFour)
        btnSubmit = findViewById<Button>(R.id.btnSubmit)
        pb = findViewById<ProgressBar>(R.id.pb)
        tvProgress = findViewById<TextView>(R.id.tv_progress)

        tvOptionOne.setOnClickListener(this)
        tvOptionTwo.setOnClickListener(this)
        tvOptionThree.setOnClickListener(this)
        tvOptionFour.setOnClickListener(this)
        btnSubmit.setOnClickListener(this)

        setQuestion()
    }

    private fun setQuestion() {


        val question: Question = randomQuestionsList[mCurrentPosition -1]

        tvQuestion.text = question.question
        tvOptionOne.text = question.optionOne
        tvOptionTwo.text = question.optionTwo
        tvOptionThree.text = question.optionThree
        tvOptionFour.text = question.optionFour

        pb.progress = mCurrentPosition
        tvProgress.text = "$mCurrentPosition" + "/" + pb.max // displays question number

        defaultAppearance()

        if (mCurrentPosition == randomQuestionsList.size){

            btnSubmit.text = "Quiz Finished"

        } else {

            btnSubmit.text = "Submit"
        }
    }

    private fun defaultAppearance() {

        val options = ArrayList<TextView>()
        options.add(0, tvOptionOne)
        options.add(1, tvOptionTwo)
        options.add(2, tvOptionThree)
        options.add(3, tvOptionFour)


        for (option in options){
            option.setTextColor(Color.parseColor("#7A8089"))

            option.typeface = Typeface.DEFAULT
            option.background = this@GameActivity.let { ContextCompat.getDrawable(it, R.drawable.option_border) }
        }
    }

    override fun onClick(v: View?) {
        when(v?.id) {
            R.id.tv_optionOne->{
                selectedOptionView(tvOptionOne, 1)
            }
            R.id.tv_optionTwo->{
                selectedOptionView(tvOptionTwo, 2)
            }
            R.id.tv_optionThree->{
                selectedOptionView(tvOptionThree, 3)
            }
            R.id.tv_optionFour->{
                selectedOptionView(tvOptionFour, 4)
            }
            R.id.btnSubmit->{
                if (mSelectedPosition == 0){

                    mCurrentPosition++
                    when{
                        mCurrentPosition <= randomQuestionsList.size->{

                            setQuestion()

                        } else -> {

                        // go to result
                        val intent = Intent(this@GameActivity, ScoreActivity::class.java)
                        intent.putExtra("name", name)
                        intent.putExtra("score", mCorrectAnswer)
                        startActivity(intent)
                    }
                    }
                } else {
                    val question = randomQuestionsList[mCurrentPosition-1]

                    if (question.correctAnswer!=mSelectedPosition) {

                        answerView(mSelectedPosition, R.drawable.wrong_option_border_bg)
                    } else {
                        mCorrectAnswer++
                    }
                    answerView(question.correctAnswer, R.drawable.correct_option_border_bg)

                    if (mCurrentPosition == randomQuestionsList.size){

                        btnSubmit.text = "Finished"
                    } else {

                        btnSubmit.text = " Go to Next Question"
                    }
                    mSelectedPosition = 0
                }
            }
        }
    }

    private fun answerView(mSelectedPosition: Int, drawableView: Int) {
        when (mSelectedPosition) {
            1->{
                tvOptionOne.background =
                    this@GameActivity.let { ContextCompat.getDrawable(it, drawableView) }
            }
            2->{
                tvOptionTwo.background =
                    this@GameActivity.let { ContextCompat.getDrawable(it, drawableView) }
            }
            3->{
                tvOptionThree.background =
                    this@GameActivity.let { ContextCompat.getDrawable(it, drawableView) }
            }
            4->{
                tvOptionFour.background =
                    this@GameActivity.let { ContextCompat.getDrawable(it, drawableView) }
            }
        }
    }

    private fun selectedOptionView(tv: TextView, selectedPosition: Int) {
        //reset text views
        defaultAppearance()
        mSelectedPosition = selectedPosition
        tv.setTextColor(Color.parseColor("#363A43"))

        tv.setTypeface(tv.typeface, Typeface.BOLD)
        tv.background = this@GameActivity.let { ContextCompat.getDrawable(it, R.drawable.option_border) }
    }

}