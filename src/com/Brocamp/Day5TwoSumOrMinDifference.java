package com.Brocamp;

import java.util.HashSet;

public class Day5TwoSumOrMinDifference {

    public static void main(String[] args) {
        int[] arr = {-3,4,8,6,5};
        int target = 8;
        int minDiff = Integer.MAX_VALUE;
        int[] result = new int[2];

//        for (int num1 : arr) {
//            for (int num2 : arr) {
//                int sum = num1 + num2;
//                if (sum == target) {
//                    System.out.println(num1 + " , " + num2);
//                    return;
//                }
//                int diff = Math.abs(sum - target);
//                minDiff = diff < minDiff ? diff : minDiff;
//                result = diff < minDiff ? new int[] {num1, num2} : result;
//            }
//        }
//        System.out.println(result[0] + " , " + result[1]);
        HashSet<Integer> seen = new HashSet<>();

        for (int num : arr) {
            int diff = target - num;
            if (seen.contains(diff)) {
                // Found two numbers that sum to target
                System.out.println(num + " , " + diff);
                return;
            } else {
                seen.add(num);
                if (Math.abs(diff) < minDiff) {
                    minDiff = Math.abs(diff);
                    result[0] = num;
                    result[1] = diff;
                }
            }
        }
        System.out.println(result[0] + " , " + result[1]);
    }
}