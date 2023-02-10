package com.app.finance.data.dao

import androidx.room.*
import com.app.finance.domain.model.Transaction

@Dao
interface HistoryRepositoryImpl {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertTransaction(transaction: Transaction)

    @Query("SELECT * FROM history")
    suspend fun getHistory(): List<Transaction>

    @Delete
    suspend fun deleteTransaction(transaction: Transaction)

    @Query("SELECT * FROM history WHERE id=:id")
    suspend fun getTransaction(id: Long): Transaction
}