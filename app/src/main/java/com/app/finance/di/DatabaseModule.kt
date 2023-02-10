package com.app.finance.di

import android.content.Context
import androidx.room.Room
import com.app.finance.data.AppDatabase
import com.app.finance.data.dao.HistoryRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
class DatabaseModule {
    @Provides
    fun provideAppDate(@ApplicationContext appContext: Context): AppDatabase {
        return Room.databaseBuilder(
            appContext,
            AppDatabase::class.java,
            "history_database"
        ).build()
    }

    @Provides
    fun provideHistoryDao(appDatabase: AppDatabase): HistoryRepositoryImpl {
        return appDatabase.historyDao()
    }
}