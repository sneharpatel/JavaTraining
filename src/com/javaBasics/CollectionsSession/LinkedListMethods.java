package com.javaBasics.CollectionsSession;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListMethods {
    public static void main(String[] args){

        // LL is a default class in Java
        //it can be used as a List, stack, queue,
        // It allows null entry
        // dynamic collection: hence insertion and deletion can be easily implemented
        // it can contain duplicate elements
        // it is not synchronized, so it's not thread safe
        // In LL manipulation is fast because we don't need any shifting

        // LL constructors: 1. LinkedList();, 2. LinkedList(Collection c)
        LinkedList<String> names = new LinkedList<String>();
        names.add("Tom");
        names.add("Naveen");
        names.add("Robby");
        names.add("Lisa");
        names.add("Tom"); // it allows duplicate

        System.out.println(names.size());
        System.out.println(names);

        Iterator<String> it = names.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        names.add(3,"Steve");
        names.add(2,"Ram");
        System.out.println(names);

        LinkedList<String> users = new LinkedList<String>();
        users.add("Peter");
        users.add("John");

        names.addAll(users);
        System.out.println(names);

        names.addFirst("Kim");
        System.out.println(names);

        names.addLast("Rayan");
        System.out.println(names);

        names.remove(2);
        System.out.println(names);

        names.removeAll(users);
        System.out.println(names);

        names.removeFirst();
        names.removeLast();
        System.out.println(names);

        names.clone();
        System.out.println(names);
        names.clear();
        System.out.println(names);


        LinkedList<String> lang = new LinkedList<String>();
        System.out.println(lang.size());
        lang.add("Java");
        lang.add("Python");
        lang.add("Ruby");
        lang.add("JavaScript");
        System.out.println(lang);

        // reverse the LinkedList
        Iterator<String> itr = lang.descendingIterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        for(String s: lang){
            System.out.println(s);
        }

        // sort the LinkedList
        Collections.sort(lang);
        System.out.println(lang);

    }
}
