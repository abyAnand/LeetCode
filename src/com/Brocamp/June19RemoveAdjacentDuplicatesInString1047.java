package com.Brocamp;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class June19RemoveAdjacentDuplicatesInString1047 {

    public static void main(String[] args) {

        String s = "abbaca";

        System.out.println(removeAdjacentDuplicates(s));
    }

    static String removeAdjacentDuplicates(String s){

        StringBuilder u = new StringBuilder();

        Map<String, Integer> map = new HashMap<String, Integer>();

        for (int i = 0; i < s.length(); i++) {
            if(!map.containsKey(String.valueOf(s.charAt(i)))){
                map.put(String.valueOf(s.charAt(i)),1);
            }else{
                int val = map.get(String.valueOf(s.charAt(i)));
                if(val == 2){
                    map.remove(String.valueOf(s.charAt(i)));
                }
            }
        }
        for(String key : map.keySet()){
            u.append(key);
        }
        return u.toString();
    }
}
