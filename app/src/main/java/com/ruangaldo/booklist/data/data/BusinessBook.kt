package com.ruangaldo.booklist.data.data

import com.ruangaldo.booklist.R
import com.ruangaldo.booklist.data.model.Book

object BusinessBook {
    val book: List<Book>
        get() = mutableListOf(
            Book(
                "Atomic Habits: An Easy & Proven Way to Build Good Habits & Break Bad Ones",
                "James Clear",
                "Penguin",
                "16 October 2018",
                "9780735211308",
                R.drawable.img_atomic_habits,
                "No matter your goals, Atomic Habits offers a proven framework for improving--every day. James Clear, one of the world's leading experts on habit formation, reveals practical strategies that will teach you exactly how to form good habits, break bad ones, and master the tiny behaviors that lead to remarkable results."
            ), Book(
                "Majalah Akses Edisi ke-6: Jurus Jitu Bisnis di Jepang",
                "Direktorat Jenderal Asia Pasifik Kementerian Luar Negeri",
                "Majalah Akses",
                "01 October 2007",
                "-",
                R.drawable.img_akses,
                "Majalah Akses merupakan majalah non-profit yang dibiayai oleh Pemenrintah Indonesia dan di produksi/ditulis oleh pegawai Direktorat Jenderal Asia Pasifik (aspasaf) Kementerian Luar Negeri. Tujuan Majalah ini untuk memberikan informasi / akses kepada Usaha Mikro Kecil Menengah (UMKM) terhadap pasar luar negeri"
            ),
            Book(
                "The Psychology of Money: Timeless lessons on wealth, greed, and happiness",
                "Morgan Housel",
                "Harriman House Limited",
                "08 September 2020",
                "9780857197696",
                R.drawable.img_psychology_money,
                "Doing well with money isn’t necessarily about what you know. It’s about how you behave. And behavior is hard to teach, even to really smart people."
            ),
            Book(
                "Show Your Work!: 10 Ways to Share Your Creativity and Get Discovered",
                "Austin Kleon",
                "Workman Publishing",
                "16 Maret 2014",
                "9780761181361",
                R.drawable.img_show_work,
                "In his New York Times bestseller Steal Like an Artist, Austin Kleon showed readers how to unlock their creativity by “stealing” from the community of other movers and shakers. Now, in an even more forward-thinking and necessary book, he shows how to take that critical next step on a creative journey—getting known."
            ),
            Book(
                "Warren Buffett and the Interpretation of Financial Statements: The Search for the Company with a Durable Competitive Advantage",
                "Mary Buffett",
                "Simon and Schuster",
                "14 October 2008",
                "9781416575955",
                R.drawable.img_warren_buffett,
                "Mary Buffett is the coauthor of Scribner’s bestselling Buffettology series, a sought-after business speaker world-wide, and a contributor to HuffPost and the online magazine Thrive Global. Mary and Sean Seah recently launched the Buffett Online School (BuffettOnlineSchool.com), a monthly webinar sharing investment insights and helping students learn to build successful stock portfolios."
            )
        )
}