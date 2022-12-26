package com.example.android.unscramble.ui.game

import android.util.Log
import androidx.lifecycle.ViewModel

class GameViewModel : ViewModel() {

    private var score = 0
    private var currentWordCount = 0
    private lateinit var _currentScrambledWord: String
    val currentScrambleWord
        get() = _currentScrambledWord

    private var wordsList: MutableList<String> = mutableListOf() // 중복 방지용용
    private lateinit var currentWord: String

    private fun getNextWord() {
        currentWord = allWordsList.random()

        val tempWord = currentWord.toCharArray()
        while (String(tempWord).equals(currentWord, false)) {
            tempWord.shuffle()
        }

        if (wordsList.contains(currentWord)) {
            getNextWord()
        } else {
            _currentScrambledWord = String(tempWord)
            ++_currentWordCount
            wordsList.add(currentWord)
        }
    }

    fun nextWord(): Boolean {
        return if (currentWordCount < MAX_NO_OF_WORDS) {
            getNextWord()
            true
        } else false
    }
    init {
        Log.d("GameViewModel", "GameViewModel created!")
        getNextWord()
    }

    override fun onCleared() {
        super.onCleared()
        Log.d("GameViewModel", "GameViewModel destroyed!")
    }
}