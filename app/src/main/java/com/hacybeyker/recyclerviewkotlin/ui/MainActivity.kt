package com.hacybeyker.recyclerviewkotlin.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hacybeyker.recyclerviewkotlin.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_linear_layout_vertical.setOnClickListener {
            startActivity(Intent(applicationContext, LinearLayoutVerticalActivity::class.java))
        }

        button_linear_layout_horizontal.setOnClickListener {
            startActivity(Intent(applicationContext, LinearLayoutHorizontalActivity::class.java))
        }

        button_grid_layout.setOnClickListener {
            startActivity(Intent(applicationContext, GridLayoutActivity::class.java))
        }

        button_staggered_grid_layout.setOnClickListener {
            startActivity(Intent(applicationContext, StaggeredLayoutActivity::class.java))
        }
    }
}
