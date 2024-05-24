package com.example.hellojetpackcompose.model

/**
 * Bambang Harianto Sianturi
 * 2. Balanced Bracket
 */

fun main() {
    val mInput = "{ ( ( [ ] ) [ ] ) [ ] }"
    println(isBalancedBracket(mInput))
}

fun isBalancedBracket(mInput: String): String {
    val stack = mutableListOf<Char>()
    val matchingBrackets = mapOf(')' to '(', '}' to '{', ']' to '[')

    for (char in mInput) {
        when (char) {
            '(', '{', '[' -> stack.add(char)
            ')', '}', ']' -> {
                if (stack.isEmpty() || stack.removeAt(stack.size - 1) != matchingBrackets[char]) {
                    return "NO"
                }
            }
        }
    }

    return if (stack.isEmpty()) "YES" else "NO"
}