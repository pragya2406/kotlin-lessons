package com.pragya.learnkotlin.controlflow.conditionals


import java.util.Scanner as Scn
import java.util.Date as Dt

// for taking input you can use
// - scanner from java
// - use kotlins native feature readLine

fun demo1(){
    val os= readLine()
    if(os.equals("10")) {
        println("JellyBean")
    } else if(os.equals("9")){
        println("Pie")
    } else {
        print("Android ")
    }
}

fun demo2(){
    val os = readLine()
    when(os){
        "10"->println("JellyBean")
        "9"->print("Pie")
        "8","7" -> println("Oreo")
        else -> print("android")
    }
}

fun demo3() {
    println("Enter Name")
    val nm = readLine()

    val info = if(nm.equals("android")) 11 else 30
    val dt = when(nm){
        "123" -> 123
        else -> 23
    }

    println("Info $info, Dt $dt")
}

fun demo4() {
    val safeNums = intArrayOf(45, 89, 50)
    val `when` = 10  //can use existing keywords as variable names with the use of backticks
    println("When is ${`when`}")

    val sc = Scn(System.`in`)
    println("Enter your Number")
    val num = sc.nextInt()

    when(num) {
        in 1..10 -> println("it is in range")
        !in 96..100 -> println("it is not in safe range")
        in safeNums -> println("it is in safe range")
        else -> println("invalid number")
    }
}
fun main()
{
    println("What version is your android")
    demo4()
}