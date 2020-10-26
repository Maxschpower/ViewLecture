package com.maxsch.viewlecture

enum class SampleViewState {
    NOT_CLICKED,
    CLICKED_ONCE,
    CLICKED_MANY_TIMES;

    companion object {
        fun getFromOrdinal(ordinal: Int) = values()[ordinal]
    }
}