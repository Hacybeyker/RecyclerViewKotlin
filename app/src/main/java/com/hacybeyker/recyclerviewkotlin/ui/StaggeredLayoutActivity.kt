package com.hacybeyker.recyclerviewkotlin.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.hacybeyker.recyclerviewkotlin.R
import com.hacybeyker.recyclerviewkotlin.adapter.LayoutAdapter
import com.hacybeyker.recyclerviewkotlin.entities.getWallpapers
import kotlinx.android.synthetic.main.activity_staggered_layout.*

class StaggeredLayoutActivity : AppCompatActivity() {

    private var layoutAdapter: LayoutAdapter = LayoutAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_staggered_layout)

        recycler_view_staggered.adapter = layoutAdapter
        recycler_view_staggered.setHasFixedSize(true)
        recycler_view_staggered.layoutManager = StaggeredGridLayoutManager(2, 1)
        //recycler_view_linear.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))
        layoutAdapter.items = getWallpapers()
    }
}
