package com.Brocamp;

public class Day11MissingNumber {

    public static void main(String[] args) {

        int[] arr = {3,0,1};

        int result = findMissingNumber( arr);
        System.out.println(result);

    }

    static int findMissingNumber(int[] arr){
        int actualSum = 0;
        int arrSum = 0;

        for (int i = 0; i <arr.length; i++) {
            actualSum += 1;
            arrSum += arr[i];
        }
        actualSum += arr.length;
        return actualSum- arrSum;
    }

}
