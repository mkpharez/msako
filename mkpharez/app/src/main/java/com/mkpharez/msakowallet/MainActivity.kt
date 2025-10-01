package com.mkpharez.msakowallet

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

/**
 * MainActivity - Entry point for msakoWallet application
 * 
 * This is a starter activity for the M-Sacco & E-Wallet Android Fintech App
 * Following MVVM architecture pattern as outlined in ARCHITECTURE.md
 */
class MainActivity : AppCompatActivity() {
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        // TODO: Initialize ViewModels and set up UI observers
        // Following MVVM pattern with StateFlow for reactivity
    }
}
