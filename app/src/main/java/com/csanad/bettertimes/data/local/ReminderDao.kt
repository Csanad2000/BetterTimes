package com.csanad.bettertimes.data.local

import androidx.lifecycle.LiveData
import androidx.room.*
import androidx.room.Dao
import com.csanad.bettertimes.Constants.REMINDER_TABLE

@Dao
interface ReminderDao {
    @Insert
    fun insertReminder(reminderEntity: ReminderEntity)

    @Update
    fun updateReminder(reminderEntity: ReminderEntity)

    @Query("SELECT * FROM $REMINDER_TABLE WHERE id = :id")
    fun readReminder(id:Int):ReminderEntity

    @Query("SELECT * FROM $REMINDER_TABLE ORDER BY next ASC")
    fun readAllReminders(): LiveData<List<ReminderEntity>>

    @Delete
    fun deleteReminder(reminderEntity: ReminderEntity)
}