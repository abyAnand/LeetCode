package com.Brocamp;

import java.util.stream.IntStream;

public class June9RemoveOneElementToMakeTheArrayStrictlyIncreasing1909 {

    public static void main(String[] args) {

        int[] nums = {1,2,3,4};

        System.out.println(isStrictlyIncreasing(nums));
    }


    static boolean isStrictlyIncreasing(int[] nums) {
        long count = IntStream.range(1, nums.length)
                .filter(i -> nums[i] <= nums[i - 1])
                .count();

        return count < 1;
    }
}
