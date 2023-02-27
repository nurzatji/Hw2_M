package com.example.taskfragment.data.local.room

import androidx.room.*
import com.example.taskfragment.ui.Model.Task

@Dao
interface TaskDao {

    @Query("SELECT * FROM task ORDER BY id DESC")
    fun getAll():List <Task>

    @Insert
    fun  insert(task: Task)


    @Delete
    fun  delete(task:Task )


    @Update
    fun update(task: Task)

}