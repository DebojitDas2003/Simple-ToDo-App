package com.ddas.todoapp

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ToDoViewModel: ViewModel() {

    private var _toDoList = MutableLiveData<List<ToDo>>()
    val toDoList : LiveData<List<ToDo>> = _toDoList

    fun getAllToDo() {
        _toDoList.value = ToDoManager.getAllToDo().reversed()
    }

    fun addToDo(title: String) {
        ToDoManager.addToDo(title)
        getAllToDo()
    }

    fun deleteToDo(id: Int) {
        ToDoManager.deleteToDo(id)
        getAllToDo()
    }
}