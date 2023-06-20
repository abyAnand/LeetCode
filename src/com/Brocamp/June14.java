package com.Brocamp;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class June14 {

    public static void main(String[] args) {

        String[] strs = {"flower","flow", "flight"};


    }

    public static String findCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        int shortestLength = Arrays.stream(strs)
                .mapToInt(String::length)
                .min()
                .orElse(0);

        StringBuilder prefix = new StringBuilder();
        boolean prefixMismatch = false;

        for (int i = 0; i < shortestLength && !prefixMismatch; i++) {
            final int index = i;
            char c = strs[0].charAt(index);

            boolean allMatch = Arrays.stream(strs)
                    .allMatch(s -> s.charAt(index) == c);

            if (allMatch) {
                prefix.append(c);
            } else {
                prefixMismatch = true;
            }
        }

        return prefix.toString();
    }


}
