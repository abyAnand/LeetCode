package com.Brocamp;

import java.util.Arrays;

public class Day3FindCommon {

    public static void main(String[] args) {

        int[] arr1 = {1,2,4,3,5};
        int[] arr2 = {5,6,7,8,1};

        int common[] = findCommon(arr1, arr2);

        Arrays.stream(common).forEach(System.out::print);

    }


    static int[] findCommon(int[] arr1, int[] arr2){

        int[] common = new int[Math.max(arr1.length, arr2.length)];
        int k = 0;
        for (int j : arr1) {
            boolean flag = false;
            for (int value : arr2) {
                if (j == value) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                common[k] = j;
            }
        }
        return common;
    }
}
