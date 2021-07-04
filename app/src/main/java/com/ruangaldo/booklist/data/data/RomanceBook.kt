package com.ruangaldo.booklist.data.data

import com.ruangaldo.booklist.R
import com.ruangaldo.booklist.data.model.Book

object RomanceBook {
    val book: List<Book>
        get() = mutableListOf(
            Book(
                "NIGHT DREAMER",
                "Legawa Marwa",
                "Legawa Marwa",
                "30 December 2018",
                "-",
                R.drawable.img_night_dream,
                "Katniss Everdeen, Clove Kentwell, Glimmer Belcourt, Johanna Mason, Finch Crossley, Madge Undersee, Delly Cartwright and Annie Cresta are starting high school. They're going headfirst into new friendships, new boys, and a lot of new drama."
            ), Book(
                "Sendiri dan Selalu: Alone and Always",
                "Adnan Adawi",
                "Adnan Adawi",
                "22 November 2020",
                "-",
                R.drawable.img_sendiri_selalu,
                "Angelica hurry up with water please,my mother yelled. I'm coming I'm coming I had to warm it up, I said walking in with the warm pot of water."
            ),
            Book(
                "The Apple Orchard (A Bella Vista novel, Book 1)",
                "Susan Wiggs",
                "HarperCollins UK",
                "14 May 2013",
                "9781472017994",
                R.drawable.img_apple_orchard,
                "#1 New York Times bestselling author Susan Wiggs brings readers into the lush abundance of Sonoma County, in a story of sisters, friendship and the invisible bonds of history that are woven like a spell around us. "
            )
            ,Book(
                "He's Cancelled: A totally laugh-out-loud and uplifting romantic comedy",
                "Sophie Ranald",
                "Bookouture",
                "23 June 2021",
                "9781800196520",
                R.drawable.img_he_cancel,
                "‘I absolutely LOVED it… What an absolutely fantastic laugh-a-minute must-read!!! Absolutely loved it!!!… Was absolutely unputdownable so make sure you clear your schedules before starting to read it!!… Made me laugh out loud so many times I lost count… A HUGE success!!! I loved every page.’ bookworm86, ⭐⭐⭐⭐⭐"
            ),
            Book(
                "Served Hot",
                "Annabeth Albert",
                "Lyrical Press",
                "03 March 2015",
                "9781601833921",
                R.drawable.img_served_hot,
                "Mary Buffett is the coauthor of Scribner’s bestselling Buffettology series, a sought-after business speaker world-wide, and a contributor to HuffPost and the online magazine Thrive Global. Mary and Sean Seah recently launched the Buffett Online School (BuffettOnlineSchool.com), a monthly webinar sharing investment insights and helping students learn to build successful stock portfolios."
            )
        )
}