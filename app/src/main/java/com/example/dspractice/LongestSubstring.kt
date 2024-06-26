package com.example.dspractice

class LongestSubstring {

    fun longestString(s: String): Pair<Int,String> {
        var start = 0
        var end = 0
        var maxCount = 0
        var subString = ""
        val hashSet = HashSet<Char>()

        while (start < s.length) {
            if (!hashSet.contains(s[start])) {
                hashSet.add(s[start])
                start++
               if(start-end > maxCount){
                   maxCount = start - end
                   subString = s.substring(end,start)
               }
            } else {
                hashSet.remove(s[end])
                end++
            }
        }
        return Pair(maxCount,subString)
    }

}

fun main(args: Array<String>){
    val longestSubstring = LongestSubstring()
    val string = "ILLovePLuneCity"
   val count = longestSubstring.longestString(string)
    println("Length: ${count.first}, Substring: '${count.second}'")
}