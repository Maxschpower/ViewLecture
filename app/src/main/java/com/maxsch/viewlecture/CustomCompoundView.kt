package com.maxsch.viewlecture

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout

class CustomCompoundView @JvmOverloads constructor(
    context: Context,
    attributeSet: AttributeSet? = null
) : FrameLayout(context, attributeSet) {

    init {
        LayoutInflater.from(context).inflate(R.layout.custom_compound_view, this, true)
    }
}