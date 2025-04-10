package com.example.skates.ui.main

import android.annotation.SuppressLint
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.currentBackStackEntryAsState

@SuppressLint("RestrictedApi")
@Composable
fun NavBar(
    modifier: Modifier,
    navController: NavController,
    routes: List<Nav>
) {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination
    NavigationBar {
        routes.forEach { route ->
            NavigationBarItem(
                icon = { Icon(route.icon, route.label) },
                label = { Text(text = route.label) },
                selected = currentDestination?.hierarchy?.any { it.hasRoute(route.name, arguments = null) } == true,
                onClick = {
                    navController.navigate(route.name) {
                        popUpTo(navController.graph.findStartDestination().id) {
                            saveState = true
                        }
                        launchSingleTop = true
                        restoreState = true
                    }
                }
            )
        }
    }
}