package com.example.user.collapsingtoolbar.fillings

import com.example.user.collapsingtoolbar.R

class Camembert: Cheese() {

    override fun getName(): String = "Camembert"

    override fun getImage(): Int = R.drawable.camembert

    override fun getKCal() : Int = 165

    override fun isVegetarian() : Boolean = true

    override fun getPrice() : Float = 3.00f

}