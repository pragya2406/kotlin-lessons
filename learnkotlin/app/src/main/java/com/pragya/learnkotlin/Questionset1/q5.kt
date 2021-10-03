package com.pragya.learnkotlin.Questionset1


private fun normal(FlArr: FloatArray){
    val nums = FlArr
    for ( i in nums.indices )
    {
        println(" index = $i, value = ${nums[i]*nums[i]}")
    }

}
private fun lambdafn(arr:FloatArray)
{
    for (i in arr.indices) {
        println("${arr[i]*arr[i]}")
    }
}
val anony= fun(arr:FloatArray) {for(i in arr.indices){println("${arr[i]*arr[i]}")}}
fun main()
{

    val arr = floatArrayOf(2.0F,4.0F,5.5F,8.9F)
    println("normal fn")
    normal(arr)
    println("lambda fn")
    lambdafn(arr)
    println("anonymous fn")
    anony(arr)
}


