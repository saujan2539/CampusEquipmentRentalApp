package com.example.campusequipmentrentalapp.data.local


import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase


@Database(
    entities = [RentalEntity::class, UserEntity::class, EquipmentEntity::class],
    version = 2,
    exportSchema = false
)
abstract class AppDatabase : RoomDatabase()
{
    /**
         * Handles RentalDao connection
         * */
        abstract fun rentalDao(): RentalDao

        /**
         * Handles UserDao connection
         * */
        abstract fun userDao(): UserDao

        /**
         * Handles EquipmentDao connection
         * */
        abstract fun equipmentDao(): EquipmentDao


        companion object {
            private var instance: AppDatabase? = null

            /** Uses the same DB across the whole app */
        fun getDatabase(context: Context): AppDatabase {
            return instance ?: synchronized(this) {
                val _instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "campus_rental_database"
                ).build()
                instance = _instance
                _instance
            }
         }
        }
}