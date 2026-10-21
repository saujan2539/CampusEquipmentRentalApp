package com.example.campusequipmentrentalapp.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface EquipmentDao {

    /** Add equipment */
        @Insert
        suspend fun insertEquipment(equipmentEntity: EquipmentEntity): Long

        /** Get all equipment */
        @Query("SELECT * FROM equipments ORDER BY id DESC")
        suspend fun getEquipmentsAll(): List<EquipmentEntity>

        /** Get equipment by ID */
    @Query("SELECT * FROM equipments WHERE id = :id LIMIT 1")
    suspend fun getEquipmentId(id: Int): EquipmentEntity?
}
