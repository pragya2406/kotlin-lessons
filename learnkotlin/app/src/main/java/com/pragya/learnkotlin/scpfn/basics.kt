package com.pragya.learnkotlin.scpfn

private class Person(
    private val name: String,
    private var age: Int,
    private var city: String
) {
    fun moveTo(newCity : String) {
        this.city = newCity
    }

    fun celebrateBirthday() {
        age++
    }
}

fun demo1() {
    val p = Person("abc",12,"vvv")
    p.celebrateBirthday()

    val q = Person("abc",12,"vvv")
    q.moveTo("lll")
    p.celebrateBirthday()

    // The scope functions do not introduce any new technical capabilities,
    // but they can make your code more concise and readable.

//    the scope of the object is within the let {} code block,
//    it is done to keep "person" related functionalities together
    Person(
        "bcd",
        89,
        "nnn"
    ).let {
        it.moveTo("kkk")
        it.celebrateBirthday()
    }
}

fun main() {


}