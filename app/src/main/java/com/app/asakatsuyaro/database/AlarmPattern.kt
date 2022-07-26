package com.app.asakatsuyaro.database

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "alarmPattern")
data class AlarmPattern(
    @PrimaryKey(autoGenerate = true) val id: Int,
    val patternName: String,
    val monday: Boolean,
    val tuesday: Boolean,
    val wednesday: Boolean,
    val thursday: Boolean,
    val friday: Boolean,
    val saturday: Boolean,
    val sunday: Boolean,
    val goToBedTime: String,
    val forceGoToBedEnable: Boolean,
)