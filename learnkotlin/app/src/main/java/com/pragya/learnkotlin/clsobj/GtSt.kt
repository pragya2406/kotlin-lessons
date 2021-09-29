package com.pragya.learnkotlin.clsobj


class GtSt (
    private var xPos : Int,
    private var yPos : Int
        ) {
    var x: Int
    get() = this.xPos
    set(value){this.xPos = value}

    var y: Int
    get() = this.yPos
        set(value){this.xPos = value}
}

fun main(){
    val gt1=GtSt(10,56) //get() is called
    gt1.x=10 //set(value) is called
    println("${gt1.x}")
}