package com.example.leetcode2.easy

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class TestRichestCustomerWealth {

    private val richestCustomerWealth: RichestCustomerWealth = RichestCustomerWealth()

    @Test
    fun test_solution_baseCase() {
        val input = arrayOf(
            intArrayOf(7, 1, 3),
            intArrayOf(2, 8, 7),
            intArrayOf(1, 9, 5)
        )
        val result = richestCustomerWealth.solution(input)
        Assertions.assertEquals("Output: 17", richestCustomerWealth.displayOutput(result))
    }

}