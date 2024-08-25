package com.example.dspractice

//https://leetcode.com/problems/find-the-middle-index-in-array/description/
//https://leetcode.com/problems/find-pivot-index/

fun main(args:Array<String>){
    var array = intArrayOf(1,7,3,6,5,6)
    val index = findPivotIndex(array)
    println("Sum index $index")
}

private fun findPivotIndex(array: IntArray):Int {
    var left = 0
    var right = array.sum()

    array.forEachIndexed { index, value ->
        right -= value
        if (left == right) return index
        left +=value
    }
    return  -1
}