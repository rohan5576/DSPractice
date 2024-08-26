package com.example.dspractice

fun main(args:Array<String>){
    var array = intArrayOf(1,7,3,6,5,6)
    val string : List<String> = fizzBuzz(array)
    println("Sum string $string")
}

fun fizzBuzz(array: IntArray): List<String> {
     var result = mutableListOf<String>()
       for (i in 1..array.size){
            var isDivisibleBy3= i%3==0
            var isDivisibleBy5= i%5==0
           when{
               isDivisibleBy5 && isDivisibleBy3 -> result.add("FizzBuzz")
               isDivisibleBy3 -> result.add("Fizz")
               isDivisibleBy5 -> result.add("Buzz")
               else -> result.add(i.toString())

           }
       }
    return result
}
