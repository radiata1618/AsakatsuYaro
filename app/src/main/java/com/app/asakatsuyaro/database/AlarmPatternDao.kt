package com.app.asakatsuyaro.database

import androidx.room.*

@Dao
interface AlarmPatternDao {
    @Insert
    fun insert(user : AlarmPattern)

    @Update
    fun update(user : AlarmPattern)

    @Delete
    fun delete(user : AlarmPattern)

    @Query("delete from alarmPattern")
    fun deleteAll()

    @Query("select * from alarmPattern")
    fun getAll(): List<AlarmPattern>

    @Query("select * from alarmPattern where id = :id")
    fun getAlarmPattern(id: Int): AlarmPattern
}