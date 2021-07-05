package com.ruangaldo.booklist.data.data

import com.ruangaldo.booklist.R
import com.ruangaldo.booklist.data.model.Book

object ComicsBook {
    val book: List<Book>
        get() = mutableListOf(
            Book(
                "Sapiens Graphic Novel: Volume 1",
                "Yuval Noah Harari",
                "Random House",
                "12 November 2020",
                "9781473582910",
                R.drawable.img_sapiens,
                "Prof Yuval Noah Harari has a PhD in History from the University of Oxford and now lectures at the Hebrew University of Jerusalem, specialising in World History. Sapiens: A Brief History of Humankind has become an international phenomenon attracting a legion of fans from Bill Gates and Barack Obama to Chris Evans and Jarvis Cocker, and is published in sixty languages worldwide."
            ), Book(
                "The Art of Sea of Thieves",
                "Rare Microsoft Studios",
                "Dark Horse Comics",
                "27 March 2018",
                "9781630087951",
                R.drawable.img_the_art,
                "A high-quality collectible art book featuring over 200 pages of behind-the-scenes content from the hotly anticipated, shared-world video game Sea of Thieves!"
            ),
            Book(
                "Dragon Soul: 30 Years of Dragon Ball Fandom",
                "Derek Padula",
                "Derek Padula",
                "02 June 2015",
                "9781943149018",
                R.drawable.img_dragon,
                "With a foreword from Christopher Sabat and Sean Schemmel, Dragon Soul: 30 Years of Dragon Ball Fandom is a grand celebration of the world's greatest anime and manga and it's momentous 30th Anniversary.  "
            ),
            Book(
                "That Time I Got Reincarnated as a Slime 16",
                "Taiki Kawakami",
                "Kodansha America LLC",
                "16 March 2014",
                "9780761181361",
                R.drawable.img_slime,
                "In the aftermath of Rimuru’s ascension to Demon Lord, his friends and allies are taken aback by his newfound power, but even more shocked at the return of the dreaded Storm Dragon, Veldora. "
            ),
            Book(
                "Reincarnated as a Sword (Manga) Vol. 6",
                "Yuu Tanaka",
                "Seven Seas Entertainment",
                "1 June 2021",
                "9781416575955",
                R.drawable.img_reincarnated,
                "After finishing their mission alongside Amanda, Fran and her sword, Teacher, have leveled up in all kinds of ways. Together with their fluffy companion Jet, they're off to seek new adventures in the Kingdom of Ulmutt. But on their way, they encounter a strange and curious peril: a dungeon in the sky, atop a floating island!"
            )
        )
}