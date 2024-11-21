package com.example.pertemuan8.ui.view.viewmodel

import androidx.lifecycle.ViewModel
import com.example.pertemuan8.model.RencanaStudi
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class RencanaStudyViewModel: ViewModel() {
    private val _krsState = MutableStateFlow(RencanaStudi())
    val krsStateUI: StateFlow<RencanaStudi> = _krsState.asStateFlow()

}