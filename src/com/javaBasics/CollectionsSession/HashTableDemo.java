package com.javaBasics.CollectionsSession;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo {
    public static void main(String[] args){

        //JDK 1.1 - Legacy collections API
        // <k,v>
        // HT is synchronized
        // it doesn't allow any null key and values
        // initial capacity of HT is = 11 (11 segments), load factor is 0.75 ~ 75%
        // hashcode("key") --> hashcode % 11 --> index

        Hashtable<String,Integer> marks = new Hashtable<>();
        marks.put("Tom", 100);
        marks.put("Peter", 200);
        marks.put("Lisa", 400);
        marks.put("Robby", 600);
        marks.put("Steve", 100);

        System.out.println(marks.get("Tom"));

        marks.put(null, 250); // null key is not allowed in hashtable - will give null-pointer exception
        System.out.println(marks.get(null));
        marks.put("Test",null);
        System.out.println(marks.get("Test")); // will give null-pointer exception


    }
}
