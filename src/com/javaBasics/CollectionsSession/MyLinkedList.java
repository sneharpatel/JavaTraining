package com.javaBasics.CollectionsSession;

public class MyLinkedList {

    Node head;

    // Node class
    class Node {
         int data;
         Node next;

         //constructor
         Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public void printMyLinkedList(){
        Node n = head;
        while(n != null){
            System.out.println(n.data);
            n = n.next;
        }
    }
    public static void main(String[] args){
         MyLinkedList ll = new MyLinkedList();

         Node first_node = ll.new Node(10);
         ll.head = first_node;

         Node second_node = ll.new Node(20);
         first_node.next = second_node;

         Node third_node = ll.new Node(30);
         second_node.next = third_node;

         ll.printMyLinkedList();
    }
}
