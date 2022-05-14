package com.tardigrada.eggcounter

class EggCounterFunctions {
    // variables
    private var eggs: Int = 0
    private var eggCounterString = ""

    // function adds +1 egg to the eggs
    fun addEgg(): Int {
        return eggs++
    }

    // function to show the number of eggs
    fun eggs(): Int {
        return eggs
    }

    // function to create String to show how many eggs we have
    fun eggCounterString(eggs: Int): String {
        if (eggs == 1) {
            eggCounterString = "You have $eggs egg"
        } else if (eggs > 1) {
            eggCounterString = "You have $eggs eggs"
        } else {
            eggCounterString = "You have no eggs"
        }
        return eggCounterString
    }
}