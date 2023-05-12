package com.Brocamp;

import java.util.Arrays;

public class Day8LeftRightSum {

    public static void main(String[] args) {
        int[] arr = {10,4,8,3};

        int totalSum = getTotalSum(arr);
        int[]  result = getLeftRightSum(arr, totalSum);

        for (int num : result) {
            System.out.println(num);
        }

    }


    static int[] getLeftRightSum(int[] arr, int totalSum) {
        int[] result = new int[arr.length];
        int leftSum = 0;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            int rightSum = totalSum - leftSum - arr[i];
            sum = leftSum - rightSum;
            result[i] = sum > 0? sum :sum* -1;
            leftSum += arr[i];
        }

        return result;
    }

    static int getTotalSum(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum;
    }
}
