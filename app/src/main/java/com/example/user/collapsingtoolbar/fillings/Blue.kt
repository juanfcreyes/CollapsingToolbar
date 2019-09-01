package com.example.user.collapsingtoolbar.fillings

import com.example.user.collapsingtoolbar.R

class Blue : Cheese() {

    override fun getName(): String = "Blue"

    override fun getImage(): Int = R.drawable.blue

    override fun getKCal() : Int = 100

    override fun isVegetarian() : Boolean = true

    override fun getPrice() : Float = 2.75f

}

