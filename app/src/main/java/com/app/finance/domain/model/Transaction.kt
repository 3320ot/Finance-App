package com.app.finance.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "history")
data class Transaction(
    @PrimaryKey(autoGenerate = true)
    val id: Long,
    val date: String,
    val type: Boolean,
    val sum: Float,
    val content: String,
    val category: String
)