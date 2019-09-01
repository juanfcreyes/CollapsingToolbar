package com.example.user.collapsingtoolbar.fillings

import com.example.user.collapsingtoolbar.R

class Feta : Cheese() {

    override fun getName(): String = "Feta"

    override fun getImage(): Int = R.drawable.feta

    override fun getKCal() : Int = 172

    override fun isVegetarian() : Boolean = true

    override fun getPrice() : Float = 3.50f

}