package com.jetpack_compose.delegation

import android.content.Context
import android.widget.Toast

interface toast{
    fun showToast(c: Context, msg: String)
}

class CreateToastImpl: toast {
    override fun showToast(c: Context, msg: String) {
        Toast.makeText(c,""+msg, Toast.LENGTH_LONG).show()
    }



}