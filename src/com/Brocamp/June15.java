package com.Brocamp;

import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.stream.Collector;
import java.util.stream.IntStream;

public class June15 {

    /*

    219. Contains Duplicate II

    Given an integer array nums and an integer k, return true if
    there are two distinct indices i and j in the array
    such that nums[i] == nums[j] and abs(i - j) <= k.



            Example 1:

    Input: nums = [1,2,3,1], k = 3
    Output: true
    Example 2:

    Input: nums = [1,0,1,1], k = 1
    Output: true
    Example 3:

    Input: nums = [1,2,3,1,2,3], k = 2
    Output: false


    Constraints:

            1 <= nums.length <= 105
            -109 <= nums[i] <= 109
            0 <= k <= 105


     */

    public static void main(String[] args) {

        int[] nums = {1,0,1,1};
        int k = 3;

        System.out.println(containsBoolean(nums, k));

    }


    static boolean containsBoolean(int[] nums, int k ) {

        return IntStream.range(0, nums.length)
                .anyMatch(i -> IntStream.range(i + 1, Math.min(i + k + 1, nums.length))
                        .anyMatch(j -> nums[i] == nums[j]));
    }

}
