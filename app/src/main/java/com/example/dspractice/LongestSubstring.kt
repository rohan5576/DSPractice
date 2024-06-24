package com.example.dspractice

class LongestSubstring {

    fun longestString(s: String): Int {
        var start = 0
        var end = 0
        var maxCount = 0
        val hashSet = HashSet<Char>()

        while (start < s.length) {
            if (!hashSet.contains(s[start])) {
                hashSet.add(s[start])
                start++
                maxCount = Math.max(maxCount, start - end)
            } else {
                hashSet.remove(s[end])
                end++
            }
        }
        return maxCount
    }

}

fun main(args: Array<String>){
    val longestSubstring = LongestSubstring()
    val string = "ILLovePuneCity"
   val count = longestSubstring.longestString(string)
    println("Count of longest String $count")
}