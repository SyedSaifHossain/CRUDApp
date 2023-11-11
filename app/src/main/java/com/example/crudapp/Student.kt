package com.example.crudapp

import java.sql.Timestamp

data class Student(
    val id:String? = null,
    val studentId:String? = null,
    val name:String? = null,
    val email:String? = null,
    val subject:String? = null,
    val birthdate:String? = null,
    val timestamp: Timestamp?= null
)