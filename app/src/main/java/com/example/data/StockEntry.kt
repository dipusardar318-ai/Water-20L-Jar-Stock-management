package com.example.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "stock_entries")
data class StockEntry(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val date: Long, // Use timestamp for easy sorting/filtering
    val type: String,
    val quantity: Int,
    val notes: String = ""
)
