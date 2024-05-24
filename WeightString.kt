package com.example.hellojetpackcompose.model

/**
 * Bambang Harianto Sianturi
 * 1. Weight from String
 */

fun main() {
    val mInput = "abbcccd"
    val mQueries = listOf(1, 3, 9, 8)
    val mResult = weightedStrings(mInput, mQueries)
    println(mResult)

}

fun weightedStrings(mInput: String, mQueries: List<Int>): List<String> {
    val weights = calculateWeightString(mInput)
    return mQueries.map { if (it in weights) "Yes" else "No" }
}

fun calculateWeightString(mInput: String): Set<Int> {
    val weights = mutableSetOf<Int>()
    var count = 1
    for (i in mInput.indices) {
        if (i > 0 && mInput[i] == mInput[i - 1]) {
            count++
        } else {
            count = 1
        }
        weights.add(getCharWeight(mInput[i]) * count)
    }
    return weights
}

fun getCharWeight(mInputElement: Char): Int {
    return mInputElement - 'a' + 1
}