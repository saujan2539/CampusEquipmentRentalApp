package com.example.campusequipmentrentalapp.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface UserDao {

    /** Add a user */
        @Insert
        suspend fun insertUser(userEntity: UserEntity): Long

        /** Get all users */
        @Query("SELECT * FROM users ORDER BY id DESC")
        suspend fun getUsersAll(): List<UserEntity>

        /** Find user by user ID */
    @Query("SELECT * FROM users WHERE userId = :userId LIMIT 1")
    suspend fun getUserId(userId: String): UserEntity?
}
