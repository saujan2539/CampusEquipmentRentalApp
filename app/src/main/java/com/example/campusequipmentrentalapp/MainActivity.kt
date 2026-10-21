package com.example.campusequipmentrentalapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.navigation.ActivityNavigator
import com.example.campusequipmentrentalapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
       // setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // code additions/modifications --by seoyk 2026.09.29
                /*
                * 1. Measure the status bar height: precisely measures the top status bar height, which differs per device (e.g., 48dp).
                * 2. Reserve a safe area (Safe Area): adds padding to the top of the root view equal to the status bar height,
                * automatically pushing UI elements down into a tappable safe zone below the status bar.
                * The UI does not overlap the system bars, and finger touches hit the button views correctly,
                * so click events work.
                * */
        ViewCompat.setOnApplyWindowInsetsListener(binding.root) {
            v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}