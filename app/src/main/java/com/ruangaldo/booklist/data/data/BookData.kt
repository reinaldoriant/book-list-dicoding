package com.ruangaldo.booklist.data.data

import com.ruangaldo.booklist.data.model.BookList

object BookData {
    val BookList: List<Any>
        get() = mutableListOf(
            "Anak-anak",
            BookList(bookResult = StoryBook.book, category = "Anak-anak"),
            "Bisnis dan Ekonomi",
            BookList(bookResult = BusinessBook.book, category = "Bisnis dan Ekonomi"),
            "Romansa",
            BookList(bookResult = RomanceBook.book, category = "Romansa"),
            "Komik",
            BookList(bookResult = ComicsBook.book, category = "Komik"),
            "Biografi",
            BookList(bookResult = BiographyBook.book, category = "Biografi")
        )

}