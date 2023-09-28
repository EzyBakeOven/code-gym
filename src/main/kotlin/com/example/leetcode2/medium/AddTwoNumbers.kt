package com.example.leetcode2.medium

import org.springframework.stereotype.Service
import java.lang.StringBuilder
import java.util.*

/**
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse
 * order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
 *
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 *
 * https://leetcode.com/problems/add-two-numbers/
 */
@Service
class AddTwoNumbers {

    fun addTwoNumbers(list1: LinkedList<Int>, list2: LinkedList<Int>): String {
        val inputLine = this.createInputLine(list1, list2)
        val totalFromList1 = this.createTotal(list1)
        val totalFromList2 = this.createTotal(list2)
        return inputLine +
                this.createOutputLine(totalFromList1 + totalFromList2) +
                this.createExplanationLine(totalFromList1, totalFromList2)
    }

    fun createInputLine(list1: LinkedList<Int>, list2: LinkedList<Int>): String {
        return "Input: l1 = $list1, l2 = $list2"
    }

    fun createTotal(list: LinkedList<Int>): Int {
        val numberString = StringBuilder()
        while (list.size != 0) {
            numberString.append(list.removeLast())
        }
        return numberString.toString().toInt()
    }

    fun createOutputLine(totalSum: Int): String {
        val totalSumAsString = totalSum.toString()
        val outputArray = IntArray(totalSumAsString.length)
        for ((arrayIndex, intChar) in totalSumAsString.toCharArray().reversed().withIndex()) {
            outputArray[arrayIndex] = intChar.toString().toInt()
        }
        return "Output: ${outputArray.contentToString().replace(" ", "")}"
    }

    fun createExplanationLine(list1Total: Int, list2Total: Int): String {
        return "Explanation: $list1Total + $list2Total = ${list1Total + list2Total}."
    }

}
