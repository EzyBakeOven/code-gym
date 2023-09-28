package com.example.leetcode2.hard

import MedianOfTwoSortedArrays
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest


@SpringBootTest
class TestMedianOfTwoSortedArrays {

    private val medianOfTwoSortedArrays: MedianOfTwoSortedArrays = MedianOfTwoSortedArrays()

    @Test
    fun test_findMedianSortedArrays_odd() {
        val result = medianOfTwoSortedArrays.findMedianSortedArrays(intArrayOf(1, 3), intArrayOf(2))
        Assertions.assertEquals(2.0, result)
    }

    @Test
    fun test_findMedianSortedArrays_even() {
        val result = medianOfTwoSortedArrays.findMedianSortedArrays(intArrayOf(1, 2), intArrayOf(3, 4))
        Assertions.assertEquals(2.5, result)
    }

    @Test
    fun test_getSortedArray_odd() {
        val result = medianOfTwoSortedArrays.getSortedArray(intArrayOf(1, 3), intArrayOf(2))
        Assertions.assertArrayEquals(intArrayOf(1, 2), result)
    }

    @Test
    fun test_getSortedArray_even() {
        val result = medianOfTwoSortedArrays.getSortedArray(intArrayOf(1, 2), intArrayOf(3, 4))
        Assertions.assertArrayEquals(intArrayOf(1, 2, 3), result)
    }

    @Test
    fun test_getSortedArraySize_baseCaseOdd() {
        val result = medianOfTwoSortedArrays.getSortedArraySize(1, 2)
        Assertions.assertEquals(2, result)
    }

    @Test
    fun test_getSortedArraySize_baseCaseEven() {
        val result = medianOfTwoSortedArrays.getSortedArraySize(2, 2)
        Assertions.assertEquals(3, result)
    }

}