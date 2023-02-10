package com.app.finance.data

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.app.finance.data.dao.HistoryRepositoryImpl
import com.app.finance.domain.model.DateConverter
import com.app.finance.domain.model.TimeConverter
import com.app.finance.domain.model.Transaction

@Database(
    entities = [
        Transaction::class],
    version = 1,
    exportSchema = false
)
@TypeConverters(DateConverter::class, TimeConverter::class)
abstract class AppDatabase : RoomDatabase() {
    abstract fun historyDao() : HistoryRepositoryImpl
}