package com.example.campusequipmentrentalapp.data

import com.example.campusequipmentrentalapp.model.*;

object  UserSession {

    var currentUser : User? = null
        private set

    /** Login **/
        fun login(user: User) {

            currentUser = user
        }

        /** Logout **/
        fun logout() {

            currentUser = null
        }

        /** Check login status **/
   //   val isLoggedIn1: Boolean
   //     get() = currentUser != null


    fun isLoggedIn(): Boolean {
        return currentUser != null
    }



}