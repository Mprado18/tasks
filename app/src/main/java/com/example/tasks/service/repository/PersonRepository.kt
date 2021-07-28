package com.example.tasks.service.repository

import com.example.tasks.service.repository.remote.PersonService
import com.example.tasks.service.repository.remote.RetrofitClient

class PersonRepository {

    val remote = RetrofitClient.createService(PersonService::class.java)

    fun login(email: String, password: String) {
        //remote.login(email, password)
    }

}