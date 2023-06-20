package com.test;
public class BinarySearchTree {

    public class Node{

        int data;

        Node left, right;
    }

    Node root;


    public BinarySearchTree(){
        root = null;
    }

    public void insert(int value){
        insertHelper(root, value);
    }

    private Node insertHelper(Node root, int data){
        if(root == null){
            root.data = data;
        }

        if(data < root.data){
            root.left = insertHelper(root.left, data);
        } else if (data > root.data) {
            root.right = insertHelper(root.right, data);
        }

        return root;
    }

    public void inOrder(Node node){

        inOrder(node.left);
        System.out.println(node.data);
        inOrder(node.right);
    }



}
