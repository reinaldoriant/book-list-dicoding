package com.ruangaldo.booklist.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ruangaldo.booklist.R
import com.ruangaldo.booklist.data.model.Book
import com.ruangaldo.booklist.databinding.ItemBookListCategoryBinding
import com.ruangaldo.booklist.utils.UiUtils.marginLeft
import com.ruangaldo.booklist.utils.UiUtils.marginRight


class BookListCategoryAdapter(val bookList: List<Book>) :
    RecyclerView.Adapter<BookListCategoryAdapter.ViewHolder>() {


    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val binding = ItemBookListCategoryBinding.bind(view)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.item_book_list_category, parent, false)
    )

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        with(holder) {
            with(binding) {
                tvBookTitle.text = bookList[position].title
                tvAuthor.text = bookList[position].author
                ibImageBook.apply {
                    setImageResource(bookList[position].img)
                    setOnClickListener {
                        onItemClickCallback.onItemClick(bookList[position])
                    }
                }
                val space = 16
                when (position) {
                    0 -> {
                        clBook.marginLeft(space.toFloat())
                    }
                    bookList.size - 1 -> {
                        clBook.marginRight(space.toFloat())
                    }
                }
            }
        }
    }

    override fun getItemCount(): Int = bookList.size

    interface OnItemClickCallback {
        fun onItemClick(data: Book)
    }
}