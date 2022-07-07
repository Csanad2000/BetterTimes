package com.csanad.bettertimes.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.csanad.bettertimes.Constants.QUOTE_TABLE
import com.csanad.bettertimes.data.remote.QuoteEntity

@Dao
interface QuoteDao {
    @Insert
    fun insertQuotes(quotes :ArrayList<QuoteEntity>)

    @Query("SELECT 1 FROM $QUOTE_TABLE")
    fun readQuote(): QuoteEntity
}