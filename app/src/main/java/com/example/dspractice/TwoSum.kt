package com.example.dspractice

import android.util.Log

//https://leetcode.com/problems/two-sum/description/
 class Solution {
    fun twoSum(nums: IntArray?, target: Int): IntArray {
       val mHashMap  = mutableMapOf<Int,Int>()

        nums?.forEachIndexed { index, i ->
            mHashMap[i]?.let { return intArrayOf(it,index) }
            mHashMap[i] = index
        }
        return intArrayOf()
    }
}

fun main(args: Array<String>) {

    val solution = Solution()
    val nums = intArrayOf(2, 7, 11, 15)
    val target = 9
        val result = solution.twoSum(nums, target)
        println("Indices: [${result[0]}, ${result[1]}]")

}