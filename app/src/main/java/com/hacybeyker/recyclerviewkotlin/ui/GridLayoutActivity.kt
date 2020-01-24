package com.hacybeyker.recyclerviewkotlin.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.hacybeyker.recyclerviewkotlin.R
import com.hacybeyker.recyclerviewkotlin.adapter.LayoutAdapter
import com.hacybeyker.recyclerviewkotlin.entities.getWallpapers
import kotlinx.android.synthetic.main.activity_grid_layout.*

class GridLayoutActivity : AppCompatActivity() {

    private var layoutAdapter: LayoutAdapter = LayoutAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grid_layout)

        recycler_view_grid.adapter = layoutAdapter
        recycler_view_grid.setHasFixedSize(true)
        recycler_view_grid.layoutManager = GridLayoutManager(this, 3)
        //recycler_view_linear.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))
        layoutAdapter.items = getWallpapers()
    }
}
