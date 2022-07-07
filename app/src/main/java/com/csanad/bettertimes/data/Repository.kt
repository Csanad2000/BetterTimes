package com.csanad.bettertimes.data

import androidx.lifecycle.LiveData
import com.csanad.bettertimes.data.local.BTDatabase
import com.csanad.bettertimes.data.local.ReminderEntity
import com.csanad.bettertimes.data.remote.QuoteEntity

class Repository(val database:BTDatabase) {

    fun insertReminder(reminderEntity: ReminderEntity){
        database.reminderDao.insertReminder(reminderEntity)
    }

    fun updateReminder(reminderEntity: ReminderEntity){
        database.reminderDao.updateReminder(reminderEntity)
    }

    fun readReminder(id:Int):ReminderEntity{
        return database.reminderDao.readReminder(id)
    }

    fun readAllReminders():LiveData<List<ReminderEntity>>{
        return database.reminderDao.readAllReminders()
    }

    fun deleteReminder(reminderEntity: ReminderEntity){
        database.reminderDao.deleteReminder(reminderEntity)
    }

    fun readQuote():QuoteEntity{
        return database.quoteDao.readQuote()
    }

    fun insertQuotes(quotes:ArrayList<QuoteEntity>){
        database.quoteDao.insertQuotes(quotes)
    }

    companion object{
        private lateinit var instance:Repository
        fun getInstance(database: BTDatabase):Repository{
            if (!this::instance.isInitialized){
                synchronized(this){
                    if (!this::instance.isInitialized){
                        instance= Repository(database)
                    }
                }
            }
            return instance
        }
    }
}