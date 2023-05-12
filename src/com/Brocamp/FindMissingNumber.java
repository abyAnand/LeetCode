package com.Brocamp;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class FindMissingNumber {
    static Map<Integer, Integer> numberMap = new HashMap();

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,6};

        populateMap(arr);

        int missing = checkNumber(arr.length);

        System.out.println("Missing number is: "+ missing);

    }


    static void populateMap(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            numberMap.put(arr[i], i);
        }
    }

    static int checkNumber(int length){
        for (int i = 1; i <= length; i++) {
            if(!numberMap.containsKey(i)){
                return i;
            }
        }
        return -1;
    }

    LinkedList<String> ls = new LinkedList<>();


}
