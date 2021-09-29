package com.pragya.learnkotlin.Questionset1


fun main()
{
//   question 1: variable that can hold any value
    var anyvalue = 10
//question 2- variable that holds function
    val multiply : (Int, Int) -> Int = {a:Int, b:Int -> a*b}
//question 3 - passing a function as a parameter in another function
    fun q3(
        str:String,fn : (Int,Int) ->Int
    ){
        fn(10,10)
        println("kotlin multiplication is ${fn(10,10)}")
    }
    q3("kotlin",multiply)
//    question 4 - Declare a function which returns another function which returns current date
//    fun dt(){
//        return
//    }

    //fun q4(){
//        val currentDateTime = LocalDateTime.now()
//        print("$currentDateTime")


    }
//}