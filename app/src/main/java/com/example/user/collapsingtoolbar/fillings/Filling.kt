package com.example.user.collapsingtoolbar.fillings

interface Filling {
    fun getName() : String
    fun getImage(): Int
    fun getKCal() : Int
    fun isVegetarian() : Boolean
    fun getPrice() : Float
}