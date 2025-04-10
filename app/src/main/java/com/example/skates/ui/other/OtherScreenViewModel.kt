package com.example.skates.ui.other

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow


class OtherScreenViewModel: ViewModel() {
    private val _otherScreenUIState = MutableStateFlow(OtherScreenUIState())
    val otherScreenUIState: StateFlow<OtherScreenUIState> = _otherScreenUIState.asStateFlow()

}