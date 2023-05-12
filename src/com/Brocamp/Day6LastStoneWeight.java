package com.Brocamp;

import java.util.Collections;
import java.util.PriorityQueue;

public class Day6LastStoneWeight {

    public static void main(String[] args) {
        int[] stones = {31,26,33,21,40};
        int lastStone = lastStoneWeight(stones);
        System.out.println("Last Stone Weight is: "+ lastStone);
    }

    public static int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int stone : stones) {
            maxHeap.offer(stone);
        }
        while (maxHeap.size() > 1){
            int x = maxHeap.poll();
            int y = maxHeap.poll();
            if(x != y){
                maxHeap.offer(Math.abs(x-y));
            }
        }
        return maxHeap.isEmpty()?0: maxHeap.poll();
    }

    }