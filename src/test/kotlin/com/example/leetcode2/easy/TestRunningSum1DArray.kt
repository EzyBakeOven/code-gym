package com.example.leetcode2.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class TestRunningSum1DArray {

    private val runningSum1DArray: RunningSum1DArray = RunningSum1DArray()

    @Test
    fun test_solution_baseCase() {
        val input = intArrayOf(3,1,2,10,1)
        val result = runningSum1DArray.solution(input)
        assertEquals("Output: [3,4,6,16,17]", runningSum1DArray.displayOutput(result))
    }

    @Test
    fun test_solution_minAndMax() {
        val input = intArrayOf(-1000000,1,2,10,1000000)
        val result = runningSum1DArray.solution(input)
        assertEquals("Output: [-1000000,-999999,-999997,-999987,13]", runningSum1DArray.displayOutput(result))
    }

    @Test
    fun test_solution_emptyArray() {
        val input = intArrayOf()
        val result = runningSum1DArray.solution(input)
        assertEquals("Output: []", runningSum1DArray.displayOutput(result))
    }
}