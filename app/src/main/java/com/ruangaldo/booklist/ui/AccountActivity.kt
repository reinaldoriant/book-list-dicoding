package com.ruangaldo.booklist.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ruangaldo.booklist.R
import com.ruangaldo.booklist.databinding.ActivityAccountBinding
import com.ruangaldo.booklist.databinding.ActivityLandingBookBinding

class AccountActivity : AppCompatActivity() {
    private lateinit var _binding: ActivityAccountBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityAccountBinding.inflate(layoutInflater)
        setContentView(_binding.root)

        _binding.ibAccount.setOnClickListener {
           onBackPressed()
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        startActivity(Intent(this@AccountActivity,LandingBookActivity::class.java))
        finish()
    }
}