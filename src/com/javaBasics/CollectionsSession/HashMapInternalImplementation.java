package com.javaBasics.CollectionsSession;
import java.util.Map;
import java.util.HashMap;

public class HashMapInternalImplementation {
    public static void main(String[] args){
        Map<String,Integer> marks = new HashMap<String,Integer>();
        marks.put("Naveen", 100);
        marks.put("Tom", 200);
        marks.put("Lisa", 300);
        marks.put("Peter", 400);
        marks.put("Robby", 600);


        marks.put(null, 500);

        //hashing: hashcode() --> hashing
        // hashcode of null key is 0
        // .equals method used to compare hashcode of key
        // when key given is already exist in HashMap then the value is replaced with new value
        // in Hash collision condition, i.e index of two or more nodes are same, nodes are joining by Linklist
        // when getting an objects with its key, Linked list is traversed until the key matches or null is found on next field
        // Time complexity is almost constant for put and get method until rehashing is not done
        // Threshold concept: JDK 8  - hash elements use balanced trees instead of -
        // Linked Lists after certain threshold is reached -- which improves performance from O(n) to O(log n)

        // initial capacity of HM is 16 --> 0 - 15, load FACTOR --> 0.75 ~ 75%

        System.out.println(marks.get("Lisa"));

        // hashcode of Lisa  ---210678
        // index 15
        // .equals method to check key name
        // Lisa
        // return value

        //https://www.youtube.com/watch?v=ZWbwqXzZDR0&list=PLFGoYjJG_fqooGAq7UKpkXb8l4xjyEQUr&index=9&ab_channel=NaveenAutomationLabs
        // different ways to create HashMap



    }
}
