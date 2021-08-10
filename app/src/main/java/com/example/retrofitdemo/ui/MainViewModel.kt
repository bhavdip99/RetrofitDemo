package com.example.retrofitdemo.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.example.retrofitdemo.repository.MainRepository
import com.example.retrofitdemo.utils.Resource
import kotlinx.coroutines.Dispatchers

class MainViewModel(private val repository: MainRepository) : ViewModel() {
    fun getUsers() = liveData(Dispatchers.IO) {
        emit(Resource.loading(data = null))
        try {
            emit(Resource.success(data = repository.getUsers()))
        } catch (exception: Exception) {
            emit(Resource.error(data = null, message = exception.message ?: "Error Occurred!"))
        }
    }
}