package com.javaBasics.CollectionsSession;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {
    public static void main(String[] args){
        LinkedList<String> ll = new LinkedList<String>();

        // add method
        ll.add("tests");
        ll.add("Selenium");
        ll.add("qtp");
        ll.add("RFT");
        ll.add("RPA");

        //print all the values of linkedlist
        System.out.println("Content of LinkedList:" + ll);

        //addFirst method
        ll.addFirst("Java");
        //addLast method
        ll.addLast("Automation");

        System.out.println("Content of LinkedList:" + ll);

        //get method
        System.out.println(ll.get(0));

        //set method
        ll.set(0,"Tom");
        System.out.println(ll.get(0));

        //removeFirst & removeLast elements
        ll.removeFirst();
        ll.removeLast();
        System.out.println("Content of LinkedList:" + ll);


        ll.remove(2);
        System.out.println("Content of LinkedList:" + ll);

        // print all the elements of LL
        //1. for loop
        System.out.println("***** using for loop");
        for(int n=0; n<ll.size();n++){
            System.out.println(ll.get(n));
        }
        //2. advance for loop
        System.out.println("***** using advance for loop");
        for(String str : ll){
            System.out.println(str);
        }
        //3. iterator
        System.out.println("***** using iterator");
        Iterator<String> it = ll.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        //4. while loop
        System.out.println("***** using while loop");
        int num=0;
        while(ll.size()>num){
            System.out.println(ll.get(num));
            num++;
        }

    }
}
