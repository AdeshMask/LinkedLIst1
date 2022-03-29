package com.bridgelabz;

public class LinkedList {
    Node head;
    Node tail;

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            tail = newNode;
        }
        else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void display() {
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data+"=>");
            temp=temp.next;
        }
    }

    public void push(int data) {
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            tail = newNode;
        }
        else {
            newNode.next = head;
            head = newNode;
        }
    }
    public Node search(int data){
        Node temp = head;
        while(temp != null){
            if(temp.data == data) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    public void insertAfter(int prevNodeData, int data) {
        Node newNode = new Node(data);
        Node searchedNode = this.search(prevNodeData);
        if( searchedNode!= null){
            Node tempNode = searchedNode.next;
            searchedNode.next = newNode;
            newNode.next = tempNode;
        }
    }
}
