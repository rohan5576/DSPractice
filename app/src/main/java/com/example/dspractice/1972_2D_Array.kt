package com.example.dspractice

//1972 leetcode richest customer wealth 2d array problem
fun main(args:Array<String>){

    var twoDArrayList = arrayOf(
        intArrayOf(1,4,7,8),
        intArrayOf(1,2,3,8)
    )

   var amount = maxWealth(twoDArrayList)
    var amount1 = usingBuiltInFunction(twoDArrayList)
    println("max wealth $amount $amount1")

}

private fun maxWealth(twoDArrayList: Array<IntArray>) : Int {
    var maxWealth = 0
    for (customers in twoDArrayList) {
        var currentWealth = 0
        for (amount in customers) {
            currentWealth += amount
        }
        if (currentWealth > maxWealth) {
            maxWealth = currentWealth
        }
    }
    return  maxWealth
}

fun usingBuiltInFunction(array: Array<IntArray>) :Int{
   return array.maxOfOrNull(IntArray::sum)?:0
}