package com.example.user.collapsingtoolbar.fillings

import com.example.user.collapsingtoolbar.R

class Brie : Cheese() {

    override fun getName(): String = "Brie"

    override fun getImage(): Int = R.drawable.brie

    override fun getKCal() : Int = 55

    override fun isVegetarian() : Boolean = true

    override fun getPrice() : Float = 1.25f

}