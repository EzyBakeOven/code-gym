package com.example.leetcode2.beginner

/**
 * https://leetcode.com/explore/featured/card/the-leetcode-beginners-guide/692/challenge-problems/4423/
 * You are given an m x n int grid accounts where accounts[i][j] is the amount of money the ith
 * customer has in the jth bank. Return the wealth that the richest customer has. A customers wealth is the amount of
 * money they have in their bank accounts. The richest customer is the customer that has the maximum wealth.
 *
 * Constraints:
 * m == accounts.length
 * n == accounts[i].length
 * 1 <= m, n <= 50
 * 1 <= accounts[i][j] <= 100
 *
 * Time Complexity: O(n x m) to search over a 2D array
 * Space Complexity: O(1) because we have a hashmap
 */
class RichestCustomerWealth {
    // The key is the sum of the wealth, the Pair: Customer #, Bank accounts[]
    private val maxWealthLookupTable = HashMap<Int, Pair<Int, IntArray>>()

    /**
     * In my solution I could not think of a better way to search over this 2D array because the values were not sorted.
     * I added a lookup table to make future searches faster, you can just iterate over the keys to find the max wealth.
     * A sorted array could have been added to make this even faster but that would further slow down my initial search,
     * because I would be sorting an array, so I did not add it.
     */
    fun solution(accounts: Array<IntArray>): Int {
        var maxWealth = 1
        for (customerNum in accounts.indices) {
            var customerWealth = 0
            for (bankNum in accounts[customerNum].indices) {
                customerWealth += accounts[customerNum][bankNum]
            }
            maxWealthLookupTable[customerWealth] = Pair(customerNum, accounts[customerNum])
            // In the suggested solution, Math.max was used instead of an if statement. I think that's better, it's
            // easier to read.
            if (maxWealth < customerWealth) {
                maxWealth = customerWealth
            }
        }
        return maxWealth
    }

    fun displayOutput(maxWealth: Int): String {
        return "Output: $maxWealth"
    }
}
