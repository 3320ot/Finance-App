package com.app.finance.presentation.screens.details

import androidx.lifecycle.ViewModel
import com.app.finance.domain.usecases.GetTransaction
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class DetailsViewModel @Inject constructor(
    private val getTransaction: GetTransaction
) : ViewModel() {
}