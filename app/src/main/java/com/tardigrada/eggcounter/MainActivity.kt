package com.tardigrada.eggcounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    // variables
    private lateinit var eggCounterViewModel: EggCounterViewModel
    private lateinit var tvCounter: TextView
    private lateinit var btnAddEgg: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // setting variables
        eggCounterViewModel = ViewModelProvider(this).get(EggCounterViewModel::class.java)
        tvCounter = findViewById(R.id.tvCounter)
        btnAddEgg = findViewById(R.id.btnAddEgg)

        // to show number of eggs after app starts and after landscape/portrait mode change
        tvCounter.text = eggCounterViewModel.eggCounterString(eggCounterViewModel.eggs())

        // adding clickListener to the button
        btnAddEgg.setOnClickListener {
            eggCounterViewModel.addEgg()
            tvCounter.text = eggCounterViewModel.eggCounterString(eggCounterViewModel.eggs())
        }
    }
}