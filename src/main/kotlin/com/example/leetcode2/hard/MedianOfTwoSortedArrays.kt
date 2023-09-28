import org.springframework.stereotype.Service

/**
 * Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
 *
 * The overall run time complexity should be O(log (m+n)).
 *
 * https://leetcode.com/problems/median-of-two-sorted-arrays/
 */
@Service
class MedianOfTwoSortedArrays {
    fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
        val sortedArray = getSortedArray(nums1, nums2)
        return if ((nums1.size + nums2.size) % 2 == 0) {
            this.getEvenValue(sortedArray)
        } else {
            this.getOddValue(sortedArray)
        }
    }

    /**
     * Merge Sort that sorts to half the combined length of the two arrays.
     * This is to save CPU as we only need to know the middle values of
     * the two arrays.
     */
    fun getSortedArray(nums1: IntArray, nums2: IntArray): IntArray {
        val sortedArray = IntArray(getSortedArraySize(nums1.size, nums2.size))
        var nums1Pointer = 0
        var nums2Pointer = 0
        for (index in sortedArray.indices) {
            // if both nums1Pointer and nums2Pointer are in bounds of the arrays, compare the values
            if (nums1Pointer <= nums1.size - 1 && nums2Pointer <= nums2.size - 1) {
                // If nums1[nums1Pointer] is smaller than nums2[nums2Pointer], we move nums1Pointer one place to the right.
                if (nums1[nums1Pointer] < nums2[nums2Pointer]) {
                    sortedArray[index] = nums1[nums1Pointer]
                    nums1Pointer++
                } else {
                    // Otherwise, we move nums2Pointer one place to the right
                    sortedArray[index] = nums2[nums2Pointer]
                    nums2Pointer++
                }
            // If p1 is outside nums1, just move nums2Pointer one place to the right.
            } else if (nums1Pointer > nums1.size - 1) {
                sortedArray[index] = nums2[nums2Pointer]
                nums2Pointer++
            } else if (nums2Pointer > nums2.size - 1) {
                // If nums2Pointer is outside nums2, just move nums1Pointer one place to the right.
                sortedArray[index] = nums1[nums1Pointer]
                nums1Pointer++
            }
        }
        return sortedArray
    }

    fun getEvenValue(sortedArray: IntArray): Double {
        return (sortedArray[sortedArray.size - 1].toDouble() + sortedArray[sortedArray.size - 2].toDouble()) / 2
    }

    fun getOddValue(sortedArray: IntArray): Double {
        return sortedArray[sortedArray.size - 1].toDouble()
    }

    fun getSortedArraySize(nums1Size: Int, nums2Size: Int): Int {
        return ((nums1Size + nums2Size) / 2) + 1
    }
}