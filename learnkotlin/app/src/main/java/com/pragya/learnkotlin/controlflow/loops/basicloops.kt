package com.pragya.learnkotlin.controlflow.loops


fun demo1() {
    for (i in 1..10) { // count based
        println("i = $i")
    }

    for (i in 10.downTo(0).step( 3)) { // normal
        println("i = $i")
    }

    for (i in 10 downTo 0 step 3 ) { // infix one
        println("i = $i")
    }
}

fun demo2() {
    val nums = intArrayOf(56, 89, 23, 78, 65, 20, 12, 103)

    for ( i in nums.indices ) {
        println(" index = $i, value = ${nums[i]}")
    }

    for (value in nums) {
        println("value = $value")
    }

    for( (index, value) in nums.withIndex() ) {
        println("Index ${index}, Value = $value")
    }
}

fun demo3() {

    var i = 0
    while(i < 10) {
        i = i + 1
        println("I is $i")
    }

    var j = 0
    do {
        j = j + 1
        println("J is $j")
    }while( j < 10 )
}


fun main() {
    demo3()
}