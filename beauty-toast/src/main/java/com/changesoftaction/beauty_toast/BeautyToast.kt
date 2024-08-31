package com.changesoftaction.beauty_toast

import android.content.Context
import android.widget.Toast

class BeautyToast {

   companion object {
        fun showToast(context: Context, message: String) {
            Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
        }
    }
}