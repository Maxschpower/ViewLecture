package com.maxsch.viewlecture

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ItemViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    private var textView: TextView = view.findViewById(R.id.textView)

    fun bind(data: SomeDataClass) {
        textView.text = data.data
    }
}