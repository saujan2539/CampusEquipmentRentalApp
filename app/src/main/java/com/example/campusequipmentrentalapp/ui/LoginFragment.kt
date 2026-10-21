package com.example.campusequipmentrentalapp.ui

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.campusequipmentrentalapp.R
import com.example.campusequipmentrentalapp.data.UserRepository
import com.example.campusequipmentrentalapp.data.UserSession
import com.example.campusequipmentrentalapp.databinding.FragmentLoginBinding


class LoginFragment :
    Fragment(R.layout.fragment_login) {


    private var _binding:
            FragmentLoginBinding? = null


    private val binding:
            FragmentLoginBinding
        get() = _binding!!


    override fun onViewCreated(
        view: View,
        savedInstanceState: Bundle?
    ) {

        super.onViewCreated(
            view,
            savedInstanceState
        )


        _binding =   FragmentLoginBinding.bind(view)


        binding.btnLogin
            .setOnClickListener {


                // Entered ID
                val loginId =
                    binding.etLoginId
                        .text
                        .toString()
                        .trim()


                // Check for empty value
                if (loginId.isEmpty()) {

                    binding.etLoginId.error =
                        "Please enter your user ID."

                    binding.etLoginId
                        .requestFocus()

                    return@setOnClickListener
                }


                // Find user
                val user = UserRepository().findByLoginId(loginId)


                // Unregistered user
                if (user == null) {

                    Toast.makeText(
                        requireContext(),
                        "Unregistered user.",
                        Toast.LENGTH_SHORT
                    ).show()

                    return@setOnClickListener
                }


                // Login success
                UserSession.login(
                    user
                )


                Toast.makeText(
                    requireContext(),
                    "${user.name}, login successful",
                    Toast.LENGTH_SHORT
                ).show()


                // Navigate to Home
                findNavController()
                    .navigate(
                        R.id
                            .action_loginFragment_to_homeFragment
                    )
            }
    }


    override fun onDestroyView() {

        super.onDestroyView()

        _binding = null
    }
}