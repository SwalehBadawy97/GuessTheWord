package com.example.android.guesstheword.screens.score

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ScoreViewModel(finalScore : Int) : ViewModel() {

    //Final score
    private val _score = MutableLiveData<Int>()
    val score: LiveData<Int>
        get() = _score

    //Play again Livedata
    private val _eventPlayAgain = MutableLiveData<Boolean>()
    val eventPlayAgain : LiveData<Boolean>
    get() = _eventPlayAgain


    init {
        Log.i("ScoreViewModel", "Final score is $finalScore")
        _score.value = finalScore
    }

    //Methods to set and reset eventPlayAgain
    fun onPlayAgain(){
        _eventPlayAgain.value = true
    }

    fun onPlayAgainComplete(){
        _eventPlayAgain.value = false
    }

}