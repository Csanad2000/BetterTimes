package com.csanad.bettertimes

import android.app.Application
import androidx.room.Room
import com.csanad.bettertimes.Constants.BETTER_TIMES_DATABASE
import com.csanad.bettertimes.data.Repository
import com.csanad.bettertimes.data.local.BTDatabase

class BTApplication:Application() {
    private val database=Room.databaseBuilder(applicationContext,BTDatabase::class.java,BETTER_TIMES_DATABASE).build()
    val repository=Repository.getInstance(database)
}