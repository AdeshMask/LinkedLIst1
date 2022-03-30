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
            //System.out.println(data);
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

    public void pop() {
        head = head.next;
    }

    public void popLast() {
        Node temp = head;
        Node prevNode = null;
        while (temp.next != null) {
            prevNode = temp;
            temp = temp.next;
        }
        prevNode.next = null;
    }

    public void remove(int position) {
        Node temp = head;
        if (head == null)
            return;
        if (position == 0){
            head =temp.next;
            return;
        }
        for (int i = 0; temp != null && i < position-1;i++) {
            temp = temp.next;
            Node next = temp.next.next;
            temp.next =next;
        }
    }

    public int size() {
        Node temp=head;
        int count = 0;
        while(temp!=null)
        {
            temp=temp.next;
            count++;
        }
        return count;
    }
}
