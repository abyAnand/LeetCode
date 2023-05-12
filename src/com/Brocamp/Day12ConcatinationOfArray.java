package com.Brocamp;

import java.util.Arrays;

public class Day12ConcatinationOfArray {

    public static void main(String[] args) {

        int[] arr = {1, 2, 1};

        int n = arr.length;

        int[] ans = new int[arr.length * 2];

        for(int i = 0; i < n; i++) {
            ans[i] = ans[i + n] = arr[i];
        }

        System.out.println(Arrays.toString(ans));

    }
}
