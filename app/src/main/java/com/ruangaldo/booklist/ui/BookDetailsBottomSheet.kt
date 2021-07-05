package com.ruangaldo.booklist.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.ruangaldo.booklist.R
import com.ruangaldo.booklist.data.model.Book
import com.ruangaldo.booklist.databinding.FragmentBookDetailsBottomSheetBinding

class BookDetailsBottomSheet : BottomSheetDialogFragment() {

    companion object {
        const val TAG = "BookDetailsBottomSheet"
    }

    private var _bookData: Book? = null
    private var _binding: FragmentBookDetailsBottomSheetBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentBookDetailsBottomSheetBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        if (arguments != null) {
            _bookData = requireArguments().getParcelable("bookData")
        }

        _bookData?.let {
            _binding?.apply {
                ivBookDetails.setImageResource(it.img)
                tvBookTitle.text = it.title
                tvBookAuthor.text = it.author
                tvSynopsisBook.text = it.synopsis
                tvDateBook.text = it.date
                tvPublisher.text =it.publisher
                tvIsbn.text = it.isbn
            }
        }
    }
}