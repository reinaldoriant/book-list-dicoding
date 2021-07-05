package com.ruangaldo.booklist.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ruangaldo.booklist.data.data.BookData
import com.ruangaldo.booklist.data.model.Book
import com.ruangaldo.booklist.databinding.ActivityLandingBookBinding

class LandingBookActivity : AppCompatActivity() {
    private lateinit var _binding: ActivityLandingBookBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityLandingBookBinding.inflate(layoutInflater)
        setContentView(_binding.root)

        val adapter = LandingBookAdapter(BookData.BookList)

        _binding.apply {
            rvContent.adapter = adapter
            adapter.setOnItemClickCallback(object : LandingBookAdapter.OnItemClickCallback {
                override fun onItemClickBook(data: Book, type: Int) {
                    when (type) {
                        LandingBookAdapter.ITEM_BOOK_LIST -> {

                        }
                    }
                }
            })

            ibUser.setOnClickListener {
                startActivity(Intent(this@LandingBookActivity, AccountActivity::class.java))
                finish()
            }

            ibLanding.setOnClickListener {
                onBackPressed()
            }
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        finish()
    }
}