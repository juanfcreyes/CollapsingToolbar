package com.example.user.collapsingtoolbar.fillings

import com.example.user.collapsingtoolbar.R

class Mozzarella : Cheese() {

    override fun getName(): String = "Mozzarella"

    override fun getImage(): Int = R.drawable.mozzarella

    override fun getKCal() : Int = 57

    override fun isVegetarian() : Boolean = true

    override fun getPrice() : Float = 1.00f

}