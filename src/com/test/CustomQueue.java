package com.test;

public class CustomQueue {

    int[] data;

    Node head;

    Node tail;



    private  int  DEFAULT_SIZE = 10;


    int start = data[0];

     int end = 0;

     public CustomQueue(){
         data = new int[DEFAULT_SIZE];
     }

     public CustomQueue(int size){
         data = new int[size];
     }

     void enque(int value){

         Node node = new Node(value);
         if(head == null){
             head = node;
             tail = node;
         }
         else{
             tail.next = node;
             tail = node;
         }
     }

     public int deque(){
         int value  = head.value;
         head = head.next;
         return value;
     }


    private class Node {

        int value;
        Node next;


        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }

    }



}
