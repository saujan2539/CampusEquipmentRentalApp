package com.example.campusequipmentrentalapp.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * A single rental request
 * saved to the SQLite rentals table
 *
 * */

@Entity(
    tableName =  "rentals"
)
data class RentalEntity (

    /* primary key, DB auto-increment */
        @PrimaryKey(autoGenerate = true)
        val id: Long = 0,

        /*equipment number*/
        val equipmentId: Int,

        /*user ID of the applicant */
        val userId: String,

        /* rental period */
        val rentalDays: Int,

        /* rental purpose */
        val purpose : String,

        /* rental status */
        val status : String

    )