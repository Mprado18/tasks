package com.example.tasks.service.listener

import com.example.tasks.service.model.HeaderModel

interface APIListener {
    fun onSuccess(model: HeaderModel)

    fun onFailure(message: String)
}