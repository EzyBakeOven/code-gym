package com.example.leetcode2

import com.example.leetcode2.easy.RichestCustomerWealth
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class LeetCode2Application

/**
 * To run all solutions you can run the unit tests. This only runs the last problem I was on.
 */
fun main(args: Array<String>) {
    runApplication<LeetCode2Application>(*args)
    val question2 = RichestCustomerWealth();
    val question1Answer = question2.solution(arrayOf(
        intArrayOf(7, 1, 3),
        intArrayOf(2, 8, 7),
        intArrayOf(1, 9, 5)
    ))
    println(question2.displayOutput(question1Answer))
}
