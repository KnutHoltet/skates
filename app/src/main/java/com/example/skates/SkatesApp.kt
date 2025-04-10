package com.example.skates

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.skates.ui.animation.AnimationScreen
import com.example.skates.ui.home.HomeScreen

@Composable
fun SkatesApp() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = "animation"
    ) {
        composable("animation") {
            AnimationScreen(modifier = Modifier)
        }
        composable("home") {
            HomeScreen(modifier = Modifier)
        }
    }
}