package com.example.leetcode2.medium

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import java.util.*

@SpringBootTest
class TestAddTwoNumbers {
    @Autowired
    private val addTwoNumbers: AddTwoNumbers = AddTwoNumbers()
    
    @Test
    fun test_addTwoNumbers_baseCase_success() {
        val list1 = LinkedList<Int>()
        list1.add(2)
        list1.add(4)
        list1.add(3)
        val list2 = LinkedList<Int>()
        list2.add(5)
        list2.add(6)
        list2.add(4)
        val start = System.currentTimeMillis()
        val testResult = addTwoNumbers.addTwoNumbers(list1, list2)
        val computationTime = System.currentTimeMillis() - start
        println("Computation took: $computationTime ms")
        assert(
            testResult.contains("Input: l1 = [2, 4, 3], l2 = [5, 6, 4]" +
                    "Output: [7,0,8]" +
                    "Explanation: 342 + 465 = 807.")
        )
    }

    @Test
    fun test_createOutput() {
        val testResult = addTwoNumbers.createOutputLine(807);
        assert(testResult == "Output: [7,0,8]")
    }
}