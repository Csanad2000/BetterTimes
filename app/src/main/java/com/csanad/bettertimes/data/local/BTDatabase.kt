package com.csanad.bettertimes.data.local

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [ReminderEntity::class], version = 1, exportSchema = false)
abstract class BTDatabase:RoomDatabase() {

    abstract var reminderDao:ReminderDao
    abstract var quoteDao:QuoteDao
}