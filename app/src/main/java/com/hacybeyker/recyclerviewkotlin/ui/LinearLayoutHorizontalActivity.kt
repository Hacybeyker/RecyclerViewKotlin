package com.hacybeyker.recyclerviewkotlin.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.hacybeyker.recyclerviewkotlin.R
import com.hacybeyker.recyclerviewkotlin.adapter.LayoutAdapter
import com.hacybeyker.recyclerviewkotlin.entities.getWallpapers
import kotlinx.android.synthetic.main.activity_linear_layout_vertical.*

class LinearLayoutHorizontalActivity : AppCompatActivity() {

    private var layoutAdapter: LayoutAdapter = LayoutAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_linear_layout_horizontal)

        recycler_view_linear.adapter = layoutAdapter
        recycler_view_linear.setHasFixedSize(true)
        recycler_view_linear.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        layoutAdapter.items = getWallpapers()
    }
}
