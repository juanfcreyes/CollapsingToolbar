package com.example.user.collapsingtoolbar.fillings

import com.example.user.collapsingtoolbar.R


class American : Cheese() {

    override fun getName(): String = "America"

    override fun getImage(): Int = R.drawable.american

    override fun getKCal() : Int = 86

    override fun isVegetarian() : Boolean = true

    override fun getPrice() : Float = 2.50f

}