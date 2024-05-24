package com.example.hellojetpackcompose.model

/**
 * Bambang Harianto Sianturi
 * 3. Highest Palindorm
 */

fun main() {
    val inputString = "3743"
    val k = 1
    val result = highestPalindrome(inputString, k).toString()
    println("Output: $result")
}

fun highestPalindrome(s: String, k: Int): String {
    fun findPalindrome(s: String, k: Int, idx: Int, pal: String, maxPal: String): String {
        if (k < 0) return "-1"
        if (idx >= s.length / 2) {
            val newPal = pal + (if (s.length % 2 == 0) "" else s[s.length / 2]) + pal.reversed()
            return if (newPal > maxPal) newPal else maxPal
        }
        val maxDigit = maxOf(s[idx], s[s.length - 1 - idx])
        val newPal = if (s[idx] != s[s.length - 1 - idx]) pal + maxDigit else pal + s[idx]
        return findPalindrome(
            s,
            if (s[idx] != s[s.length - 1 - idx]) k - 1 else k,
            idx + 1,
            newPal,
            maxPal
        )
    }

    return findPalindrome(s, k, 0, "", s)
}
