package com.example.skates.ui.animation

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class AnimationViewModel: ViewModel() {
    private val _animationScreenUIState = MutableStateFlow(AnimationScreenUIState())
    val animationScreenUIState = _animationScreenUIState.asStateFlow()
}