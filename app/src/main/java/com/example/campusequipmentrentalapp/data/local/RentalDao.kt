package com.example.campusequipmentrentalapp.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface RentalDao {

    /** Save a rental request **/
        @Insert
        suspend  fun insert(rentalEntity: RentalEntity): Long

        /** Get all rental requests
         * */
        @Query("SELECT * FROM rentals ORDER BY id DESC")
        suspend  fun getAll(): List<RentalEntity>


        /** Get rental requests by user **/
    @Query("SELECT * FROM rentals WHERE userId = :userId ORDER BY id DESC")
    suspend   fun getByUserId(userId: String): List<RentalEntity>

}