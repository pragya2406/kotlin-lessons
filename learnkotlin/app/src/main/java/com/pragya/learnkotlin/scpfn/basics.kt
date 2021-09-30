package com.pragya.learnkotlin.scpfn

private class Person(
     val name: String,
     var age: Int,
     var city: String
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

    val list = listOf<String?>("abc", "pqr", "lmn", null, "ghh", "nnm")
    list.forEach { el ->
//        using null safety operator ?,
//        if el is not null, go into the .let{} block
        el?.let {
            println(it.uppercase())
        }
    }
}
private fun demo2(){
//    context object is passes as argument
//    but inside lambda available as receiver (this)
//    return value is the lambda result
    val p =Person("abc",12,"nnn")
    with(p){
        age = 13
        city = "jjj"
        this.celebrateBirthday()
        this.moveTo("newplace")
    }

}

fun main() {
demo2()

}