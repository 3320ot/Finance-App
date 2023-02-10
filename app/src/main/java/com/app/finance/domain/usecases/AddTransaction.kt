package com.app.finance.domain.usecases

import com.app.finance.domain.model.Transaction
import com.app.finance.domain.repository.HistoryRepository
import javax.inject.Inject

class AddTransaction @Inject constructor(private val historyRepository: HistoryRepository) {
    suspend operator fun invoke(transaction: Transaction) = historyRepository.insertTransaction(transaction = transaction)
}