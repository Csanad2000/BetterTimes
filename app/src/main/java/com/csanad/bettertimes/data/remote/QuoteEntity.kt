package com.csanad.bettertimes.data.remote


import androidx.room.Entity
import androidx.room.PrimaryKey
import com.csanad.bettertimes.Constants
import com.google.gson.annotations.SerializedName

@Entity(tableName = Constants.QUOTE_TABLE)
data class QuoteEntity(
    @SerializedName("q")
    val quote: String,
    @SerializedName("a")
    val author: String,
    @SerializedName("c")
    val count: String,
    @SerializedName("h")
    val html: String,
    @PrimaryKey(autoGenerate = true)
    var id:Int=0
)