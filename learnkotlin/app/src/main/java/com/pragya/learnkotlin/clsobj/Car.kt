package com.pragya.learnkotlin.clsobj

class Car{
    var speed =10 //state
    fun speedUp() = speed++ //behaviour that affects state //this is an inline function
    fun putNthGear(n:Int){  //behaviour
        println("Speed is ${speedUp()*n}")
    }
}

fun main(){
    val c=Car()  //object of class Car
    c.speedUp()  //method call on object
    c.putNthGear(2)  //method call on object
}