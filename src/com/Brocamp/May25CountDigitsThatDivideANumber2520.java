package com.Brocamp;

public class May25CountDigitsThatDivideANumber2520 {

    /*

    2520. Count the Digits That Divide a Number
            Easy

    Companies
    Given an integer num, return the number of digits in num that divide num.

    An integer val divides nums if nums % val == 0.



    Example 1:

    Input: num = 7
    Output: 1
    Explanation: 7 divides itself, hence the answer is 1.
    Example 2:

    Input: num = 121
    Output: 2
    Explanation: 121 is divisible by 1, but not 2. Since 1 occurs twice as a digit, we return 2.
    Example 3:

    Input: num = 1248
    Output: 4
    Explanation: 1248 is divisible by all of its digits, hence the answer is 4.


     */

    public static void main(String[] args) {

        int num = 121;

        int result = countDigits(num);
        System.out.println(result);

    }

    static int countDigits(int num) {
//        int count = 0;
//        String numStr = String.valueOf(num);
//
//        for (int i = 0; i < numStr.length(); i++) {
//            int val = Integer.parseInt(String.valueOf(numStr.charAt(i)));
//            if(num % val == 0){
//                count += 1;
//            }
//        }
//
//        return count;

        int count = (int) String.valueOf(num)
                .chars()
                .map(Character::getNumericValue)
                .filter(val -> num % val == 0)
                .count();

        return count;
    }
}
