package com.app.finance.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverter
import java.sql.Date
import java.sql.Time

@Entity(tableName = "history")
data class Transaction(
    @PrimaryKey(autoGenerate = true)
    val id: Long,
    val date: Date,
    val time: Time,
    val type: Boolean,
    val sum: Float,
    val content: String,
    val category: String
)

object DateConverter {
    @TypeConverter
    fun toDate(dateLong: Long?): Date? {
        return dateLong?.let { Date(it) }
    }
    @TypeConverter
    fun fromDate(date: Date?): Long? {
        return date?.time
    }
}

object TimeConverter {
    @TypeConverter
    fun toDate(timeLong: Long?): Time? {
        return timeLong?.let { Time(it) }
    }
    @TypeConverter
    fun fromTime(time: Time?): Long? {
        return time?.time
    }
}