package com.Brocamp;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class Day4FindStepsToMax {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6};
        int largest = arr[arr.length-1];

        int mid = arr[arr.length/2 ];


//        System.out.println("Total Steps : " + totalSetpsToMax(arr, mid));

//        System.out.println(findAverageSteps(arr, mid));

//        System.out.println(findAverageStepsWithoutAbs(arr, mid));

        System.out.println(lamdaAverage(arr, mid));
    }


    static int totalSetpsToMax(int[] arr, int largest){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count += Math.abs(arr[i] - largest);
        }
        return count;
    }

    static int findAverageSteps(int[] arr, int mid){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count += Math.abs(arr[i] - mid);
        }
        return count;
    }

    static int findAverageStepsWithoutAbs(int[] arr, int mid) {
        int count = 0;
        for (int num : arr) {
            int diff = num - mid;
            count += diff>0? diff : diff*-1;
        }
        return count;
    }

    static void findAverageStepsWithLambda(int[] arr, int mid) {
        AtomicInteger c2= new AtomicInteger();
        Arrays.stream(arr).forEach(a ->{
            int diff = a - mid;
            System.out.println(c2.addAndGet(diff > 0 ? diff : diff * -1));
        });
    }




    static int lamdaAverage(int[] arr, int mid) {
        return Arrays.stream(arr).map(num -> Math.abs(num - mid)).sum();
    }
}
