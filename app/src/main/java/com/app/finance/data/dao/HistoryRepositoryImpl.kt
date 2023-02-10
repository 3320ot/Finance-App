package com.app.finance.data.dao

import androidx.room.*
import com.app.finance.domain.model.Transaction
import java.sql.Date

@Dao
interface HistoryRepositoryImpl {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertTransaction(transaction: Transaction)

    @Query("SELECT * FROM history")
    suspend fun getHistory(): List<Transaction>

    @Query("SELECT * FROM history " +
            "WHERE history.date=:date")
    suspend fun getTransactionsPerDay(date: Date): List<Transaction>

    @Delete
    suspend fun deleteTransaction(transaction: Transaction)

    @Query("SELECT * FROM history WHERE id=:id")
    suspend fun getTransaction(id: Long): Transaction
}