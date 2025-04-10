package com.example.skates.ui.main

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.skates.ui.home.HomeScreen
import com.example.skates.ui.other.OtherScreen


@Composable
fun SkatesApp() {
    val navController = rememberNavController()

    Scaffold(
        bottomBar = {
            NavBar(
                modifier = Modifier,
                navController = navController,
                routes = listOf(
                    Nav.Home,
                    Nav.Other,
                )
            )
        }
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = Nav.Home.name,
        ) {
            composable(Nav.Home.name) {
                HomeScreen(
                    modifier = Modifier
                        .padding(innerPadding)
                )
            }
            composable(Nav.Other.name) {
                OtherScreen(
                    modifier = Modifier
                        .padding(innerPadding)
                )
            }
        }

    }

}