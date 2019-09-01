package com.example.user.collapsingtoolbar.fillings

import com.example.user.collapsingtoolbar.R

class Edam : Cheese() {

    override fun getName(): String = "Edam"

    override fun getImage(): Int = R.drawable.edam

    override fun getKCal() : Int = 136

    override fun isVegetarian() : Boolean = true

    override fun getPrice() : Float = 1.68f

}