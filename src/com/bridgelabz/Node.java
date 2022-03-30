package com.bridgelabz;

public class Node<K> {
    Node<K> prevNode;
    K data;
    Node<K> next;

    Node(){

    }
    Node(K data){
        this.data = data;
    }
}
