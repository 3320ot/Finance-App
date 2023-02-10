package com.app.finance.presentation.screens.details

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.app.finance.domain.model.Transaction
import com.app.finance.domain.usecases.GetHistoryPerDay
import com.app.finance.domain.usecases.GetTransaction
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import java.sql.Date
import javax.inject.Inject

@HiltViewModel
class DetailsViewModel @Inject constructor(
    private val getHistory: GetHistoryPerDay,
    private val getTransaction: GetTransaction
) : ViewModel() {
    private val _history = MutableLiveData<List<Transaction>>()
    val history
        get() = _history

    private val _transaction = MutableLiveData<Transaction>()
    val transaction: LiveData<Transaction>
        get() = _transaction

    fun getHistory(date: Date) {
        viewModelScope.launch {
            getHistory.invoke(date).let {
                _history.postValue(it)
            }
        }
    }

    fun getTransaction(id: Long) {
        viewModelScope.launch {
            getTransaction.invoke(id).let {
                _transaction.postValue(it)
                getHistory(it.date)
            }
        }
    }
}