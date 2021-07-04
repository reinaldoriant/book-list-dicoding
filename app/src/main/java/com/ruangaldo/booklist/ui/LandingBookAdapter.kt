package com.ruangaldo.booklist.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ruangaldo.booklist.R
import com.ruangaldo.booklist.data.model.Book
import com.ruangaldo.booklist.data.model.BookList
import com.ruangaldo.booklist.databinding.ItemBookListBinding
import com.ruangaldo.booklist.databinding.ItemTitleBinding


class LandingBookAdapter(val bookList: List<Any>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    companion object {
        const val ITEM_TITLE = 0
        const val ITEM_BOOK_LIST = 1
    }

    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when (viewType) {
            ITEM_TITLE -> {
                MenuItemHeaderActionHolder(
                    LayoutInflater.from(parent.context).inflate(
                        R.layout.item_title,
                        parent, false
                    )
                )
            }
            ITEM_BOOK_LIST -> {
                MenuItemBookListHolder(
                    LayoutInflater.from(parent.context).inflate(
                        R.layout.item_book_list,
                        parent, false
                    )
                )
            }

            else -> throw throw IllegalArgumentException("Undefined view type")
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder.itemViewType) {
            ITEM_TITLE -> {
                val headerHolder = holder as MenuItemHeaderActionHolder
                headerHolder.bindContent(bookList[position] as String)
            }
            ITEM_BOOK_LIST -> {
                val headerHolder = holder as MenuItemBookListHolder
                headerHolder.bindContent(bookList[position] as BookList)
            }
            else -> throw IllegalArgumentException("Undefined view type")
        }
    }

    override fun getItemCount() = bookList.size

    override fun getItemViewType(position: Int): Int {
        return when (bookList[position]) {
            is String -> ITEM_TITLE
            is BookList -> ITEM_BOOK_LIST
            else -> throw IllegalArgumentException("Undefined view type")
        }
    }

    inner class MenuItemHeaderActionHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val titleBinding = ItemTitleBinding.bind(itemView)
        fun bindContent(title: String) {
            titleBinding.tvTitle.text = title
        }
    }

    inner class MenuItemBookListHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val bookListBinding = ItemBookListBinding.bind(itemView)
        fun bindContent(bookList: BookList) {
            val childLayoutManager = LinearLayoutManager(
                itemView.context,
                LinearLayoutManager.HORIZONTAL,
                false
            )

            val adapterBookCategory = BookListCategoryAdapter(bookList.bookResult)

            adapterBookCategory.setOnItemClickCallback(object :
                BookListCategoryAdapter.OnItemClickCallback {
                override fun onItemClick(data: Book) {
                    onItemClickCallback.onItemClickBook(data, ITEM_BOOK_LIST)
                }
            })

            with(bookListBinding) {
                rvBookList.apply {
                    onFlingListener = null
                    layoutManager = childLayoutManager
                    setRecycledViewPool(RecyclerView.RecycledViewPool())
                    isNestedScrollingEnabled = false
                    adapter = adapterBookCategory
                }
            }
        }
    }

    interface OnItemClickCallback {
        fun onItemClickBook(data: Book, type: Int)
    }

}


