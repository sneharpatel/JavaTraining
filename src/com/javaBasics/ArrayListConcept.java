package com.javaBasics;

import java.util.ArrayList;

public class ArrayListConcept {
    public static void main(String[] args){
        ArrayList ar = new ArrayList();

        ar.add(100); // 0th index
        ar.add(200); // 1
        ar.add(300); // 2
        System.out.println(ar.size());

        ar.add(400); // 3
        ar.add(500); // 4
        ar.add(600); // 5
        ar.add("A"); // 6
        ar.add("Tom"); // 7
        ar.add("Hello"); // 8
        ar.add(12.33); // 9

        System.out.println(ar.size());

        ar.remove(9);
        System.out.println(ar.size());

        // to print all values in arraylist : use for loop
        for(int i=0; i<ar.size(); i++){
            System.out.println(ar.get(i));
        }

        // if arraylist restricted with only integer values then use following

        ArrayList<Integer> ar1 = new ArrayList<Integer>();
        ar1.add(100);

        // interview question: Array vs ArrayList

    }
}
