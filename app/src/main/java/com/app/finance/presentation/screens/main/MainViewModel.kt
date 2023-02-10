package com.app.finance.presentation.screens.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.app.finance.domain.model.Transaction
import com.app.finance.domain.usecases.GetHistory
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val getHistory: GetHistory
) : ViewModel() {
    private val _history = MutableLiveData<List<Transaction>>()
    val history
        get() = _history

    private fun updateHistory() {
        viewModelScope.launch {
            getHistory.invoke().let {
                _history.postValue(it)
            }
        }
    }

    init {
        updateHistory()
    }
}