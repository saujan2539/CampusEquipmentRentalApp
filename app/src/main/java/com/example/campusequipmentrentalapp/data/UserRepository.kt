package com.example.campusequipmentrentalapp.data

//import com.example.campusequipmentrentalapp.data.EquipmentRepository.equipmentList
import com.example.campusequipmentrentalapp.model.*

class UserRepository {

    val userList:List<User> = listOf(

        User(1,
            "20260010",
            "Minsoo Kim",
            "Computer Software Department",
            UserRole.STUDENT),

        User(2,"prof01",
            "Prof. Park",
            "Computer Software Department",
            UserRole.PROFESSOR),

        User(3, "assist01",
            "Assistant Lee",
            "Computer Software Department",
            UserRole.ASSISTANT),

        User(4,
            "20260011",
            "Gildong Hong",
            "Computer Software Department",
            UserRole.STUDENT)

    )

    fun findByLoginId(id:String) : User ?= userList.find{ user -> user.userId == id}

}