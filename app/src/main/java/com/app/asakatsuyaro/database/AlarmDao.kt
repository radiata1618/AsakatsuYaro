package com.app.asakatsuyaro.database

import androidx.room.*

@Dao
interface AlarmDao {
    @Insert
    fun insert(user : Alarm)

    @Update
    fun update(user : Alarm)

    @Delete
    fun delete(user : Alarm)

    @Query("delete from alarm")
    fun deleteAll()

    @Query("select * from alarm")
    fun getAll(): List<Alarm>

    @Query("select * from alarm where id = :id")
    fun getAlarm(id: Int): Alarm

    @Query("select * from alarm where id = :patternId")
    fun getAlarmByPatternId(patternId: Int): Alarm
}