package com.hacybeyker.recyclerviewkotlin.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.hacybeyker.recyclerviewkotlin.R
import com.hacybeyker.recyclerviewkotlin.entities.Wallpaper
import kotlinx.android.synthetic.main.recycler_item.view.*

class LayoutAdapter : RecyclerView.Adapter<LayoutAdapter.LinearLayoutHolder>() {

    var items: List<Wallpaper> = arrayListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LinearLayoutHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.recycler_item, parent, false)
        return LinearLayoutHolder(view)
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: LinearLayoutHolder, position: Int) {
        val item: Wallpaper = items[position]
        holder.bind(item)
    }

    class LinearLayoutHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val picture = itemView.image_view_picture
        private val title = itemView.text_view_title
        private val description = itemView.text_view_description

        fun bind(item: Wallpaper) {
            Glide.with(itemView.context).load(item.picture).into(picture)
            title.text = item.title
            description.text = item.description
        }
    }
}