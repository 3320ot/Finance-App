package com.app.finance.domain.usecases

import com.app.finance.domain.repository.HistoryRepository
import javax.inject.Inject

class GetHistory @Inject constructor(private val historyRepository: HistoryRepository) {
    suspend operator fun invoke() = historyRepository.getHistory()
}