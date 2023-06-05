package com.Brocamp;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class June5CheckIfNandItsDoubleExits1346 {

    /*

    1346. Check If N and Its Double Exist
            Easy

    Given an array arr of integers, check if there exist two indices i and j such that :

    i != j
0 <= i, j < arr.length
    arr[i] == 2 * arr[j]


    Example 1:

    Input: arr = [10,2,5,3]
    Output: true
    Explanation: For i = 0 and j = 2, arr[i] == 10 == 2 * 5 == 2 * arr[j]
    Example 2:

    Input: arr = [3,1,7,11]
    Output: false
    Explanation: There is no i and j that satisfy the conditions.


    Constraints:

            2 <= arr.length <= 500
            -103 <= arr[i] <= 103

     */

    public static void main(String[] args) {
        int[] arr = {10,2,5,3};

        System.out.println(checkIfExist(arr));
    }

    public static boolean checkIfExist(int[] arr) {

//        Set<Integer> set = new HashSet<Integer>();
//
//        for (int i = 0; i < arr.length; i++) {
//            set.add(arr[i]);
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//            if(set.contains(2*arr[i])){
//                return true;
//            }
//        }
//        return false;

//        Set<Integer> set = Arrays.stream(arr)
//                .boxed()
//                .collect(Collectors.toSet());
//
//        return Arrays.stream(arr)
//                .anyMatch(num -> set.contains(2*num));

        Set<Integer> set = new HashSet<>();
        int countZero = 0;

        for (int num : arr) {
            if (num == 0) {
                countZero++;
                if (countZero > 1) {
                    return true;
                }
            } else {
                set.add(num);
            }
        }

        for (int num : arr) {
            if (set.contains(2 * num)) {
                return true;
            }
        }

        return false;

    }


}
