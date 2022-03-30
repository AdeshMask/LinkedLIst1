package StackandQueue;

import com.bridgelabz.LinkedList;

public class Queue {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        System.out.println("**********UC3**********");
        list.push(56);      //here push performs enque operation
        list.push(30);
        list.push(70);
        list.display();
        System.out.println("\n**********UC4**********");
        list.popLast();     //popLast performs Dequeue operation on queue
        list.display();
    }
}
