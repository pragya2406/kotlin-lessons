package com.pragya.learnkotlin.Questionset1

fun normal(FlArr: FloatArray){
    val nums = FlArr
    for ( i in nums.indices )
    {
        println(" index = $i, value = ${nums[i]*nums[i]}")
    }

}
fun main()
{

    val arr = floatArrayOf(2.0F,4.0F,5.5F,8.9F)
    normal(arr)
}