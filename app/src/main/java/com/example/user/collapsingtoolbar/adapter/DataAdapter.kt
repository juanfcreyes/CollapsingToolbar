package com.example.user.collapsingtoolbar.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.user.collapsingtoolbar.R
import com.example.user.collapsingtoolbar.fillings.Cheese

class DataAdapter(private var  cheeses: ArrayList<Cheese> )  : RecyclerView.Adapter<DataViewHolder>() {

    init {
        this.cheeses = cheeses
    }

    override fun getItemCount(): Int = cheeses.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataViewHolder {
        val inflater: LayoutInflater  =  LayoutInflater.from(parent.context)
        val cheeseView: View = inflater.inflate(R.layout.filling_item, parent, false)
        return DataViewHolder(cheeseView)
    }

    override fun onBindViewHolder(dataViewHoler: DataViewHolder, position: Int) {
        val cheese: Cheese = this.cheeses.get(position)
        val imageView: ImageView = dataViewHoler.itemImageView!!
        imageView.setImageResource(cheese.getImage())
        val textView: TextView = dataViewHoler.itemTextView!!
        textView.text = cheese.getName()
    }

    fun removeItem(position: Int) {
        this.cheeses.removeAt(position)
        notifyItemRemoved(position)
        notifyItemRangeChanged(position, cheeses.size)
    }

}