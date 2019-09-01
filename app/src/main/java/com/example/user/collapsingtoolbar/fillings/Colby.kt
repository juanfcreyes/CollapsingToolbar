package com.example.user.collapsingtoolbar.fillings

import com.example.user.collapsingtoolbar.R

class Colby : Cheese() {

    override fun getName(): String = "Colby"

    override fun getImage(): Int = R.drawable.colby

    override fun getKCal() : Int = 64

    override fun isVegetarian() : Boolean = true

    override fun getPrice() : Float = 1.32f

}