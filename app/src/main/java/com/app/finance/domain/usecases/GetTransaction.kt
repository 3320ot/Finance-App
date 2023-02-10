package com.app.finance.domain.usecases

import com.app.finance.domain.repository.HistoryRepository
import javax.inject.Inject

class GetTransaction @Inject constructor(private val historyRepository: HistoryRepository) {
    suspend operator fun invoke(id: Long) = historyRepository.getTransactionById(id = id)
}