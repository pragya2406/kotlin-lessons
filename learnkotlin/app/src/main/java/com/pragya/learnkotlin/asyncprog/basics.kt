package com.pragya.learnkotlin.asyncprog

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

private fun demo1() {
    println()
    print("one ")
    print("two ")
//    print("three ")
//    print("four ")

    Thread {
        print("three ")
        print("four ")
    }.start()

    print("five ")
    print("six ")
    println()
}

private fun demo2() {
    runBlocking { //  hey thread  I am blocking for executing below co-routines
        println("one")
        println("two")

        launch {
            println("three")
            println("four")
        }

        launch {
            println("five")
            println("six")
        }

        launch {
            println("seven")
            println("eight")
        }
//        delay(1500)
        println("nine")
        println("ten")
    }
}

private fun demo3() {
    runBlocking {
        launch { demoCode() }
    }
}
//if you remove runblocking, suspend will be required
private suspend fun demoCode() {
    for(i in 1..100) {
        delay(700) // suspended function
        println("  $i")
    }
}
private fun demo4() {
    runBlocking {
        demoCoScp()
    }
}

private suspend fun demoCoScp() {
    coroutineScope {
        println("one")
        println("two")
        launch {
            println("three")
            println("four")
        }
        println("five")
        println("six")
    }
}

private fun job1(){
    runBlocking {
        val job = launch {
            delay(1500)
            println("world")
        }
            println("hello")
            job.join() //until job is complete wait here
            println("job complete")
    }
}

fun main() {
    //demo3()
    job1()

//    val t1 = Thread {
//
//    }
//    t1.start()
//    t1.suspend()
//    t1.state
}



//private suspend fun demo3() {
//    demoCode()
//    }
//}
////if you remove runblocking, suspend will be required
//private suspend fun demoCode() {
//    for(i in 1..100) {
//        delay(700) // suspended function
//        println("  $i")
//    }
//}
//
//fun suspend main() {
//    //demo1()
////    demo2()
//    demo3()
//} Because suspend function can only be called inside another coroutine