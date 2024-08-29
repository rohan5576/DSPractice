package com.example.dspractice
var steps =0
fun main(args:Array<String>){

    val num = findStepsToReduceItToZero(14)
    println("Num of steps $num")
}

fun findStepsToReduceItToZero(num: Int): Int {

    if(num == 0) return steps
    steps++
    if (num%2==0) return findStepsToReduceItToZero(num/2)
     else findStepsToReduceItToZero(num-1)
    return steps
}
