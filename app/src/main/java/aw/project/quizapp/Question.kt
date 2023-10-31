package aw.project.quizapp

import android.media.Image

data class Question(
    val id:Int,
    val question: String,
    val image: Int,

    val optionone:String,
    val optiontwo:String,
    val optionthree:String,
    val optionfour:String,
    val correctAnswer:Int

    )
