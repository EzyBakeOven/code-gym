package com.example.leetcode2.easy

/**
 * You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with
 * word1. If a string is longer than the other, append the additional letters onto the end of the merged string.
 *
 * Return the merged string.
 *
 * https://leetcode.com/problems/merge-strings-alternately/description/?envType=study-plan-v2&envId=leetcode-75
 *
 */
class MergeStringsAlternately {

    /**
     * Time Complexity: O(N)
     * Space Complexity: O(N)
     */
    fun mergeAlternately(word1: String, word2: String): String {
        val shortestWord = shortestString(word1, word2)
        val mergedWordBuilder = StringBuilder()
        var endIndex = 0;

        for (charIndex in shortestWord.indices) {
            mergedWordBuilder.append(word1[charIndex])
            mergedWordBuilder.append(word2[charIndex])
            endIndex = charIndex
        }
        if (word1.length != word2.length) {
            val longestString = longestString(word1, word2)
            mergedWordBuilder.append(longestString.removeRange(0, endIndex + 1))
        }

        return mergedWordBuilder.toString()
    }

    private fun shortestString(word1: String, word2: String): String {
        return if (word1.length < word2.length) word1
        else word2
    }

    private fun longestString(word1: String, word2: String): String {
        return if (word1.length > word2.length) word1
        else word2
    }
}