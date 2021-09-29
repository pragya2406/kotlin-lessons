package com.pragya.learnkotlin.clsobj

private interface ClickListener {  //an abstract contract that connects the ClickListener
// and the mouse class, so that the onClick functionality can be used by the mouse class
    var pos : Int
    fun onClick()
}

private open class Device

private abstract class JoyStick : ClickListener

private class Mouse : Device(), ClickListener { //extends device and implements ClickListener
//first class, then interface
//can work even without ClickListener, but onClick() will not be accessible
    override var pos: Int = 10 //pos is a property of click listener

    override fun onClick() = println("Mouse Clicked")

    fun move() {
        println("Moving")
    }
}

fun main() {
    val ms = Mouse()
    ms.move()
    ms.onClick()
}