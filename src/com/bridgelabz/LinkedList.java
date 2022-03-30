package com.bridgelabz;

public class LinkedList <K>{
    Node<K> head;
    Node<K> tail;

    public void add(K data) {
        Node<K> newNode = new Node(data);
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
        Node<K> temp = head;
        while (temp != null){
            System.out.print(temp.data+"=>");
            temp=temp.next;
        }
    }

    public void push(K data) {
        Node<K> newNode = new Node(data);
        if (head == null){
            head = newNode;
            tail = newNode;
        }
        else {
            newNode.next = head;
            head = newNode;
        }
    }
    public Node search(K data){
        Node<K> temp = head;
        while(temp != null){
            if(temp.data == data) {
                return temp;
            }
            temp = temp.next;
            //System.out.println(data);
        }
        return null;
    }

    public void insertAfter(K prevNodeData, K data) {
        Node<K> newNode = new Node(data);
        Node<K> searchedNode = this.search(prevNodeData);
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
        Node<K> temp = head;
        Node<K> prevNode = null;
        while (temp.next != null) {
            prevNode = temp;
            temp = temp.next;
        }
        prevNode.next = null;
    }

    public void remove(int position) {
        Node<K> temp = head;
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
