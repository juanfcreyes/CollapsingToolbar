package com.example.user.collapsingtoolbar.fillings

import com.example.user.collapsingtoolbar.R

class Cheddar: Cheese() {

    override fun getName(): String = "Cheddar"

    override fun getImage(): Int = R.drawable.cheddar

    override fun getKCal() : Int = 97

    override fun isVegetarian() : Boolean = true

    override fun getPrice() : Float = 1.00f

}