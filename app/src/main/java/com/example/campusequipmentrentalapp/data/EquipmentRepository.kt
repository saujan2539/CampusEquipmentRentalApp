package com.example.campusequipmentrentalapp.data

import com.example.campusequipmentrentalapp.model.Equipment
import com.example.campusequipmentrentalapp.model.RentalStatus

//Sample data repository used in place of a database.
object EquipmentRepository {

    val equipmentList :List<Equipment> = listOf(
        Equipment(
            id = 1,
            name = "Laptop",
            category = "Computers",
            icon = "💻",
            status = RentalStatus.AVAILABLE,
            maxRentalDays = 3,
            location = "Media Building Room 604",
            description = "A Windows laptop you can use for class presentations and team projects."
        ),
        Equipment(
            id = 2,
            name = "Tablet",
            category = "Mobile",
            icon = "📱",
            status = RentalStatus.AVAILABLE,
            maxRentalDays = 2,
            location = "Media Building Room 604",
            description = "An Android tablet you can use for notes, e-books, and mobile app testing."
        ),
        Equipment(
            id = 3,
            name = "Webcam",
            category = "Video",
            icon = "📷",
            status = RentalStatus.RENTED,
            maxRentalDays = 3,
            location = "Department Office",
            description = "A Full HD webcam you can use for online presentations and video recording."
        ),
        Equipment(
            id = 4,
            name = "Tripod",
            category = "Camera",
            icon = "🎬",
            status = RentalStatus.AVAILABLE,
            maxRentalDays = 5,
            location = "Media Building Room 605",
            description = "An adjustable-height tripod for smartphones and small cameras."
        ),
        Equipment(
            id = 5,
            name = "Projector",
            category = "Presentation",
            icon = "📽️",
            status = RentalStatus.MAINTENANCE,
            maxRentalDays = 1,
            location = "Department Office",
            description = "A portable projector for team presentations and events. Currently under maintenance."
        ),
        Equipment(
            id = 6,
            name = "VR Device",
            category = "Immersive Media",
            icon = "🥽",
            status = RentalStatus.AVAILABLE,
            maxRentalDays = 1,
            location = "AI Lab",
            description = "A standalone VR device for experiencing VR content and testing capstone projects."
        ),
        Equipment(
            id = 7,
            name = "Wireless Microphone",
            category = "Audio",
            icon = "🎤",
            status = RentalStatus.AVAILABLE,
            maxRentalDays = 2,
            location = "Department Office",
            description = "A rechargeable wireless microphone for presentations, recording, and events."
        ),
        Equipment(
            id = 8,
            name = "Portable Speaker",
            category = "Audio",
            icon = "🔊",
            status = RentalStatus.RENTED,
            maxRentalDays = 2,
            location = "Department Office",
            description = "A Bluetooth speaker for small events and project demos."
        )



    )
    fun findById(id:Int) : Equipment ?= equipmentList.find{ equipment -> equipment.id == id}


}






