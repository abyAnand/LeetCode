package com.Brocamp;

import java.util.HashSet;
import java.util.Set;

public class Day14DoNotAppearInArray {

    public static void main(String[] args) {

        int[] nums={4,3,2,7,8,2,3,1};

        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            nums[index] = nums[index] * -1;
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                System.out.println(i + 1);
            }
        }


//        for (int i = 0; i < nums.length; i++) {
//            int index = Math.abs(nums[i]) - 1;
//            nums[index] = -Math.abs(nums[index]);
//        }
//
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] > 0) {
//                System.out.println(i + 1);
//            }
//        }

//        int n = nums.length;
//
//        Set<Integer> set = new HashSet<>();
//        Set<Integer> numSet = new HashSet<>();
//
//        for (int num : nums) {
//            set.add(num);
//        }
//
//        for (int i = 1; i <=n; i++) {
//            if(!set.contains(i)){
//                numSet.add(i);
//            }
//        }
//
//        numSet.forEach(System.out::println);
   }


}
