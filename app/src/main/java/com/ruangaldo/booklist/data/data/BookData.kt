package com.ruangaldo.booklist.data.data

import com.ruangaldo.booklist.data.model.BookList

object BookData {
    val BookList: List<Any>
        get() = mutableListOf(
            "Buku Cerita",
            BookList(bookResult = StoryBook.StoryBook, category = "Buku Cerita")
        )

}