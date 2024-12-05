package com.example.resik.presentation.main

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.resik.presentation.main.MainScreen
import com.example.resik.presentation.navigation.AppNavigation
import dagger.hilt.android.AndroidEntryPoint

// presentation/main/MainActivity.kt
@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppNavigation() // Use AppNavigation instead of directly using MainScreen
        }
    }
}
