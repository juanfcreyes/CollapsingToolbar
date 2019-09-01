package com.example.user.collapsingtoolbar.adapter

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.example.user.collapsingtoolbar.R
class DataViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    var itemImageView: ImageView? = itemView.findViewById(R.id.item_image)
    var itemTextView: TextView? = itemView.findViewById(R.id.item_name)

}