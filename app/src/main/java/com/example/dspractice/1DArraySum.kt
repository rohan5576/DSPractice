package com.example.dspractice

//Return sum of the 1D array
//[1,2,3,4]
// output : [1,3,6,10]

fun main(args:Array<String>){

    var arrayList = intArrayOf(1,2,3,4)
    for (i in 1 until arrayList.size){
        arrayList[i]= arrayList[i-1]+arrayList[i]
    }
    println("sum of 1D array ${arrayList.contentToString()}")
}
