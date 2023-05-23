package com.Brocamp;

import java.util.Arrays;
import java.util.stream.IntStream;

public class May23ShuffleTheArray1470 {

    /*

    1470. Shuffle the Array
            Easy

    Companies
    Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].

    Return the array in the form [x1,y1,x2,y2,...,xn,yn].



    Example 1:

    Input: nums = [2,5,1,3,4,7], n = 3
    Output: [2,3,5,4,1,7]
    Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].
    Example 2:

    Input: nums = [1,2,3,4,4,3,2,1], n = 4
    Output: [1,4,2,3,3,2,4,1]
    Example 3:

    Input: nums = [1,1,2,2], n = 2
    Output: [1,2,1,2]

     */

    public static void main(String[] args) {

        int[] nums = {1,1,2,2};
        int n = 2;

        int[] result = shuffle(nums, n);

        Arrays.stream(result).forEach(System.out::println);

    }

    static int[] shuffle(int[] nums, int n) {
//        int j = 0;
//        int k = 1;
//
//        int[] arr = new int[nums.length];
//
//        for (int i = 0; i < nums.length; i++) {
//            if(i<n){
//                arr[j] = nums[i];
//                j += 2;
//            }
//            else{
//                arr[k] = nums[i];
//                k += 2;
//            }
//        }
//        return arr;

        int[] arr = new int[nums.length];

        IntStream.range(0, nums.length)
                .forEach(i -> {
                    if (i < n) {
                        arr[i * 2] = nums[i];
                    } else {
                        arr[(i - n) * 2 + 1] = nums[i];
                    }
                });

        return arr;


    }
}
