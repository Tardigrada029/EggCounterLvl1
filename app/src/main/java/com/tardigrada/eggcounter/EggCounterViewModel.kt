package com.tardigrada.eggcounter

import android.app.Application
import androidx.lifecycle.AndroidViewModel

class EggCounterViewModel(application: Application) : AndroidViewModel(application) {
    private val eggCounterFunctions = EggCounterFunctions()

    // function adds +1 egg to the eggs
    fun addEgg(): Int {
        return eggCounterFunctions.addEgg()
    }

    // function takes 1 egg from the eggs
    fun takeEgg(): Int {
        return eggCounterFunctions.takeEgg()
    }

    // function to show the number of eggs
    fun eggs(): Int {
        return eggCounterFunctions.eggs()
    }

    // function to create String to show how many eggs we have
    fun eggCounterString(eggs: Int): String {
        return eggCounterFunctions.eggCounterString(eggs)
    }
}