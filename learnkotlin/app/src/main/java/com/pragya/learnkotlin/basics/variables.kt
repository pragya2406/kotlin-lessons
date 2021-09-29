package com.pragya.learnkotlin.basics


import kotlin.math.sqrt

fun main() {
    var age = 10
    age = 20
    //age = true // it is knowing type internally

    val sal: Int = 20 // you write the type or you don't write the type
//    sal = 14

    val sr: String = "data science"
    val dbl: Double = 56.5
    val flt: Float = 89.5f
    val bln: Boolean = true
    val lng: Long = 9223372036854775807
    val byt: Byte = 20

    println("String = $sr Double = $dbl")
    println("\n String = $sr \n Double = $dbl \n Float = $flt \n Boolean = $bln ")
    println("\n Addition = ${ 10 + 20 } ")
    println("\n Square Root = ${ sqrt(25.6) } ")
}