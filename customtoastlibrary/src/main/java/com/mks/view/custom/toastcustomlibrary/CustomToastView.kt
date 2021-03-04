package com.mks.view.custom.toastcustomlibrary

import android.content.Context
import android.widget.Toast



fun showToast(c: Context?, message: String?) {
    Toast.makeText(c, message, Toast.LENGTH_SHORT).show()
}