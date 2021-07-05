package com.ruangaldo.booklist.data.model

import android.os.Parcel
import android.os.Parcelable

data class Book(
    val title: String?,
    val author: String?,
    val publisher: String?,
    val date: String?,
    val isbn: String?,
    val img: Int,
    val synopsis: String?
): Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readInt(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(title)
        parcel.writeString(author)
        parcel.writeString(publisher)
        parcel.writeString(date)
        parcel.writeString(isbn)
        parcel.writeInt(img)
        parcel.writeString(synopsis)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Book> {
        override fun createFromParcel(parcel: Parcel): Book {
            return Book(parcel)
        }

        override fun newArray(size: Int): Array<Book?> {
            return arrayOfNulls(size)
        }
    }
}
