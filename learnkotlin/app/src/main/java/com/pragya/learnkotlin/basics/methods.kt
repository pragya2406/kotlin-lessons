package com.pragya.learnkotlin.basics


fun simple(): Int { // How to return value ?  returning int
    return 10
}

fun addition(
    num1: Int,
    num2: Int
): Int { // How to pass parameters and return ? accepting two parameters and returning int
    return num1 + num2
}

fun rtnTyp(): Unit {
    println("Just Call")
}

fun nTimes(num:Int,n:Int) = n*num //inline function
infix fun Unit.sq(n: Int) = n * n

fun defaultValues( //indentation would be like this
    num1:Int=30,
    num2:Int= 20
) :String {
    return "Num1 = ${num1},Num2 = ${num2}"
}

fun multiple(vararg strs : String) { // variable arguments
    println(strs.contentToString())
}

fun main() {

    multiple("one")
    multiple("one", "two")
    multiple("one", "two", "three")
    multiple("one", "two", "three", "four")
    val dt = simple()
    println("Dt is $dt")
    println("Addition is $(addition(12,13)}")
    rtnTyp()
    println("10 times 3 is ${nTimes(10,3)}")

    println("defaultValues() ${defaultValues()}" )
    println("defaultValues(89,56) ${defaultValues(89,56)}")
    println("defaultValues(num2 = 4555, num1 = 10) ${defaultValues(num2 = 4555, num1 = 10)}") // named parameters
    println("defaultValues(num2 = 878) ${defaultValues(num2 = 878)}")

    println("square is ${Unit sq 2}")
    println("square is ${Unit.sq(2)}")

}