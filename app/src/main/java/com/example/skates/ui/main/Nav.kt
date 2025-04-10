package com.example.skates.ui.main

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.sharp.Home
import androidx.compose.material.icons.sharp.MoreVert
import androidx.compose.ui.graphics.vector.ImageVector


sealed class Nav(val name: String, val label: String, val icon: ImageVector) {
    data object Home : Nav("home", "Home", Icons.Sharp.Home)
    data object Other : Nav("other", "Other", Icons.Sharp.MoreVert)
}