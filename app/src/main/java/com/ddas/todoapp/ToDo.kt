package com.ddas.todoapp

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.Instant
import java.util.Date

data class ToDo(
    var id:Int,
    var title:String,
    var createdAt: Date
)

@RequiresApi(Build.VERSION_CODES.O)
fun getFakeToDo() : List<ToDo> {
    return listOf<ToDo> (
        ToDo(1, "Task 1", Date.from(Instant.now())),
        ToDo(2, "Task 2", Date.from(Instant.now())),
        ToDo(3, "Task 3", Date.from(Instant.now())),
        ToDo(4, "Task 3", Date.from(Instant.now())),
    )
}