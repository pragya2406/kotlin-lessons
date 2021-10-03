package com.pragya.learnkotlin.Questionset1


fun main(){
    infix fun Unit.ntimes(n: Int) :String {
        return "Let's Learn Kotlin".repeat(n)
    }
    println(Unit.ntimes(5))
}