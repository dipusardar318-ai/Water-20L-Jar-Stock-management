package com.example.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface StockEntryDao {
    @Insert
    suspend fun insert(entry: StockEntry)

    @Query("SELECT * FROM stock_entries ORDER BY date DESC")
    fun getAllEntries(): Flow<List<StockEntry>>
}
