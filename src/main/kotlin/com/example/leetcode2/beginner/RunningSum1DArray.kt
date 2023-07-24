package com.example.leetcode2.beginner

/**
 * Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]...nums[i]).
 *
 * Constraints:
 *  - The number of nodes in the list is in the range [1, 1000]
 *  - The value of each element in the array is in the range [-10^6, 10^6]
 *
 *  Notes:
 *  - Because we are using an IntArray, we do not have to check for nulls or values that are not Ints.
 *  - Instead of using a sum function I could have used the += value operator
 */
class RunningSum1DArray {

    /**
     * Runs the solution for the problem.
     * Time Complexity: O(n) - we go over every element in the array
     * Space Complexity: O(1) - we do not create any data structures proportional to our input.
     */
    fun solution(nums: IntArray): IntArray {
        nums.forEachIndexed { index, value ->
            if ((index + 1) < nums.size) {
                nums[index + 1] = sum(value, nums[index + 1])
            }
        }
        return nums;
    }

    /**
     * Displays the expected output for the challenge.
     */
    fun displayOutput(nums: IntArray): String {
        val formattedOutput = StringBuilder()
        formattedOutput.append("Output: [")
        if (nums.isEmpty()) {
            formattedOutput.append("]")
        }
        nums.mapIndexed { index, value ->
            if (index < 1) {
                formattedOutput.append(value)
            } else if (index == nums.size - 1) {
                formattedOutput.append(",", value)
                formattedOutput.append("]")
            } else {
                formattedOutput.append(",", value)
            }
        }
        return formattedOutput.toString()
    }

    /**
     * Returns the sum of two integers
     */
    private fun sum(a: Int, b: Int): Int {
        return a + b;
    }
}