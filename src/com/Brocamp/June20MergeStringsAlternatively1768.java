package com.Brocamp;

public class June20MergeStringsAlternatively1768 {

    public static void main(String[] args) {

        String word1 = "abc";
        String word2 = "pqr";

        System.out.println(mergeString(word1, word2));
    }

    public static String mergeString(String word1, String word2) {
        StringBuilder merged = new StringBuilder();
        int i = 0, j = 0;

        while (i < word1.length() || j < word2.length()) {
            if (i < word1.length())
                merged.append(word1.charAt(i++));

            if (j < word2.length())
                merged.append(word2.charAt(j++));
        }

        return merged.toString();
    }
}
