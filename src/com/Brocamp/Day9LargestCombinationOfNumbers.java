package com.Brocamp;

import java.util.Arrays;
import java.util.Collections;

public class Day9LargestCombinationOfNumbers{
    //leetcode 179

    public static void main(String[] args) {

    }

    public String largestNumber(int[] nums) {
        String[] s = new String[nums.length];
        for(int i=0; i<nums.length; i++)
            s[i] = String.valueOf(nums[i]);
        Arrays.sort(s, (a,b) -> (b + a).compareTo(a + b));

        return s[0].equals("0") ? "0" : String.join("",s);
    }
}
