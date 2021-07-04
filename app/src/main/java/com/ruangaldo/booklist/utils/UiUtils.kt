package com.ruangaldo.booklist.utils

import android.content.Context
import android.util.TypedValue
import android.view.View
import android.view.ViewGroup

object UiUtils {
    fun View.marginLeft(left: Float? = null) {
        layoutParams<ViewGroup.MarginLayoutParams> {
            left?.run { leftMargin = dpToPx(this) }
        }
    }

    fun View.marginRight(right: Float? = null) {
        layoutParams<ViewGroup.MarginLayoutParams> {
            right?.run { rightMargin = dpToPx(this) }

        }
    }

    private fun View.dpToPx(dp: Float): Int = context.dpToPx(dp)
    fun Context.dpToPx(dp: Float): Int =
        TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, resources.displayMetrics).toInt()

    inline fun <reified T : ViewGroup.LayoutParams> View.layoutParams(block: T.() -> Unit) {
        if (layoutParams is T) block(layoutParams as T)
    }
}
