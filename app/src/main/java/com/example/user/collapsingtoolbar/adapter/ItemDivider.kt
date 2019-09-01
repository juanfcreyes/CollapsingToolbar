package com.example.user.collapsingtoolbar.adapter

import android.content.Context
import android.content.res.TypedArray
import android.graphics.Canvas
import android.graphics.drawable.Drawable
import android.support.v4.content.ContextCompat
import android.support.v7.widget.RecyclerView
import android.view.View

class ItemDivider() : RecyclerView.ItemDecoration() {

    private val ATTRS : IntArray = intArrayOf(android.R.attr.listDivider)
    private lateinit var divider: Drawable

    constructor(context: Context) : this() {
        val styledAttributes : TypedArray = context.obtainStyledAttributes(ATTRS)
        divider = styledAttributes.getDrawable(0)
        styledAttributes.recycle()
    }

    constructor(context: Context, resourceId: Int) : this() {
        divider = ContextCompat.getDrawable(context, resourceId)!!
    }

    override fun onDraw(canvas: Canvas, parent: RecyclerView, state: RecyclerView.State) {
        val leftStart: Int = parent.paddingLeft
        val rigthEnd: Int = parent.width - parent.paddingRight
        val count: Int = parent.childCount
        for(i:Int in 0..count - 1 ) {
            val child: View = parent.getChildAt(i)
            val params: RecyclerView.LayoutParams = child.layoutParams as RecyclerView.LayoutParams
            val top: Int = child.top + params.bottomMargin
            val bottom: Int = top + divider.intrinsicHeight
            divider.setBounds(leftStart, top, rigthEnd, bottom)
            divider.draw(canvas)
        }
    }

}