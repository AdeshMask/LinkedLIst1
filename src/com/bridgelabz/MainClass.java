package com.bridgelabz;

public class MainClass {

    public static void main(String[] args) {
        System.out.println("************Linked List**********");
        LinkedList list = new LinkedList();
        //**********UC1*********
//        list.add(56);
//        list.add(30);
//        list.add(70);
//        list.add(45);
//        list.display();
        //*******UC2*******
//        list.push(70);
//        list.push(30);
//        list.push(56);
        //***********UC3*************
//        list.add(56);
//        list.add(30);
//        list.add(70);
        //list.insertAfter(70,99);
        //list.display();
        //list.pop();
//        list.display();
//        System.out.println();
//        list.popLast();
//        list.display();
//        list.search(30);
        list.add(56);
        list.add(30);
        list.add(70);
        list.insertAfter(30,40);
        list.display();


    }
}
