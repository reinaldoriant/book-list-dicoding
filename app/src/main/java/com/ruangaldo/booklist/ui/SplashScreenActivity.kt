package com.ruangaldo.booklist.ui

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.ruangaldo.booklist.databinding.ActivitySplashScreenBinding

class SplashScreenActivity : AppCompatActivity() {
    private lateinit var _binding: ActivitySplashScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivitySplashScreenBinding.inflate(layoutInflater)
        setContentView(_binding.root)

        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, LandingBookActivity::class.java)
            startActivity(intent)
            finish()
        }, 3000)
    }
}