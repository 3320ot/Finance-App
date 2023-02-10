package com.app.finance.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.app.finance.data.dao.HistoryRepositoryImpl
import com.app.finance.domain.model.Transaction

@Database(
    entities = [
        Transaction::class],
    version = 1,
    exportSchema = false
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun historyDao() : HistoryRepositoryImpl
}