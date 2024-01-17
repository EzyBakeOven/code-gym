package com.example.leetcode2.easy

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class TestMergeStringsAlternately {

    private val mergeStringsAlternately: MergeStringsAlternately = MergeStringsAlternately()

    @Test
    fun test_merge_string_sameLength_success() {
        val mergedString = mergeStringsAlternately.mergeAlternately("abc", "pqr")
        val expectedString = "apbqcr"
        Assertions.assertEquals(expectedString, mergedString)
    }

    @Test
    fun test_merge_string_word2Longer_success() {
        val mergedString = mergeStringsAlternately.mergeAlternately("ab", "pqrs")
        val expectedString = "apbqrs"
        Assertions.assertEquals(expectedString, mergedString)
    }

    @Test
    fun test_merge_string_word1Longer_success() {
        val mergedString = mergeStringsAlternately.mergeAlternately("abcd", "pq")
        val expectedString = "apbqcd"
        Assertions.assertEquals(expectedString, mergedString)
    }
}