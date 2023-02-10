package com.app.finance.domain.repository

import com.app.finance.data.dao.HistoryRepositoryImpl
import com.app.finance.domain.model.Transaction
import javax.inject.Inject

class HistoryRepository @Inject constructor(private val historyRepositoryImpl: HistoryRepositoryImpl) {
    suspend fun getHistory(): List<Transaction> = historyRepositoryImpl.getHistory()

    suspend fun insertTransaction(transaction: Transaction) = historyRepositoryImpl.insertTransaction(transaction = transaction)

    suspend fun deleteTransaction(transaction: Transaction) = historyRepositoryImpl.deleteTransaction(transaction = transaction)

    suspend fun getTransactionById(id: Long) = historyRepositoryImpl.getTransaction(id = id)
}