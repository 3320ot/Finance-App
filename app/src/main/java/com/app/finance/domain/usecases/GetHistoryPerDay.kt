package com.app.finance.domain.usecases

import com.app.finance.domain.repository.HistoryRepository
import java.sql.Date
import javax.inject.Inject

class GetHistoryPerDay @Inject constructor(private val historyRepository: HistoryRepository) {
    suspend operator fun invoke(date: Date) = historyRepository.getHistoryPerDay(date)
}