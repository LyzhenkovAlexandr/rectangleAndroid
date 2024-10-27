package com.example.myapplication

import androidx.lifecycle.ViewModel

class RectanglesViewModel : ViewModel() {
    val items = mutableListOf<Int>()

    fun addItem() {
        items += items.size
    }
}
