package com.example.user.collapsingtoolbar.fillings

abstract class Cheese : Filling {
    abstract override fun getName() : String
    abstract override fun getImage(): Int
    abstract override fun getKCal() : Int
    abstract override fun isVegetarian() : Boolean
    abstract override fun getPrice() : Float
}