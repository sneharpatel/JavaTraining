package com.javaBasics;

import java.util.Hashtable;

public class HashTableConcept {
    public static void main(String[] args){
        Hashtable ht = new Hashtable();

        ht.put("A", "Test");
        ht.put("B", "Hello");
        ht.put("C", "World");

        System.out.println(ht.size());
        System.out.println(ht.get("C"));

        ht.put(1, 100);
        ht.put(2, 200);
        System.out.println(ht.size());
        System.out.println(ht.get(2));

        ht.put(3, "Tom");

        // if restrict only for integer hashtable then declare with reference variables

        Hashtable<Integer, Integer> h = new Hashtable<Integer, Integer>();
        h.put(1,100);

        Hashtable<Integer, String> h1 = new Hashtable<Integer, String>();
        h1.put(1, "String");





    }
}
