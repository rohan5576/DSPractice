package com.example.brushup

fun main(args:Array<String>){
  val arrayList = intArrayOf(1,6,3,6,8,9,7,4,3,2,4)
  val target = 10
  var (index1,index2,values) = twoSumInt(arrayList,target)
  println("index : [$index1, $index2]")
  println("index values : [${values[0]}, ${values[1]}]")
}

fun twoSumInt(arrayList: IntArray, target: Int): Triple<Int,Int,IntArray> {
   val mutableMap = mutableMapOf<Int,Int>()

  arrayList.forEachIndexed { index, num ->
    val compliment = target - num
    mutableMap[compliment]?.let { currentIndex-> return Triple(currentIndex,index,
      intArrayOf(arrayList[currentIndex], arrayList[index])
    ) }
    mutableMap[num] = index

  }
  throw IllegalArgumentException("No two sum solution")
}

