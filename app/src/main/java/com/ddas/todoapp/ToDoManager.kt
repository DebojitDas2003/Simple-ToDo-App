package com.ddas.todoapp

import java.time.Instant
import java.util.Date

object ToDoManager {
    private var toDoList = mutableListOf<ToDo>()

    fun getAllToDo(): List<ToDo> {
        return toDoList
    }

    fun addToDo(title: String) {
        toDoList.add(ToDo(System.currentTimeMillis().toInt(),title, Date.from(Instant.now())))
    }

    fun deleteToDo(id: Int) {
        toDoList.removeIf{
            it.id==id
        }
    }

}