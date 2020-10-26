package com.maxsch.viewlecture

import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private val itemAdapter = ItemAdapter()

    private val data = listOf(
        SomeDataClass("1"),
        SomeDataClass("2"),
        SomeDataClass("3"),
        SomeDataClass("4"),
        SomeDataClass("5"),
        SomeDataClass("6"),
        SomeDataClass("too"),
        SomeDataClass("many"),
        SomeDataClass("items")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.frame_layout)

        findViewById<CustomView>(R.id.custom).setOnClickListener {
            (it as CustomView).apply {
                changeState(
                    when (state) {
                        SampleViewState.NOT_CLICKED -> SampleViewState.CLICKED_ONCE
                        SampleViewState.CLICKED_ONCE -> SampleViewState.CLICKED_MANY_TIMES
                        SampleViewState.CLICKED_MANY_TIMES -> SampleViewState.CLICKED_MANY_TIMES
                    }
                )
            }
        }

        findViewById<Button>(R.id.recyclerButton).setOnClickListener {
            setContentView(R.layout.recycler_layout)
            findViewById<RecyclerView>(R.id.recycler).apply {
                adapter = itemAdapter
                itemAdapter.updateItems(data)
            }
        }
    }
}