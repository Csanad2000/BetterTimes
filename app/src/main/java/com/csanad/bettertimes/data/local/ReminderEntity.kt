package com.csanad.bettertimes.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.csanad.bettertimes.Constants.REMINDER_TABLE

@Entity(tableName = REMINDER_TABLE)
data class ReminderEntity (
    @PrimaryKey(autoGenerate = true)
    var id:Int=0,
    var repetition:Int,
    var days:ArrayList<Int>,
    var title:String,
    var description:String,
    var next:Long,
    var time:Long
)